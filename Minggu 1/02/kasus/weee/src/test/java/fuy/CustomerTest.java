/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hedygading
 */
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getNoId method, of class Customer.
     */
    @Test
    public void testGetNoId() {
        System.out.println("getNoId");
        Customer instance = new Customer();
        int expResult = 0;
        int result = instance.getNoId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNoId method, of class Customer.
     */
    @Test
    public void testSetNoId() {
        System.out.println("setNoId");
        int noId = 0;
        Customer instance = new Customer();
        instance.setNoId(noId);
    }

    /**
     * Test of getNama method, of class Customer.
     */
    @Test
    public void testGetNama() {
        System.out.println("getNama");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNama method, of class Customer.
     */
    @Test
    public void testSetNama() {
        System.out.println("setNama");
        String nama = "";
        Customer instance = new Customer();
        instance.setNama(nama);
    }

    /**
     * Test of getAlamat method, of class Customer.
     */
    @Test
    public void testGetAlamat() {
        System.out.println("getAlamat");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getAlamat();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAlamat method, of class Customer.
     */
    @Test
    public void testSetAlamat() {
        System.out.println("setAlamat");
        String alamat = "";
        Customer instance = new Customer();
        instance.setAlamat(alamat);
    }
    
}
