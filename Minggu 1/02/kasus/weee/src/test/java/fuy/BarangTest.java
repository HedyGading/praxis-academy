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
public class BarangTest {
    
    public BarangTest() {
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
     * Test of setBarang method, of class Barang.
     */
    @Test
    public void testSetBarang() {
        System.out.println("setBarang");
        int kodeBarang = 0;
        String namaBarang = "";
        float harga = 0.0F;
        Barang instance = new BarangImpl();
        instance.setBarang(kodeBarang, namaBarang, harga);
    }

    public class BarangImpl implements Barang {

        public void setBarang(int kodeBarang, String namaBarang, float harga) {
        }
    }
    
}
