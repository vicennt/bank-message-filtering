package com.vicennt.data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vicennt.constants.Constants;
import com.vicennt.logic.Email;
import com.vicennt.logic.EmailSIR;
import com.vicennt.logic.Sms;
import com.vicennt.logic.Tweet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementation of IDataAccess interface
 * @author vicent
 * 
 */
public class DataAccess implements IDataAccess {
    
    
    /**
    * This method reads a CSV file with some abbreviations and creates a Map 
    * with the relationship between acronyms and the full text
    * @return Map with the relation between acronyms and full text
    */
    @Override
    public Map<String, String> getAbbreviations() {
        Path currentRelativePath = Paths.get("");
        String c = currentRelativePath.toAbsolutePath().toString();
        File file = null;
        if(System.getProperty("os.name").contains("Linux")){
            file = new File(Constants.PATH_TO_ABBREVIATION_LINUX);
        }else if (System.getProperty("os.name").contains("Windows")) {
            file = new File(c + Constants.PATH_TO_ABBREVIATION_WIN);
        }
        
        Scanner inputStream;
        Map<String, String> abbreviations = new HashMap<String, String>();
        try {
            inputStream = new Scanner(file);
            String line = "";
            String[] lineSplited;
            while (inputStream.hasNextLine()) {
                line = inputStream.nextLine();
                lineSplited = line.split(",");
                // Control if the full text has commas
                if (lineSplited.length > 2) { // 
                    String merge = "";
                    for (int i = 1; i < lineSplited.length; i++) {
                        merge += lineSplited[i];
                    }
                    abbreviations.put(lineSplited[0], merge);
                } else {
                    abbreviations.put(lineSplited[0], lineSplited[1]);
                }
            }

            return abbreviations;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    * This method reads tweets from JSON file 
    * and convert them to an ArrayList with Tweet objects
    * @param filename name of the file
     * @return 
    */
    @Override
    public ArrayList<Tweet> readTweets(String filename) {
        try {
            File file = new File(filename);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(file, new TypeReference<ArrayList<Tweet>>() {
            });
        } catch (IOException ex) {
            return null;
        }
    }
    
    /**
    * This method reads sms from JSON file 
    * and convert them to an ArrayList with SMS objects
    * @param filename name of the file
    */
    @Override
    public ArrayList<Sms> readSms(String filename) {
        try {
            File file = new File(filename);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(file, new TypeReference<ArrayList<Sms>>() {
            });
        } catch (IOException ex) {
            return null;
        }
    }
    
    /**
    * This method reads emails from JSON file 
    * and convert them to an ArrayList with Email objects
    * @param filename name of the file
    */
    @Override
    public ArrayList<Email> readEmails(String filename) {
        try {
            File file = new File(filename);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(file, new TypeReference<ArrayList<Email>>() {
            });
        } catch (IOException ex) {
            return null;
        }
    }

    /**
    * This method reads SIR emails from JSON file 
    * and convert them to an ArrayList with EmailSIR objects
    * @param filename name of the file
    */
    @Override
    public ArrayList<EmailSIR> readEmailsSIR(String filename) {
        try {
            File file = new File(filename);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(file, new TypeReference<ArrayList<EmailSIR>>() {
            });
        } catch (IOException ex) {
            return null;
        }
    }
    
    /**
    * This method write objects in a specific file
    * @param t This array list contains objects that are going to write in a file
    * @param filename path of the file
    */

    @Override
    public void writeMessages(ArrayList t, String path) {
        FileWriter fileWriter = null;
        try {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyHHmmss");
            // Create a filename with current date and hour
            String filename = dateFormat.format(date) + ".json";
            File file = new File(path, filename);
            fileWriter = new FileWriter(file);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, t);
        } catch (IOException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
