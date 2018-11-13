/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vicennt.data;

import com.vicennt.logic.Abbreviation;
import com.vicennt.logic.Message;
import java.util.ArrayList;

/**
 *
 * @author vicent
 */
public class DataAccess implements IDataAccess {

    @Override
    public void writeMessagesToFile(ArrayList<Message> messages) {
        
    }

    @Override
    public ArrayList<Message> readMessagesFromFile() {
        return null;
    }

    @Override
    public ArrayList<Abbreviation> getAbbreviations() {
        return null;
    }
    
}
