package com.vicennt.data;

import com.vicennt.logic.Message;
import java.util.ArrayList;
import java.util.Map;

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
    public Map<String, String> getAbbreviations() {
        return null;
    }
    
}
