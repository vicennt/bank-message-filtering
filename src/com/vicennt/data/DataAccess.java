package com.vicennt.data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SequenceWriter;
import com.vicennt.constants.Constants;
import com.vicennt.logic.Email;
import com.vicennt.logic.EmailSIR;
import com.vicennt.logic.Sms;
import com.vicennt.logic.Tweet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vicent
 */
public class DataAccess implements IDataAccess {

    @Override
    public Map<String, String> getAbbreviations() {
        File file = new File(Constants.PATH_TO_ABBREVIATION);
        Scanner inputStream;
        Map<String, String> abbreviations = new HashMap<String, String>();
        try {
            inputStream = new Scanner(file);
            String line = "";
            String[] lineSplited;
            while (inputStream.hasNextLine()) {
                line = inputStream.nextLine();
                lineSplited = line.split(",");
                if (lineSplited.length > 2) { // There is comma or commas in value
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

    @Override
    public void writeMessages(ArrayList t, String filename) {
        FileWriter fileWriter = null;
        try {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyy_HH:mm:ss");
            File file = new File(filename + dateFormat.format(date) + ".json");
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
