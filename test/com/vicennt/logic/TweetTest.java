/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vicennt.logic;

import java.util.ArrayList;
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
public class TweetTest {
    
    public TweetTest() {
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
     * Test of validateMessage method, of class Tweet.
     */
    @Test
    public void testValidateMessage() {
        System.out.println("validateMessage");
        Tweet instance = null;
        boolean expResult = false;
        boolean result = instance.validateMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHashtags method, of class Tweet.
     */
    @Test
    public void testGetHashtags() {
        System.out.println("getHashtags");
        Tweet instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getHashtags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMentions method, of class Tweet.
     */
    @Test
    public void testGetMentions() {
        System.out.println("getMentions");
        Tweet instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getMentions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHashtags method, of class Tweet.
     */
    @Test
    public void testSetHashtags() {
        System.out.println("setHashtags");
        ArrayList<String> hashtags = null;
        Tweet instance = null;
        instance.setHashtags(hashtags);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMentions method, of class Tweet.
     */
    @Test
    public void testSetMentions() {
        System.out.println("setMentions");
        ArrayList<String> mentions = null;
        Tweet instance = null;
        instance.setMentions(mentions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Tweet.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Tweet instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
