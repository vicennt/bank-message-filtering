package com.vicennt.data;

import com.vicennt.logic.Message;
import com.vicennt.logic.Sms;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author vicent
 */

public interface IDataAccess {
    // All operation with data
    Map<String, String> getAbbreviations();
    void writeMessagesJSON(ArrayList<String> tweets,ArrayList<String> sms,
            ArrayList<String> emails,ArrayList<String> emailsSIr);
    ArrayList<String> readTweets();
    ArrayList<String> readSms();
    ArrayList<String> readEmails();
    ArrayList<String> readEmailsSIR();
}
