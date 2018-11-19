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
    ArrayList<Tweet> readTweets();
    ArrayList<Sms> readSms();
    ArrayList<Email> readEmails();
    ArrayList<EmailSIR> readEmailsSIR();
    void writeMessages(ArrayList t, String filename);
}
