/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vicennt.logic;

/**
 *
 * @author vicent
 */
public abstract class Message {
    protected String msgId;
    protected String msgSender;
    protected String msgBody;    
    public Message(String msgId, String msgSender, String msgBody){
        this.msgId = msgId;
        this.msgSender = msgSender;
        this.msgBody = msgBody;
    }
    public abstract boolean validateMessage();
}
