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
public class NapierBankServiceTest {
    
    public NapierBankServiceTest() {
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
     * Test of addTweet method, of class NapierBankService.
     */
    @Test
    public void testAddTweet() {
        System.out.println("addTweet");
        Tweet t = null;
        NapierBankService instance = null;
        instance.addTweet(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSMS method, of class NapierBankService.
     */
    @Test
    public void testAddSMS() {
        System.out.println("addSMS");
        Sms s = null;
        NapierBankService instance = null;
        instance.addSMS(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEmail method, of class NapierBankService.
     */
    @Test
    public void testAddEmail() {
        System.out.println("addEmail");
        Email m = null;
        NapierBankService instance = null;
        instance.addEmail(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSir method, of class NapierBankService.
     */
    @Test
    public void testAddSir() {
        System.out.println("addSir");
        EmailSIR es = null;
        NapierBankService instance = null;
        instance.addSir(es);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTweets method, of class NapierBankService.
     */
    @Test
    public void testGetTweets() {
        System.out.println("getTweets");
        NapierBankService instance = null;
        ArrayList<Tweet> expResult = null;
        ArrayList<Tweet> result = instance.getTweets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSms method, of class NapierBankService.
     */
    @Test
    public void testGetSms() {
        System.out.println("getSms");
        NapierBankService instance = null;
        ArrayList<Sms> expResult = null;
        ArrayList<Sms> result = instance.getSms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmails method, of class NapierBankService.
     */
    @Test
    public void testGetEmails() {
        System.out.println("getEmails");
        NapierBankService instance = null;
        ArrayList<Email> expResult = null;
        ArrayList<Email> result = instance.getEmails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSirEmails method, of class NapierBankService.
     */
    @Test
    public void testGetSirEmails() {
        System.out.println("getSirEmails");
        NapierBankService instance = null;
        ArrayList<EmailSIR> expResult = null;
        ArrayList<EmailSIR> result = instance.getSirEmails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAbbreviations method, of class NapierBankService.
     */
    @Test
    public void testGetAbbreviations() {
        System.out.println("getAbbreviations");
        NapierBankService instance = null;
        Map<String, String> expResult = null;
        Map<String, String> result = instance.getAbbreviations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTrendings method, of class NapierBankService.
     */
    @Test
    public void testCalculateTrendings() {
        System.out.println("calculateTrendings");
        NapierBankService instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.calculateTrendings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMentionList method, of class NapierBankService.
     */
    @Test
    public void testGetMentionList() {
        System.out.println("getMentionList");
        NapierBankService instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getMentionList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSIRList method, of class NapierBankService.
     */
    @Test
    public void testGetSIRList() {
        System.out.println("getSIRList");
        NapierBankService instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getSIRList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfMessages method, of class NapierBankService.
     */
    @Test
    public void testGetNumberOfMessages() {
        System.out.println("getNumberOfMessages");
        NapierBankService instance = null;
        int expResult = 0;
        int result = instance.getNumberOfMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readTweets method, of class NapierBankService.
     */
    @Test
    public void testReadTweets() {
        System.out.println("readTweets");
        String filename = "";
        NapierBankService instance = null;
        ArrayList<Tweet> expResult = null;
        ArrayList<Tweet> result = instance.readTweets(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readSms method, of class NapierBankService.
     */
    @Test
    public void testReadSms() {
        System.out.println("readSms");
        String filename = "";
        NapierBankService instance = null;
        ArrayList<Sms> expResult = null;
        ArrayList<Sms> result = instance.readSms(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readEmails method, of class NapierBankService.
     */
    @Test
    public void testReadEmails() {
        System.out.println("readEmails");
        String filename = "";
        NapierBankService instance = null;
        ArrayList<Email> expResult = null;
        ArrayList<Email> result = instance.readEmails(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readSir method, of class NapierBankService.
     */
    @Test
    public void testReadSir() {
        System.out.println("readSir");
        String filename = "";
        NapierBankService instance = null;
        ArrayList<EmailSIR> expResult = null;
        ArrayList<EmailSIR> result = instance.readSir(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeMessages method, of class NapierBankService.
     */
    @Test
    public void testWriteMessages() {
        System.out.println("writeMessages");
        ArrayList t = null;
        String filename = "";
        NapierBankService instance = null;
        instance.writeMessages(t, filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
