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
public class RachunekTest {
    DaneTestowe dane;
    
    public RachunekTest() {
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
     * Test of zatwierdzRachunek method, of class Rachunek.
     */
    @Test
    public void testZatwierdzRachunek() {
        System.out.println("zatwierdzRachunek");
        boolean expResult = true; //domyslnie status=false;
        dane.rachunek.zatwierdzRachunek();
        boolean result=dane.rachunek.oplacony;
        assertEquals(expResult,result);
        
    }

    /**
     * Test of DodajIloscDoZakupu method, of class Rachunek.
     */
    @Test
    public void testDodajIloscDoZakupu() {
        System.out.println("DodajIloscDoZakupu");
        //Produkt produkt = new Produkt();
        int ilosc = 0;
        //Rachunek instance = null;
        //instance.DodajIloscDoZakupu(daneprodukt, ilosc);
        dane.rachunek.DodajIloscDoZakupu(dane.produkt, 1);
        // TODO review the generated test code and remove the default call to fail.
        for(int i=0;i<dane.rachunek.ileZakupow();i++)
        {
            if(dane.rachunek.zakup.get(i).getProdukt().equals(dane.produkt)){
            assertEquals(dane.rachunek.getZakup().get(i).getIlosc(),222);
            }
        }
            
    }

    /**
     * Test of DodajNowyZakup method, of class Rachunek.
     */
    @Test
    public void testDodajNowyZakup() {
        System.out.println("DodajNowyZakup");
        //Podatek podatek=new Podatek(13);
        Produkt produkt2=new Produkt(2,"kapelusz",44,dane.podatek);
        Zakup zakup2=new Zakup(produkt2,3);
        dane.rachunek.DodajNowyZakup(dane.zakup);
        
        if(dane.rachunek.czyJestZakup(dane.zakup))
            //assertEquals(dane.rachunek.zakup.get(0),zakup2); //BŁĄD
            assertEquals(dane.rachunek.zakup.get(0),dane.zakup); //POPRAWNE
        else
            fail("blad ");
        
    }
    
    /**
     * Test of ileZakupow method, of class Rachunek.
     */
    @Test
    public void testIleZakupow() {
        System.out.println("ileZakupow");
        Zakup zakup2 =new Zakup(new Produkt(1,"plecak",22,dane.podatek),10);
        dane.rachunek.DodajNowyZakup(dane.zakup); //1 zakup dodany
        dane.rachunek.DodajNowyZakup(zakup2);       //2 zakup dodany
        int expResult = 2;
        int result = dane.rachunek.ileZakupow(); //pokazuje 2 zakupy
        assertEquals(expResult, result);
        
    }

    /**
     * Test of czyJestZakup method, of class Rachunek.
     */
    @Test
    public void testCzyJestZakup() {
        System.out.println("czyJestZakup");
 
        //------------------------------------------------------------
        /*
        boolean expResult = false;
        boolean result=dane.rachunek.czyJestZakup(dane.zakup);
        assertEquals(expResult, result); // POPRAWNE
        */                  
        //------------------------------------------------------------
        
        //------------------------------------------------------------
        
        dane.rachunek.DodajNowyZakup(dane.zakup);
        boolean expResult = true;
        boolean result=dane.rachunek.czyJestZakup(dane.zakup);
        assertEquals(expResult, result); //POPRAWNE
        
        //------------------------------------------------------------
        
        
    }

    /**
     * Test of equals method, of class Rachunek.
     */
    @Test
    public void testEquals() {
        System.out.println("equals"); //Dane Rachunek nr=11;
        Rachunek rachunek[]=new Rachunek[2];
        rachunek[0]=new Rachunek(10);
        rachunek[1]=new Rachunek(11);
       
        boolean expResult = false;
        boolean result = dane.rachunek.equals(rachunek[0]); //rachunek[0]=ok rachunek[1]=blad
        assertEquals(expResult, result);
        
    }
    
}
