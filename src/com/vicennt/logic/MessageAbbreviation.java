package com.vicennt.logic;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author vicent
 */

public abstract class MessageAbbreviation extends Message {
    private Map<String, String> abbreviationDic; 
    public MessageAbbreviation(String msgId, String msgSender, String msgBody, 
            Map<String, String> abbreviationDic){
        super(msgId, msgSender, msgBody);
        this.abbreviationDic = abbreviationDic;
    }
    public String replaceAbbreviations(){
        String[] msgBodySplited = msgBody.split(" ");
        String msgResult = "";
        for(int i=0; i < msgBodySplited.length; i++){
            if(abbreviationDic.containsKey(msgBodySplited[i])){
                msgResult += msgBodySplited[i] + " <" + abbreviationDic.get(msgBodySplited[i]) + "> ";
            }else{
                msgResult += msgBodySplited[i] + " ";
            }
        }
        return msgResult;
    }
}
