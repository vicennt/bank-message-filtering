package com.vicennt.logic;

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

    @Override
    public boolean validateMessage() {
        return true;
    }
    
    public ArrayList<String> getHashtags(){
        String[] wordsTweet = msgBody.split(" ");
        for(int i = 0; i < wordsTweet.length; i++){
            if(wordsTweet[i].charAt(0) == '#'){
                // Only one appearance in each tweet
                if(!hashtags.contains(wordsTweet[i])){
                    hashtags.add(wordsTweet[i]);
                }
            }
        }
        return this.hashtags;
    }
    
    public ArrayList<String> getMentions(){
        String[] wordsTweet = msgBody.split(" ");
        for(int i = 0; i < wordsTweet.length; i++){
            if(wordsTweet[i].charAt(0) == '@'){
                mentions.add(wordsTweet[i]);
            }
        }
        return this.mentions;
    }
    
}
