package com.vicennt.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SequenceWriter;
import com.vicennt.logic.Email;
import com.vicennt.logic.EmailSIR;
import com.vicennt.logic.Sms;
import com.vicennt.logic.Tweet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
        File file = new File("./iofiles/textwords.csv");
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
    public void writeMessagesJSON(ArrayList<Tweet> tweets, ArrayList<Sms> sms, ArrayList<Email> emails,
            ArrayList<EmailSIR> emailsSIr) {
        FileWriter fileWriter = null;
        try {
            File file = new File("./iofiles/messages_out.json");
            fileWriter = new FileWriter(file, true);
            ObjectMapper mapper = new ObjectMapper();
            SequenceWriter seqWriter = mapper.writer().writeValuesAsArray(fileWriter);
            seqWriter.write(sms);
            seqWriter.write(tweets);
            seqWriter.write(emails);
            seqWriter.write(emailsSIr);
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

    @Override
    public ArrayList<String> readTweets() {
        //TODO: Read tweets from JSON
        return null;
    }

    @Override
    public ArrayList<String> readSms() {
        //TODO: Read sms from JSON
        return null;
    }

    @Override
    public ArrayList<String> readEmails() {
        //TODO: Read emails from JSON
        return null;
    }

    @Override
    public ArrayList<String> readEmailsSIR() {
        //TODO: Read SIR emails from JSON
        return null;
    }
}
