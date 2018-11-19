package com.vicennt.logic;

import com.vicennt.data.IDataAccess;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.toMap;

/**
 * Implementation of INapierBankService interface
 * @author vicent
 */

public class NapierBankService implements INapierBankService {

    private ArrayList<Tweet> tweets;
    private ArrayList<Sms> sms;
    private ArrayList<Email> emails;
    private ArrayList<EmailSIR> sirEmails;
    private Map<String, Integer> stadisticsHashtag;
    private IDataAccess dal;

    public NapierBankService(IDataAccess dal) {
        this.dal = dal;
        tweets = new ArrayList();
        sms = new ArrayList();
        emails = new ArrayList();
        sirEmails = new ArrayList();
        stadisticsHashtag = new HashMap();
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
    public void addSir(EmailSIR es) {
        this.sirEmails.add(es);
    }

    @Override
    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    @Override
    public ArrayList<Sms> getSms() {
        return sms;
    }

    @Override
    public ArrayList<Email> getEmails() {
        return emails;
    }

    @Override
    public ArrayList<EmailSIR> getSirEmails() {
        return sirEmails;
    }


    @Override
    public Map<String, String> getAbbreviations() {
        return dal.getAbbreviations();
    }
    
    /**
     * This method get all the hashtags from the tweets and
     * count how many appearances of each there are
     * @return list an ordered list 
     */
    @Override
    public ArrayList<String> calculateTrendings() {
        ArrayList<String> hashList = new ArrayList();
        if (!tweets.isEmpty()) {
            // Get all hashtags and put in a Map with the number of appearances
            for (int i = 0; i < tweets.size(); i++) {
                ArrayList<String> hashtags = tweets.get(i).getHashtags();
                for (int j = 0; j < hashtags.size(); j++) {
                    // If the hashtag exist in the map the counter is incrementd
                    if (stadisticsHashtag.containsKey(hashtags.get(j))) {
                        Integer count = stadisticsHashtag.get(hashtags.get(j));
                        stadisticsHashtag.put(hashtags.get(j), ++count);
                    } else { // If not, counter = 1
                        stadisticsHashtag.put(hashtags.get(j), 1);
                    }
                }
            }

            // Sort hastagMap by value
            Map<String, Integer> hashtagSorted = stadisticsHashtag
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(
                            toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                                    LinkedHashMap::new));
            // Create descending sortest String list in order to create trending list
            for (String key : hashtagSorted.keySet()) {
                hashList.add(key + " (" + stadisticsHashtag.get(key) + " Tweets)");
            }

        } else {
            hashList.add("There aren't tweets!");
        }
                
        if(hashList.isEmpty()) 
            hashList.add("There aren't hashtags!");
        
        return hashList;
    }
    
    /**
     * This method go through all tweets and get the mentions
     * @return list with all mentions
     */

    @Override
    public ArrayList<String> getMentionList() {
        ArrayList<String> mentionList = new ArrayList();
        if (!tweets.isEmpty()) {
            for (int i = 0; i < tweets.size(); i++) {
                for (int j = 0; j < tweets.get(i).getMentions().size(); j++) {
                    mentionList.add(tweets.get(i).getMentions().get(j));
                }
            }
        } else {
            mentionList.add("There aren't tweets!");
        }
                
        if(mentionList.isEmpty()) 
            mentionList.add("There aren't mentions!");
        return mentionList;
    }

    @Override
    public ArrayList<String> getSIRList() {
        ArrayList<String> sirList = new ArrayList();
        if (!sirEmails.isEmpty()) {
            for (int i = 0; i < this.sirEmails.size(); i++) {
                sirList.add(sirEmails.get(i).getSortCode() + " ("
                        + sirEmails.get(i).getNatureIncident() + ")");
            }
        }else{
            sirList.add("There aren't SIR emails!");
        }
        return sirList;
    }

    /**
     * 
     * @return number of messages in the system
     */
    @Override
    public int getNumberOfMessages() {
        return tweets.size() + sms.size() + emails.size() + sirEmails.size();
    }

    @Override
    public ArrayList<Tweet> readTweets(String filename) {
        ArrayList<Tweet> tweetsJSON = dal.readTweets(filename);
        for(Tweet t : tweetsJSON){
            t.getHashtags();
            t.getMentions();
            this.tweets.add(t);
        }
        return tweetsJSON;
    }

    @Override
    public ArrayList<Sms> readSms(String filename) {
        ArrayList<Sms> smsJSON = dal.readSms(filename);
        for(Sms s : smsJSON){
            this.sms.add(s);
        }
        return smsJSON;
    }

    @Override
    public ArrayList<Email> readEmails(String filename) {
        return dal.readEmails(filename);
    }

    @Override
    public ArrayList<EmailSIR> readSir(String filename) {
        
        return dal.readEmailsSIR(filename);
    }

    @Override
    public void writeMessages(ArrayList t, String filename) {
        dal.writeMessages(t, filename);
    }
}
