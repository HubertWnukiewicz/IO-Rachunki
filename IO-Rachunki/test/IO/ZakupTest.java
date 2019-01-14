/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

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
public class ZakupTest {
    DaneTestowe dane;
    public ZakupTest() {
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

    @Test
    public void testUtworzZakup() {
        System.out.println("UtworzZakup");
        //Produkt produkt = null;
        int ilosc = 2; //np zmiana ilosci da blad 
        //ListaProduktow listaProduktow = null;
        Zakup instance=new Zakup(null,0);
        Zakup expResult = dane.zakup;
        Zakup result = instance.UtworzZakup(dane.produkt, ilosc, dane.listaProduktow);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of equals method, of class Zakup.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object zakup = new Zakup(dane.produkt,dane.zakup.getIlosc()); //ten sam
        Zakup zakup1 = new Zakup(new Produkt(1,"plecak",22,dane.podatek),10); //inny
        boolean expResult = false;
        boolean result = dane.zakup.equals(zakup1);
        assertEquals(expResult, result);
       
    }
    
}
