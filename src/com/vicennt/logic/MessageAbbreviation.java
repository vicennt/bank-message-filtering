package com.vicennt.logic;

import java.io.Serializable;
import java.util.Map;

/**
 * This class represent an Message with abbreviations
 * @author vicent
 */

public abstract class MessageAbbreviation extends Message {
    
    private Map<String, String> abbreviationDic; 
    
    public MessageAbbreviation(String msgId, String msgSender, String msgBody, 
            Map<String, String> abbreviationDic){
        super(msgId, msgSender, msgBody);
        this.abbreviationDic = abbreviationDic;
    }
    
    public MessageAbbreviation(String msgId, String msgSender, String msgBody){
        super(msgId, msgSender, msgBody);
    }
    
    /**
     * This method go through the body of message and replace the abbreviation 
     * to the full text
     */  
    public void replaceAbbreviations(){
        String[] msgBodySplited = msgBody.split(" ");
        String msgResult = "";
        for(int i=0; i < msgBodySplited.length; i++){
            if(msgBodySplited[i].length() > 0 && abbreviationDic.containsKey(msgBodySplited[i])){
                msgResult += msgBodySplited[i] + " <" + abbreviationDic.get(msgBodySplited[i]) + "> ";
            }else{
                msgResult += msgBodySplited[i] + " ";
            }
        }
        this.msgBody = msgResult;
    }
}
