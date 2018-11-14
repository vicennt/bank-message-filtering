/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vicennt.logic;

import com.vicennt.data.DataAccess;
import com.vicennt.presentation.InputSessionForm;

/**
 *
 * @author vicent
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        INapierBankService service = new NapierBankService(new DataAccess());
        InputSessionForm nb = new InputSessionForm(service);
        nb.setLocationRelativeTo(null);
        nb.setVisible(true);     
    }
    
}
