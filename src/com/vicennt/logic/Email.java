/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vicennt.logic;

import java.util.ArrayList;

/**
 *
 * @author vicent
 */
public class Email extends Message {
    private String subject;
    
    public Email(String msgId, String msgSender, String msgBody){
        super(msgId, msgSender, msgBody);
    }

    @Override
    public boolean validateMessage() {
        return true;
    }
}
