package com.vicennt.logic;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author vicent
 */
public interface INapierBankService {
    void addTweet(Tweet t);
    void addSMS(Sms s);
    void addEmail(Email m);
    void addEmailSir(EmailSIR es);
    ArrayList<String> calculateTrendings();
    ArrayList<Tweet> getTweets();
    ArrayList<Sms> getSms();
    ArrayList<Email> getEmails();
    ArrayList<EmailSIR> getSirEmails();
    void writeMessagesJSON();
    Map<String, String> getAbbreviations();
    void loadMessages();
}
