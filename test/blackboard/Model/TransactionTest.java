/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackboard.Model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David_Garcia
 */
public class TransactionTest {
    
    public TransactionTest() {
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
     * Test of getDate method, of class Transaction.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Transaction instance = new Transaction();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Transaction.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Transaction instance = new Transaction();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPayee method, of class Transaction.
     */
    @Test
    public void testGetPayee() {
        System.out.println("getPayee");
        Transaction instance = new Transaction();
        String expResult = "";
        String result = instance.getPayee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPayee method, of class Transaction.
     */
    @Test
    public void testSetPayee() {
        System.out.println("setPayee");
        String payee = "";
        Transaction instance = new Transaction();
        instance.setPayee(payee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransactionAmount method, of class Transaction.
     */
    @Test
    public void testGetTransactionAmount() {
        System.out.println("getTransactionAmount");
        Transaction instance = new Transaction();
        Double expResult = null;
        Double result = instance.getTransactionAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransactionAmount method, of class Transaction.
     */
    @Test
    public void testSetTransactionAmount() {
        System.out.println("setTransactionAmount");
        Double transactionAmount = null;
        Transaction instance = new Transaction();
        instance.setTransactionAmount(transactionAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMemo method, of class Transaction.
     */
    @Test
    public void testGetMemo() {
        System.out.println("getMemo");
        Transaction instance = new Transaction();
        String expResult = "";
        String result = instance.getMemo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMemo method, of class Transaction.
     */
    @Test
    public void testSetMemo() {
        System.out.println("setMemo");
        String memo = "";
        Transaction instance = new Transaction();
        instance.setMemo(memo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCheckingNumber method, of class Transaction.
     */
    @Test
    public void testGetCheckingNumber() {
        System.out.println("getCheckingNumber");
        Transaction instance = new Transaction();
        String expResult = "";
        String result = instance.getCheckingNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCheckingNumber method, of class Transaction.
     */
    @Test
    public void testSetCheckingNumber() {
        System.out.println("setCheckingNumber");
        String checkingNumber = "";
        Transaction instance = new Transaction();
        instance.setCheckingNumber(checkingNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCleared method, of class Transaction.
     */
    @Test
    public void testGetCleared() {
        System.out.println("getCleared");
        Transaction instance = new Transaction();
        Boolean expResult = null;
        Boolean result = instance.getCleared();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCleared method, of class Transaction.
     */
    @Test
    public void testSetCleared() {
        System.out.println("setCleared");
        Boolean cleared = null;
        Transaction instance = new Transaction();
        instance.setCleared(cleared);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Transaction.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Transaction instance = new Transaction();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Transaction.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Transaction instance = new Transaction();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
