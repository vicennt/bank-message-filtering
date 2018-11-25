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
public class EmailTest {
    
    public EmailTest() {
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
     * Test of getSubject method, of class Email.
     */
    @Test
    public void testGetSubject() {
        System.out.println("getSubject");
        Email instance = null;
        String expResult = "";
        String result = instance.getSubject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubject method, of class Email.
     */
    @Test
    public void testSetSubject() {
        System.out.println("setSubject");
        String subject = "";
        Email instance = null;
        instance.setSubject(subject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeURLS method, of class Email.
     */
    @Test
    public void testRemoveURLS() {
        System.out.println("removeURLS");
        Email instance = null;
        instance.removeURLS();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateMessage method, of class Email.
     */
    @Test
    public void testValidateMessage() {
        System.out.println("validateMessage");
        Email instance = null;
        boolean expResult = false;
        boolean result = instance.validateMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuarantineList method, of class Email.
     */
    @Test
    public void testGetQuarantineList() {
        System.out.println("getQuarantineList");
        Email instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getQuarantineList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuarantineList method, of class Email.
     */
    @Test
    public void testSetQuarantineList() {
        System.out.println("setQuarantineList");
        ArrayList<String> quarantineList = null;
        Email instance = null;
        instance.setQuarantineList(quarantineList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Email.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Email instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
