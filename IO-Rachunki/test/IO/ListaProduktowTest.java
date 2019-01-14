/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.util.Map;
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
public class ListaProduktowTest {
    DaneTestowe dane;
    public ListaProduktowTest() {
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
     * Test of szukajProdukt method, of class ListaProduktow.
     */
    @Test
    public void testSzukajProdukt() {
        System.out.println("szukajProdukt");
        //Produkt produkt = null;
        //ListaProduktow instance = new ListaProduktow();
        
        //POPRAWNE
        
        boolean expResult = true;
        boolean result =dane.listaProduktow.szukajProdukt(dane.produkt);
        assertEquals(expResult, result);
        
        
        /*
        boolean expResult = true;
        Produkt produkt1=new Produkt(3,"torba",77,dane.podatek);
        boolean result =dane.listaProduktow.szukajProdukt(produkt1);
        assertEquals(expResult, result);
        */
        
    }

    /**
     * Test of dodajProduktdoKatalogu method, of class ListaProduktow.
     */
    @Test
    public void testDodajProduktdoKatalogu() {
        System.out.println("dodajProduktdoKatalogu");
        
        int ilosc=23;
        Produkt produkt1=new Produkt(3,"torba",77,dane.podatek);
        dane.listaProduktow.dodajProduktdoKatalogu(produkt1, ilosc);
        assertEquals(ilosc,dane.listaProduktow.getIloscProduktu(produkt1));
     
    }

    
}
