/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Molly
 */
public class methodClassTest {
    
    public methodClassTest() {
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
     * Test of putArray method, of class methodClass.
     */
    @Test
    public void testPutArray() {
        System.out.println("putArray");
        int numb = 0;
        int place = 0;
        methodClass instance = new methodClass();
        instance.putArray(numb, place);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArray method, of class methodClass.
     */
    @Test
    public void testGetArray() {
        System.out.println("getArray");
        methodClass instance = new methodClass();
        int[] expResult = null;
        int[] result = instance.getArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of increment method, of class methodClass.
     */
    @Test
    public void testIncrement() {
        System.out.println("increment");
        methodClass instance = new methodClass();
        instance.increment();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCount method, of class methodClass.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        methodClass instance = new methodClass();
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serve method, of class methodClass.
     */
    @Test
    public void testServe() {
        System.out.println("serve");
        int num = 0;
        methodClass instance = new methodClass();
        instance.serve(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWait method, of class methodClass.
     */
    @Test
    public void testSetWait() {
        System.out.println("setWait");
        int D = 0;
        methodClass instance = new methodClass();
        instance.setWait(D);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWait method, of class methodClass.
     */
    @Test
    public void testGetWait() {
        System.out.println("getWait");
        methodClass instance = new methodClass();
        int expResult = 0;
        int result = instance.getWait();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementProd method, of class methodClass.
     */
    @Test
    public void testIncrementProd() {
        System.out.println("incrementProd");
        int i = 0;
        methodClass instance = new methodClass();
        instance.incrementProd(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductNum method, of class methodClass.
     */
    @Test
    public void testGetProductNum() {
        System.out.println("getProductNum");
        methodClass instance = new methodClass();
        int expResult = 0;
        int result = instance.getProductNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trolleyAve method, of class methodClass.
     */
    @Test
    public void testTrolleyAve() {
        System.out.println("trolleyAve");
        int k = 0;
        int j = 0;
        methodClass instance = new methodClass();
        int expResult = 0;
        int result = instance.trolleyAve(k, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementLoss method, of class methodClass.
     */
    @Test
    public void testIncrementLoss() {
        System.out.println("incrementLoss");
        methodClass instance = new methodClass();
        instance.incrementLoss();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoss method, of class methodClass.
     */
    @Test
    public void testGetLoss() {
        System.out.println("getLoss");
        methodClass instance = new methodClass();
        int expResult = 0;
        int result = instance.getLoss();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
