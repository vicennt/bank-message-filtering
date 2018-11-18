package com.vicennt.logic;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vicennt.data.DataAccess;
import com.vicennt.presentation.InputSessionForm;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
