package com.vicennt.logic;

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
    Map<String, String> getAbbreviations();
    void loadMessages();
}
