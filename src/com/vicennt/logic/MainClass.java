package com.vicennt.logic;

import com.vicennt.data.DataAccess;
import com.vicennt.data.IDataAccess;
import com.vicennt.presentation.InputSessionForm;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

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
