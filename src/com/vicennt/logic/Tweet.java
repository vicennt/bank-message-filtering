package com.vicennt.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author vicent
 */
public class Tweet extends MessageAbbreviation {
    
    Map<String, Integer> hashtags;
    ArrayList<String> mentions;

    public Tweet(String msgId, String msgSender, String msgBody, Map<String, String> abbreviationDic) {
        super(msgId, msgSender, msgBody, abbreviationDic);
        hashtags = new HashMap<>();
        mentions = new ArrayList<>();
    }

    @Override
    public boolean validateMessage() {
        return true;
    }
    
    public Map<String, Integer> getHashtags(){
        String[] wordsTweet = msgBody.split(" ");
        for(int i = 0; i < wordsTweet.length; i++){
            if(wordsTweet[i].charAt(0) == '#'){
                if(hashtags.containsKey(wordsTweet[i])){
                    Integer count = hashtags.get(wordsTweet[i]);
                    hashtags.put(wordsTweet[i], ++count);
                }else{
                    hashtags.put(wordsTweet[i], 1); 
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
