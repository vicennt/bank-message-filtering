/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vicennt.logic;

import java.util.ArrayList;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vicent
 */
public class INapierBankServiceTest {
    
    public INapierBankServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of readTweets method, of class INapierBankService.
     */
    @Test
    public void testReadTweets() {
        System.out.println("readTweets");
        String filename = "";
        INapierBankService instance = new INapierBankServiceImpl();
        ArrayList<Tweet> expResult = null;
        ArrayList<Tweet> result = instance.readTweets(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readSms method, of class INapierBankService.
     */
    @Test
    public void testReadSms() {
        System.out.println("readSms");
        String filename = "";
        INapierBankService instance = new INapierBankServiceImpl();
        ArrayList<Sms> expResult = null;
        ArrayList<Sms> result = instance.readSms(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readEmails method, of class INapierBankService.
     */
    @Test
    public void testReadEmails() {
        System.out.println("readEmails");
        String filename = "";
        INapierBankService instance = new INapierBankServiceImpl();
        ArrayList<Email> expResult = null;
        ArrayList<Email> result = instance.readEmails(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readSir method, of class INapierBankService.
     */
    @Test
    public void testReadSir() {
        System.out.println("readSir");
        String filename = "";
        INapierBankService instance = new INapierBankServiceImpl();
        ArrayList<EmailSIR> expResult = null;
        ArrayList<EmailSIR> result = instance.readSir(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTweet method, of class INapierBankService.
     */
    @Test
    public void testAddTweet() {
        System.out.println("addTweet");
        Tweet t = null;
        INapierBankService instance = new INapierBankServiceImpl();
        instance.addTweet(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSMS method, of class INapierBankService.
     */
    @Test
    public void testAddSMS() {
        System.out.println("addSMS");
        Sms s = null;
        INapierBankService instance = new INapierBankServiceImpl();
        instance.addSMS(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEmail method, of class INapierBankService.
     */
    @Test
    public void testAddEmail() {
        System.out.println("addEmail");
        Email m = null;
        INapierBankService instance = new INapierBankServiceImpl();
        instance.addEmail(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSir method, of class INapierBankService.
     */
    @Test
    public void testAddSir() {
        System.out.println("addSir");
        EmailSIR es = null;
        INapierBankService instance = new INapierBankServiceImpl();
        instance.addSir(es);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTrendings method, of class INapierBankService.
     */
    @Test
    public void testCalculateTrendings() {
        System.out.println("calculateTrendings");
        INapierBankService instance = new INapierBankServiceImpl();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.calculateTrendings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMentionList method, of class INapierBankService.
     */
    @Test
    public void testGetMentionList() {
        System.out.println("getMentionList");
        INapierBankService instance = new INapierBankServiceImpl();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getMentionList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSIRList method, of class INapierBankService.
     */
    @Test
    public void testGetSIRList() {
        System.out.println("getSIRList");
        INapierBankService instance = new INapierBankServiceImpl();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getSIRList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTweets method, of class INapierBankService.
     */
    @Test
    public void testGetTweets() {
        System.out.println("getTweets");
        INapierBankService instance = new INapierBankServiceImpl();
        ArrayList<Tweet> expResult = null;
        ArrayList<Tweet> result = instance.getTweets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSms method, of class INapierBankService.
     */
    @Test
    public void testGetSms() {
        System.out.println("getSms");
        INapierBankService instance = new INapierBankServiceImpl();
        ArrayList<Sms> expResult = null;
        ArrayList<Sms> result = instance.getSms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmails method, of class INapierBankService.
     */
    @Test
    public void testGetEmails() {
        System.out.println("getEmails");
        INapierBankService instance = new INapierBankServiceImpl();
        ArrayList<Email> expResult = null;
        ArrayList<Email> result = instance.getEmails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSirEmails method, of class INapierBankService.
     */
    @Test
    public void testGetSirEmails() {
        System.out.println("getSirEmails");
        INapierBankService instance = new INapierBankServiceImpl();
        ArrayList<EmailSIR> expResult = null;
        ArrayList<EmailSIR> result = instance.getSirEmails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfMessages method, of class INapierBankService.
     */
    @Test
    public void testGetNumberOfMessages() {
        System.out.println("getNumberOfMessages");
        INapierBankService instance = new INapierBankServiceImpl();
        int expResult = 0;
        int result = instance.getNumberOfMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAbbreviations method, of class INapierBankService.
     */
    @Test
    public void testGetAbbreviations() {
        System.out.println("getAbbreviations");
        INapierBankService instance = new INapierBankServiceImpl();
        Map<String, String> expResult = null;
        Map<String, String> result = instance.getAbbreviations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeMessages method, of class INapierBankService.
     */
    @Test
    public void testWriteMessages() {
        System.out.println("writeMessages");
        ArrayList t = null;
        String filename = "";
        INapierBankService instance = new INapierBankServiceImpl();
        instance.writeMessages(t, filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class INapierBankServiceImpl implements INapierBankService {

        public ArrayList<Tweet> readTweets(String filename) {
            return null;
        }

        public ArrayList<Sms> readSms(String filename) {
            return null;
        }

        public ArrayList<Email> readEmails(String filename) {
            return null;
        }

        public ArrayList<EmailSIR> readSir(String filename) {
            return null;
        }

        public void addTweet(Tweet t) {
        }

        public void addSMS(Sms s) {
        }

        public void addEmail(Email m) {
        }

        public void addSir(EmailSIR es) {
        }

        public ArrayList<String> calculateTrendings() {
            return null;
        }

        public ArrayList<String> getMentionList() {
            return null;
        }

        public ArrayList<String> getSIRList() {
            return null;
        }

        public ArrayList<Tweet> getTweets() {
            return null;
        }

        public ArrayList<Sms> getSms() {
            return null;
        }

        public ArrayList<Email> getEmails() {
            return null;
        }

        public ArrayList<EmailSIR> getSirEmails() {
            return null;
        }

        public int getNumberOfMessages() {
            return 0;
        }

        public Map<String, String> getAbbreviations() {
            return null;
        }

        public void writeMessages(ArrayList t, String filename) {
        }
    }
    
}
