package com.vicennt.logic;

/**
 *
 * @author vicent
 */
public class EmailSIR extends Email {
    private String sortCode;
    private String natureIncident;

    public EmailSIR(String msgId, String msgSender, String msgBody,
            String subject, String sortCode, String natureIncident) {
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

    @Override
    public String toString() {
        return "[ID: " + this.msgId + "] \n" +
               "[Address: " + this.msgSender  + "] \n" +
               "[Subject: " + this.subject + "] \n" +
               "[Sort code: " + this.sortCode + "] \n" +
               "[Nature of Incident: " + this.natureIncident + "] \n" +
               "[Body: " + this.msgBody + "] \n";
    } 
}
