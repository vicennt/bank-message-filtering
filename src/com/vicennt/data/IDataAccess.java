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
    void writeMessagesJSON(ArrayList<Tweet> tweets, ArrayList<Sms> sms, ArrayList<Email> emails,
            ArrayList<EmailSIR> emailsSIr);
    ArrayList<String> readTweets();
    ArrayList<String> readSms();
    ArrayList<String> readEmails();
    ArrayList<String> readEmailsSIR();
}
