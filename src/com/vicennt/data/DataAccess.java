package com.vicennt.data;

import com.sun.javafx.scene.control.skin.Utils;
import com.vicennt.logic.Message;
import com.vicennt.logic.Sms;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
        try{
            inputStream = new Scanner(file);
            String line = ""; 
            String[] lineSplited;
            while(inputStream.hasNextLine()){
                line = inputStream.nextLine();
                lineSplited = line.split(",");
                if(lineSplited.length > 2){ // There is comma or commas in value
                    String merge = "";
                    for(int i=1; i < lineSplited.length; i++)
                        merge += lineSplited[i];                       
                    abbreviations.put(lineSplited[0], merge);
                }else{
                    abbreviations.put(lineSplited[0], lineSplited[1]);
                }
            }

            return abbreviations;
        }catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void writeMessagesJSON(ArrayList<String> tweets, ArrayList<String> sms, ArrayList<String> emails, ArrayList<String> emailsSIr) {
         
    }

    @Override
    public ArrayList<String> readTweets() {
        //TODO: Read tweets from JSON
        return null;
    }

    @Override
    public ArrayList<String> readSms() {
        //TODO: Read sms from JSON
        return null;    }

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
