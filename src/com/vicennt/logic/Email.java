package com.vicennt.logic;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * This class represent an Email object
 * @author vicent
 * 
 */
public class Email extends Message {

    protected ArrayList<String> quarantineList;
    protected String subject;

    // This constructor is prepared to create objects from JSON file
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

    /**
     * 
     * This method go through the msgBody and replace all the URL's
     * to <URL Quarantined>. The URL is saved in a quarantine list.
     */
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

    /**
     * This method check if the Email is well formed
     * @return true if it is an valid email
     */
    @Override
    public boolean validateMessage() {      
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (this.msgSender != null  && this.msgId != null &&
                this.msgBody != null && subject != null &&
                pat.matcher(this.msgSender).matches() &&
                subject.length() < 20 && this.msgBody.length() < 1028){
            return true;
        }else{
            return false;
        }
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

        return "Message ID: " + this.msgId + " \n"
                + "Sender: " + this.msgSender + " \n"
                + "Subject: " + this.subject + " \n"
                + "Body: \n" + this.msgBody + " \n"
                + "Quarantine List: [" + quarantine + "]";
    }

}
