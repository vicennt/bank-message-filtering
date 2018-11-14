package com.vicennt.logic;

import java.util.Map;

/**
 *
 * @author vicent
 */
public interface INapierBankService {
    void addSortCodeSIRList();
    void addNatureIndidentSIRList();
    void addHashtagsHTList();
    void addMentionsMTList();
    Map<String, String> getAbbreviations();
    void saveSMS(Sms sms);
    void loadMessages();
}
