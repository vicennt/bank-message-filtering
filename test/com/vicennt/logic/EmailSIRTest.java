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
public class EmailSIRTest {
    
    public EmailSIRTest() {
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
     * Test of getSortCode method, of class EmailSIR.
     */
    @Test
    public void testGetSortCode() {
        System.out.println("getSortCode");
        EmailSIR instance = null;
        String expResult = "";
        String result = instance.getSortCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSortCode method, of class EmailSIR.
     */
    @Test
    public void testSetSortCode() {
        System.out.println("setSortCode");
        String sortCode = "";
        EmailSIR instance = null;
        instance.setSortCode(sortCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNatureIncident method, of class EmailSIR.
     */
    @Test
    public void testGetNatureIncident() {
        System.out.println("getNatureIncident");
        EmailSIR instance = null;
        String expResult = "";
        String result = instance.getNatureIncident();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNatureIncident method, of class EmailSIR.
     */
    @Test
    public void testSetNatureIncident() {
        System.out.println("setNatureIncident");
        String natureIncident = "";
        EmailSIR instance = null;
        instance.setNatureIncident(natureIncident);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateMessage method, of class EmailSIR.
     */
    @Test
    public void testValidateMessage() {
        System.out.println("validateMessage");
        EmailSIR instance = null;
        boolean expResult = false;
        boolean result = instance.validateMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class EmailSIR.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        EmailSIR instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
