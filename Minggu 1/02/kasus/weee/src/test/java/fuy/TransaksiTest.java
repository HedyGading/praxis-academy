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
public class TransaksiTest {
    
    public TransaksiTest() {
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
     * Test of setTransaksi method, of class Transaksi.
     */
    @Test
    public void testSetTransaksi() {
        System.out.println("setTransaksi");
        int kodeTransaksi = 0;
        int banyak = 0;
        Transaksi instance = new Transaksi();
        instance.setTransaksi(kodeTransaksi, banyak);
    }

    /**
     * Test of totalTransaksi method, of class Transaksi.
     */
    @Test
    public void testTotalTransaksi() {
        System.out.println("totalTransaksi");
        Transaksi instance = new Transaksi();
        float expResult = 0.0F;
        float result = instance.totalTransaksi();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setBarang method, of class Transaksi.
     */
    @Test
    public void testSetBarang() {
        System.out.println("setBarang");
        int kodeBarang = 0;
        String namaBarang = "";
        float harga = 0.0F;
        Transaksi instance = new Transaksi();
        instance.setBarang(kodeBarang, namaBarang, harga);
    }

    /**
     * Test of cetakStruk method, of class Transaksi.
     */
    @Test
    public void testCetakStruk() {
        System.out.println("cetakStruk");
        Transaksi instance = new Transaksi();
        instance.cetakStruk();
    }
    
}
