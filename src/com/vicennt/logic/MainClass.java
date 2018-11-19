package com.vicennt.logic;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vicennt.constants.Constants;
import com.vicennt.data.DataAccess;
import com.vicennt.presentation.InputSessionForm;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
        
        
        /*
        
        INapierBankService service = new NapierBankService(new DataAccess());    
        ArrayList<Sms> tw = new ArrayList();
        tw.add(new Sms("T1","@Vicent","Hola soy @jose y me voy de #vacaciones"));
        tw.add(new Sms("T2","@Sara","Hola soy @juan y me voy de #crucero"));
        service.writeMessages(tw, Constants.JSON_TWEET_FILE_PATH);
        ArrayList<Tweet> tr = service.readTweets();
        System.out.println("Length: " + tr.size() + "Ex: " +tr.get(0).getMsgBody());
        for(int i = 0; i < tr.size(); i++){
            System.out.println(tr.get(i));
        }
        */
        
    } 
}
