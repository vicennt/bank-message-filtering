package com.vicennt.logic;

import java.util.ArrayList;


/**
 *
 * @author vicent
 */
public class Email extends Message {
    protected ArrayList<String> quarantineList;
    protected String subject;
    
    public Email(String msgId, String msgSender, String msgBody, String subject){
        super(msgId, msgSender, msgBody);
        this.subject = subject;
        quarantineList = new ArrayList();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public void removeURLS(){
        String[] msgBodySplited = msgBody.split(" ");
        String msgResult = "";
        for(int i=0; i < msgBodySplited.length; i++){
            if(msgBodySplited[i].contains("http") || msgBodySplited[i].contains("https") ||
                    msgBodySplited[i].contains("www")){ // In this word there is @
                quarantineList.add(msgBodySplited[i]);
                msgResult += "<URL Quarantined>";
            }else{
                msgResult += msgBodySplited[i] + " ";
            }
        }
        this.msgBody = msgResult;
    }
    
    

    @Override
    public boolean validateMessage() {
        return true;
    }
    
        @Override
    public String toString() {
        String quarantine = "";
        for(String url : quarantineList){
            quarantine += "[" + url + "]";
        }
      
        return "[ID: " + this.msgId + "] \n" +
               "[Address: " + this.msgSender  + "] \n" +
               "[Subject: " + this.subject + "] \n" +
               "[Body: " + this.msgBody + "] \n" +
               "[Quarantine List: [" + quarantine + "]";
    }
    
}
