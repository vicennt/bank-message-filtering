package com.vicennt.data;

import com.vicennt.logic.Message;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author vicent
 */

public interface IDataAccess {
    // All operation with data
    void writeMessagesToFile(ArrayList<Message> messages);
    ArrayList<Message> readMessagesFromFile();
    Map<String, String> getAbbreviations();
}
