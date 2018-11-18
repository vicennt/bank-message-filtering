package com.vicennt.logic;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 *
 * @author vicent
 */
public class Email extends Message {

    protected ArrayList<String> quarantineList;
    protected String subject;

    public Email(@JsonProperty(value = "msgId", access = JsonProperty.Access.READ_WRITE) String msgId,
            @JsonProperty(value = "msgSender", access = JsonProperty.Access.READ_WRITE) String msgSender,
            @JsonProperty(value = "msgBody", access = JsonProperty.Access.READ_WRITE) String msgBody,
            @JsonProperty(value = "subject", access = JsonProperty.Access.READ_WRITE) String subject) {
        super(msgId, msgSender, msgBody);
        this.subject = subject;
        quarantineList = new ArrayList();
        removeURLS();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void removeURLS() {
        String[] msgBodySplited = msgBody.split(" ");
        String msgResult = "";
        for (int i = 0; i < msgBodySplited.length; i++) {
            if (msgBodySplited[i].contains("http") || msgBodySplited[i].contains("https")
                    || msgBodySplited[i].contains("www")) { // In this word there is @
                quarantineList.add(msgBodySplited[i]);
                msgResult += "<URL Quarantined>";
            } else {
                msgResult += msgBodySplited[i] + " ";
            }
        }
        this.msgBody = msgResult;
    }

    @Override
    public boolean validateMessage() {
        return true;
    }

    public ArrayList<String> getQuarantineList() {
        return quarantineList;
    }

    public void setQuarantineList(ArrayList<String> quarantineList) {
        this.quarantineList = quarantineList;
    }
    
    

    @Override
    public String toString() {
        String quarantine = "";
        for (String url : quarantineList) {
            quarantine += "[" + url + "]";
        }

        return "[ID: " + this.msgId + "] \n"
                + "[Address: " + this.msgSender + "] \n"
                + "[Subject: " + this.subject + "] \n"
                + "[Body: " + this.msgBody + "] \n"
                + "[Quarantine List: [" + quarantine + "]";
    }

}
