package com.vicennt.logic;

import com.vicennt.data.IDataAccess;
import java.util.Map;

/**
 *
 * @author vicent
 */
public class NapierBankService implements INapierBankService {
    
    private IDataAccess dal;
    public NapierBankService(IDataAccess dal){
        this.dal = dal;
    }

    @Override
    public void addSortCodeSIRList() {
    }

    @Override
    public void addNatureIndidentSIRList() {
    }

    @Override
    public void addHashtagsHTList() {
    }

    @Override
    public void addMentionsMTList() {
    }

    @Override
    public void loadMessages() {
    }

    @Override
    public Map<String, String> getAbbreviations() {
        //TODO: Get abreviations from CSV
        return null;
    }

    @Override
    public void saveSMS(Sms sms) {
        //TODO: Write object in a JSON file
    }
    
}
