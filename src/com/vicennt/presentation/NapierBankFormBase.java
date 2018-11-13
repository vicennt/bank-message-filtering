/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vicennt.presentation;

import com.vicennt.logic.INapierBankService;

/**
 *
 * @author vicent
 */

public class NapierBankFormBase extends javax.swing.JFrame {
    
    protected INapierBankService service;
        
    public NapierBankFormBase(INapierBankService service) {
        this.service = service;
    }

}
