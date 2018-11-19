package com.vicennt.logic;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author vicent
 */
public class Tweet extends MessageAbbreviation {

    ArrayList<String> hashtags;
    ArrayList<String> mentions;

    public Tweet(String msgId, String msgSender, String msgBody, Map<String, String> abbreviationDic) {
        super(msgId, msgSender, msgBody, abbreviationDic);
        hashtags = new ArrayList<>();
        mentions = new ArrayList<>();
    }

    public Tweet(String msgId, String msgSender, String msgBody) {
        super(msgId, msgSender, msgBody);
        hashtags = new ArrayList<>();
        mentions = new ArrayList<>();
        getHashtags();
        getMentions();
    }
     
    public Tweet(@JsonProperty(value = "msgId", access = JsonProperty.Access.READ_WRITE) String msgId,
            @JsonProperty(value = "msgSender", access = JsonProperty.Access.READ_WRITE) String msgSender,
            @JsonProperty(value = "msgBody", access = JsonProperty.Access.READ_WRITE) String msgBody,
            @JsonProperty(value = "hashtags", access = JsonProperty.Access.READ_WRITE) ArrayList<String> hashtags,
            @JsonProperty(value = "mentions", access = JsonProperty.Access.READ_WRITE) ArrayList<String> mentions) {
        super(msgId, msgSender, msgBody);
        this.hashtags = hashtags;
        this.mentions = mentions;
    }
    

    @Override
    public boolean validateMessage() {
        if(this.msgId != null && this.msgSender != null && this.msgBody != null &&
                this.msgSender.length() < 15 && this.msgBody.length() < 140){
            return true;
        }else{
            return false;
        }
    }
        
    
    

    public ArrayList<String> getHashtags() {
        String[] wordsTweet = msgBody.split(" ");     
        for (int i = 0; i < wordsTweet.length; i++) {
            if (wordsTweet[i].length() > 0 && wordsTweet[i].charAt(0)== '#') {
                // Only one appearance in each tweet
                if (!hashtags.contains(wordsTweet[i])) {
                    hashtags.add(wordsTweet[i]);
                }
            }
        }
        return this.hashtags;
    }

    public ArrayList<String> getMentions() {
        String[] wordsTweet = msgBody.split(" ");
        for (int i = 0; i < wordsTweet.length; i++) {
            if (wordsTweet[i].length() > 0 && wordsTweet[i].charAt(0) == '@') {
                // Only one appearance in each tweet
                if (!mentions.contains(wordsTweet[i])) {
                    mentions.add(wordsTweet[i]);
                }
            }
        }
        return this.mentions;
    }

    public void setHashtags(ArrayList<String> hashtags) {
        this.hashtags = hashtags;
    }

    public void setMentions(ArrayList<String> mentions) {
        this.mentions = mentions;
    }

    @Override
    public String toString() {
        String men = "";
        String has = "";
        for (String s : mentions) {
            men += s + ",";
        }
        for (String x : hashtags) {
            has += x + ",";
        }
        return "[ID: " + this.msgId + "] \n"
                + "[User: " + this.msgSender + "] \n"
                + "[Body: " + this.msgBody + "] \n"
                + "[Hashtags: [" + has + "]] \n"
                + "[Mentions: [" + men + "]]";
    }

}
