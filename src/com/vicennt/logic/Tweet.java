package com.vicennt.logic;

import java.util.Map;
/**
 *
 * @author vicent
 */
public class Tweet extends MessageAbbreviation {

    public Tweet(String msgId, String msgSender, String msgBody, Map<String, String> abbreviationDic) {
        super(msgId, msgSender, msgBody, abbreviationDic);
    }

    @Override
    public boolean validateMessage() {
        return true;
    }
    
}
