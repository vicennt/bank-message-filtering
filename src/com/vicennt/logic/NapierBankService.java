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
public class NapierBankService {
    
    private IDataAccess dal;
    public NapierBankService(IDataAccess dal){
        this.dal = dal;
    }
    
}
