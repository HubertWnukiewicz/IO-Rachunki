/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class KlientTest {
     DaneTestowe dane;
    public KlientTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
     dane=new DaneTestowe();   
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of wstawZakup method, of class Klient.
     */
    @Test
    public void testWstawZakup() {
        System.out.println("wstawZakup");
        dane.klient.dodajRachunek(dane.rachunek);
        dane.klient.wstawZakup(dane.rachunek.getNumer(), dane.zakup, dane.listaProduktow);
        assertEquals(dane.klient.getRachunki().get(0).zakup,dane.zakup);
    }
    
    /**
     * Test of dodajRachunek method, of class Klient.
     */
    @Test
    public void testDodajRachunek() {
        System.out.println("dodajRachunek");
        Rachunek rachunek = null;
        Klient instance = new Klient();
        instance.dodajRachunek(rachunek);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stworzRachunek method, of class Klient.
     */
    @Test
    public void testStworzRachunek() {
        System.out.println("stworzRachunek");
        Klient instance = new Klient();
        instance.stworzRachunek();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of szukajProdukt method, of class Klient.
     */
    @Test
    public void testSzukajProdukt() {
        System.out.println("szukajProdukt");
        Produkt produkt = null;
        Klient instance = new Klient();
        boolean expResult = false;
        boolean result = instance.szukajProdukt(produkt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of szukajRachunek method, of class Klient.
     */
    @Test
    public void testSzukajRachunek() {
        System.out.println("szukajRachunek");
        int nr = 0;
        Klient instance = new Klient();
        Rachunek expResult = null;
        Rachunek result = instance.szukajRachunek(nr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ObliczWartoscRachunkuBezPodatku method, of class Klient.
     */
    @Test
    public void testObliczWartoscRachunkuBezPodatku() {
        System.out.println("ObliczWartoscRachunkuBezPodatku");
        int nr = 0;
        Klient instance = new Klient();
        float expResult = 0.0F;
        float result = instance.ObliczWartoscRachunkuBezPodatku(nr);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ObliczWartoscRachunkuZPodatkiem method, of class Klient.
     */
    @Test
    public void testObliczWartoscRachunkuZPodatkiem() {
        System.out.println("ObliczWartoscRachunkuZPodatkiem");
        int nr = 0;
        Klient instance = new Klient();
        float expResult = 0.0F;
        float result = instance.ObliczWartoscRachunkuZPodatkiem(nr);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
