/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vicennt.logic;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vicent
 */
public class Sms extends MessageAbbreviation {
    
    public Sms(String msgId, String msgSender, String msgBody, Map<String, String> abbreviationDic){
        super(msgId, msgSender, msgBody, abbreviationDic);
    }

    @Override
    public boolean validateMessage() {
        String regex = "^\\+[0-9]{1,3}\\.[0-9]{4,14}(?:x.+)?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(msgSender);
        return matcher.matches() && msgBody.length() <= 140;
    }

}
