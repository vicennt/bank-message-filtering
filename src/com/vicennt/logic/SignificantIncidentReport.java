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
public class SignificantIncidentReport extends Email {
    private String sortCode;
    private String natureIncident;

    public SignificantIncidentReport(String msgId, String msgSender, String msgBody) {
        super(msgId, msgSender, msgBody);
    }
}
