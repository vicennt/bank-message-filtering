package com.vicennt.logic;

import com.vicennt.data.IDataAccess;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author vicent
 */
public class NapierBankService implements INapierBankService {
    
    ArrayList<Tweet> tweets;
    ArrayList<Sms> sms;
    ArrayList<Email> emails;
    ArrayList<EmailSIR> sirEmails;
    
    
    private IDataAccess dal;
    public NapierBankService(IDataAccess dal){
        this.dal = dal;
        tweets = new ArrayList();
        sms = new ArrayList();
        emails = new ArrayList();
        sirEmails = new ArrayList();
        
    }
    
    @Override
    public void addTweet(Tweet t) {
        this.tweets.add(t);
    }

    @Override
    public void addSMS(Sms s) {
        this.sms.add(s);
    }

    @Override
    public void addEmail(Email m) {
        this.emails.add(m);
    }

    @Override
    public void addEmailSir(EmailSIR es) {
        this.sirEmails.add(es);
    }

    @Override
    public void loadMessages() {
    }
    
     @Override
    public void writeMessagesJSON() {
        
    }

    @Override
    public Map<String, String> getAbbreviations() {
        return dal.getAbbreviations();
    }   
}
