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
public class MessageTest {
    
    public MessageTest() {
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
     * Test of getMsgId method, of class Message.
     */
    @Test
    public void testGetMsgId() {
        System.out.println("getMsgId");
        Message instance = null;
        String expResult = "";
        String result = instance.getMsgId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMsgId method, of class Message.
     */
    @Test
    public void testSetMsgId() {
        System.out.println("setMsgId");
        String msgId = "";
        Message instance = null;
        instance.setMsgId(msgId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMsgSender method, of class Message.
     */
    @Test
    public void testGetMsgSender() {
        System.out.println("getMsgSender");
        Message instance = null;
        String expResult = "";
        String result = instance.getMsgSender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMsgSender method, of class Message.
     */
    @Test
    public void testSetMsgSender() {
        System.out.println("setMsgSender");
        String msgSender = "";
        Message instance = null;
        instance.setMsgSender(msgSender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMsgBody method, of class Message.
     */
    @Test
    public void testGetMsgBody() {
        System.out.println("getMsgBody");
        Message instance = null;
        String expResult = "";
        String result = instance.getMsgBody();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMsgBody method, of class Message.
     */
    @Test
    public void testSetMsgBody() {
        System.out.println("setMsgBody");
        String msgBody = "";
        Message instance = null;
        instance.setMsgBody(msgBody);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateMessage method, of class Message.
     */
    @Test
    public void testValidateMessage() {
        System.out.println("validateMessage");
        Message instance = null;
        boolean expResult = false;
        boolean result = instance.validateMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Message.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Message instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MessageImpl extends Message {

        public MessageImpl() {
            super("", "", "");
        }
    }
    
}
