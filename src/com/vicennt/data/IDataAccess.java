package com.vicennt.data;

import com.vicennt.logic.Abbreviation;
import com.vicennt.logic.Message;
import java.util.ArrayList;

/**
 *
 * @author vicent
 */

public interface IDataAccess {
    // All operation with data
    void writeMessagesToFile(ArrayList<Message> messages);
    ArrayList<Message> readMessagesFromFile();
    ArrayList<Abbreviation> getAbbreviations();
}
