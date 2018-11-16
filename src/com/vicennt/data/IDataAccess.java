package com.vicennt.data;

import com.vicennt.logic.Message;
import com.vicennt.logic.Sms;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author vicent
 */

public interface IDataAccess {
    // All operation with data
    Map<String, String> getAbbreviations();
}
