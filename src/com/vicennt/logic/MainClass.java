package com.vicennt.logic;

import com.vicennt.data.DataAccess;
import com.vicennt.presentation.InputSessionForm;


/**
 * The principal class 
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
