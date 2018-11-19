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

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getMsgSender() {
        return msgSender;
    }

    public void setMsgSender(String msgSender) {
        this.msgSender = msgSender;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }
    
    @Override
    public String toString() {
        return "Message ID: " + this.msgId + " \n" +
               "Sender: " + this.msgSender  + " \n" +
               "Body:  \n" + this.msgBody + "";
    }
    
}
