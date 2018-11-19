package com.vicennt.logic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represent an EmailSIR object
 * @author vicent
 */
public class EmailSIR extends Email {

    private String sortCode;
    private String natureIncident;

    // This constructor is prepared to create objects from JSON file
    public EmailSIR(@JsonProperty(value = "msgId", access = JsonProperty.Access.READ_WRITE) String msgId,
            @JsonProperty(value = "msgSender", access = JsonProperty.Access.READ_WRITE) String msgSender,
            @JsonProperty(value = "msgBody", access = JsonProperty.Access.READ_WRITE) String msgBody,
            @JsonProperty(value = "subject", access = JsonProperty.Access.READ_WRITE) String subject,
            @JsonProperty(value = "sortCode", access = JsonProperty.Access.READ_WRITE) String sortCode,
            @JsonProperty(value = "natureIncident", access = JsonProperty.Access.READ_WRITE) String natureIncident) {
        super(msgId, msgSender, msgBody, subject);
        this.sortCode = sortCode;
        this.natureIncident = natureIncident;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getNatureIncident() {
        return natureIncident;
    }

    public void setNatureIncident(String natureIncident) {
        this.natureIncident = natureIncident;
    }

     /**
     * This method check if the Email is well formed
     * @return true if it is an valid SIR email
     */
    @Override
    public boolean validateMessage() {
        return super.validateMessage() && sortCode != null && 
                natureIncident != null;
    }
    
   
    @Override
    public String toString() {
        return "Message ID: " + this.msgId + " \n"
                + "Sender: " + this.msgSender + " \n"
                + "Subject: " + this.subject + " \n"
                + "Sort code: " + this.sortCode + " \n"
                + "Nature of Incident: " + this.natureIncident + " \n"
                + "Body: \n" + this.msgBody + " \n"
                + "Quarantine List: [" + quarantineList + "]";
    }
}
