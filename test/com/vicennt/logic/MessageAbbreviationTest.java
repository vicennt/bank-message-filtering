/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vicennt.logic;

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
public class MessageAbbreviationTest {
    
    public MessageAbbreviationTest() {
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
     * Test of replaceAbbreviations method, of class MessageAbbreviation.
     */
    @Test
    public void testReplaceAbbreviations() {
        System.out.println("replaceAbbreviations");
        MessageAbbreviation instance = null;
        instance.replaceAbbreviations();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MessageAbbreviationImpl extends MessageAbbreviation {

        public MessageAbbreviationImpl() {
            super("", "", "");
        }
    }
    
}
