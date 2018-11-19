package com.vicennt.presentation;

import com.vicennt.logic.INapierBankService;

/**
 * This is the form base
 * @author vicent
 */

public class NapierBankFormBase extends javax.swing.JFrame {
    
    protected INapierBankService service;
        
    public NapierBankFormBase(INapierBankService service) {
        this.service = service;
    }

}
