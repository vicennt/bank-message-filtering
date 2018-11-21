package com.vicennt.logic;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class represent a SMS object
 *
 * @author vicent
 */
public class Sms extends MessageAbbreviation {

    public Sms(String msgId, String msgSender, String msgBody, Map<String, String> abbreviationDic) {
        super(msgId, msgSender, msgBody, abbreviationDic);
    }

    // This constructor is prepared to create objects from JSON file
    public Sms(@JsonProperty(value = "msgId", access = JsonProperty.Access.READ_WRITE) String msgId,
            @JsonProperty(value = "msgSender", access = JsonProperty.Access.READ_WRITE) String msgSender,
            @JsonProperty(value = "msgBody", access = JsonProperty.Access.READ_WRITE) String msgBody) {
        super(msgId, msgSender, msgBody);
    }

    @Override
    public boolean validateMessage() {
        String regex = "^\\+[0-9]{1,3}\\.[0-9]{4,14}(?:x.+)?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(msgSender);
        return super.validateMessage() && msgId != null && msgSender != null && msgBody != null
                && matcher.matches() && msgBody.length() <= 140;
    }

}
