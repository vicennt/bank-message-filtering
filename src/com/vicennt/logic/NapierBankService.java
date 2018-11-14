/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vicennt.logic;

import com.vicennt.data.IDataAccess;

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
    public void newMessage() {
    }

    @Override
    public void loadMessages() {
    }
    
}
