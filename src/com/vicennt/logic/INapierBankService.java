package com.vicennt.logic;

import java.util.ArrayList;
import java.util.Map;

/**
 * Interface for the logical layer
 * @author vicent
 */
public interface INapierBankService {    
    ArrayList<Tweet> readTweets(String filename);
    ArrayList<Sms> readSms(String filename);
    ArrayList<Email> readEmails(String filename);
    ArrayList<EmailSIR> readSir(String filename);
    
    void addTweet(Tweet t);
    void addSMS(Sms s);
    void addEmail(Email m);
    void addSir(EmailSIR es);
    
    ArrayList<String> calculateTrendings();
    ArrayList<String> getMentionList();
    ArrayList<String> getSIRList();
    ArrayList<Tweet> getTweets();
    ArrayList<Sms> getSms();
    ArrayList<Email> getEmails();
    ArrayList<EmailSIR> getSirEmails();
    int getNumberOfMessages();
    Map<String, String> getAbbreviations();
    
    void writeMessages(ArrayList t, String filename);
}
