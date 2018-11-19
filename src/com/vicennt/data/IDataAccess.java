package com.vicennt.data;

import com.vicennt.logic.Email;
import com.vicennt.logic.EmailSIR;
import com.vicennt.logic.Sms;
import com.vicennt.logic.Tweet;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author vicent
 */

public interface IDataAccess {
    // All operation with data
    Map<String, String> getAbbreviations();
    ArrayList<Tweet> readTweets(String filename);
    ArrayList<Sms> readSms(String filename);
    ArrayList<Email> readEmails(String filename);
    ArrayList<EmailSIR> readEmailsSIR(String filename);
    void writeMessages(ArrayList t, String filename);
}
