package com.vicennt.logic;

import com.vicennt.data.IDataAccess;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.toMap;

/**
 *
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
    public void addEmailSir(EmailSIR es) {
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
    public void loadMessages() {
    }

    @Override
    public void writeMessagesJSON() {

    }

    @Override
    public Map<String, String> getAbbreviations() {
        return dal.getAbbreviations();
    }

    @Override
    public ArrayList<String> calculateTrendings() {
        ArrayList<String> result = new ArrayList();
        if (!tweets.isEmpty()) {
            for (int i = 0; i < tweets.size(); i++) {
                ArrayList<String> hashtags = tweets.get(i).getHashtags();
                for (int j = 0; j < hashtags.size(); j++) {
                    if (stadisticsHashtag.containsKey(hashtags.get(j))) {
                        Integer count = stadisticsHashtag.get(hashtags.get(j));
                        stadisticsHashtag.put(hashtags.get(j), ++count);
                    } else {
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
            for (String key : hashtagSorted.keySet())
                result.add(key + " ("+ stadisticsHashtag.get(key) + " Tweets)");

        } else {
            result.add("There aren't tweets!");
        }
        return result;
    }
}
