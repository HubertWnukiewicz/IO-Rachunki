/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author hubert
 */
public class Aplikacja{
    static ListaUzytkownikow listaUzytkownikow=new ListaUzytkownikow();
     static ListaProduktow listaProduktow=new ListaProduktow();
    
     
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
       // ListaUzytkownikow listaUzytkownikow=new ListaUzytkownikow();
        //ListaProduktow listaProduktow=new ListaProduktow();
        
    /* Podatek podatek=new Podatek(13);
      Produkt produkt=new Produkt("buty",10,podatek);
      Produkt produkt1=new Produkt("plecak",22,podatek);
      Produkt produkt2=new Produkt("kapelusz",44,podatek);
      Produkt produkt3=new Produkt("torba",77,podatek);
      ListaProduktow.dodajProdukt(produkt);
      ListaProduktow.dodajProdukt(produkt1);
      ListaProduktow.dodajProdukt(produkt2);
      ListaProduktow.dodajProdukt(produkt3);
      ListaProduktow.produkty.add(produkt);
      ListaProduktow.produkty.size();
      System.out.println(ListaProduktow.produkty.size());
      for(int i=0;i<ListaProduktow.produkty.size();i++)
      {
            System.out.println(ListaProduktow.produkty.get(i).getNazwa());
      }
      Sprzedawca admin=new Sprzedawca();
      admin.setImie("Pawel");
      ListaUzytkownikow.dodajUzytkownika(admin);
     // Zakup zakup=new Zakup();
      Rachunek rachunek=new Rachunek(222);
      Klient klient=new Klient();
      ListaUzytkownikow.dodajUzytkownika(klient);
      klient.setImie("Karol");
      System.out.println("------------------------------------------------");
      Zakup zakup1=new Zakup(3,produkt);
      zakup1.printZakup();
      Zakup zakup2=new Zakup(4,produkt2);
      zakup2.printZakup();
      Zakup zakup3=new Zakup(7,produkt3);
      zakup3.printZakup();
      System.out.println("------------------------------------------------");
      rachunek.DodajZakup(zakup1);
      rachunek.DodajZakup(zakup3);
      rachunek.DodajZakup(zakup2);
      rachunek.print();
      klient.dodajRachunek(rachunek);
      System.out.println(klient.imie);
      String[] dane=new String[3];
      dane[0]="lalgka";
      dane[1]="77";
      dane[2]="139";
      admin.dodajProdukt(dane);
      System.out.println("------------------------------------------------");
      for(int i=0;i<ListaProduktow.produkty.size();i++)
      {
            System.out.println(ListaProduktow.produkty.get(i).getNazwa());
      }
      System.out.println(ListaProduktow.produkty.size());
      klient.wstawZakup(222, 0, dane);
      Rachunek rachunek2=new Rachunek(333);
      klient.dodajRachunek(rachunek2);
      System.out.println("SIZE_1: "+rachunek2.zakup.size());
      dane[0]="patelnia";
      klient.wstawZakup(333, 0, dane);
      System.out.println("SIZE_2: "+rachunek2.zakup.size());
      ListaUzytkownikow.printAll();
      Manager szef=new Manager();
      System.out.println("---------------------1--------------------");
      szef.anulujRachunek(333,listaUzytkownikow);
       System.out.println("---------------------2--------------------");
      szef.anulujRachunek(17,listaUzytkownikow);
       System.out.println("---------------------3--------------------");
      szef.anulujRachunek(222,listaUzytkownikow);
       System.out.println("---------------------4--------------------");
      szef.szukajRachunek(333);
       System.out.println("---------------------5--------------------");
      szef.szukajRachunek(222);
    }
    
    Klient klient=new Klient();
    klient.setID(0);
    klient.setImie("A");
    listaUzytkownikow.dodajUzytkownika(klient);
    Klient klient1=new Klient();
    klient1.setID(1);
    klient1.setImie("B");
    listaUzytkownikow.dodajUzytkownika(klient1);
    Klient klient2=new Klient();
    klient2.setID(2);
    klient2.setImie("C");
    listaUzytkownikow.dodajUzytkownika(klient2);
    Sprzedawca sprzedawca=new Sprzedawca();
    sprzedawca.setID(3);
    sprzedawca.setImie("D");
    listaUzytkownikow.dodajUzytkownika(sprzedawca);
    Sprzedawca sprzedawca2=new Sprzedawca();
    sprzedawca2.setID(4);
    sprzedawca2.setImie("E");
    listaUzytkownikow.dodajUzytkownika(sprzedawca2);
    Manager szef=new Manager();
    szef.setID(5);
    szef.setImie("F");
    listaUzytkownikow.dodajUzytkownika(szef);
    //////////////////////////////////////
      Rachunek rachunek2=new Rachunek(333);
      klient2.dodajRachunek(rachunek2);
      Rachunek rachunek3=new Rachunek(17);
      klient.dodajRachunek(rachunek3);
      Rachunek rachunek4=new Rachunek(417);
      klient.dodajRachunek(rachunek4);
      Rachunek rachunek5=new Rachunek(123);
      klient2.dodajRachunek(rachunek5);
      
      System.out.println("---------------------333--------------------");
      szef.anulujRachunek(333,listaUzytkownikow);
      System.out.println("---------------------12--------------------");
      szef.anulujRachunek(12,listaUzytkownikow);
      System.out.println("---------------------17--------------------");
      szef.anulujRachunek(17,listaUzytkownikow);
      System.out.println("---------------------123--------------------");
      szef.anulujRachunek(123,listaUzytkownikow);
      System.out.println("---------------------417--------------------");
      szef.anulujRachunek(417,listaUzytkownikow);
      System.out.println("---------------------999--------------------");
      szef.anulujRachunek(999,listaUzytkownikow);
      
      System.out.println("---------------------LISTA 333--------------------");
      listaUzytkownikow.szukanieRachunku(333);
      System.out.println("---------------------LISTA  12--------------------");
      listaUzytkownikow.szukanieRachunku(12);/
        ------------------------------------------------------------------
      Podatek podatek=new Podatek(13);
      Produkt produkt=new Produkt(0,"buty",10,podatek);
      Produkt produkt1=new Produkt(1,"plecak",22,podatek);
      Produkt produkt2=new Produkt(2,"kapelusz",44,podatek);
      Produkt produkt3=new Produkt(3,"torba",77,podatek);
      listaProduktow.dodajProduktdoKatalogu(produkt, 10);
      listaProduktow.dodajProduktdoKatalogu(produkt1, 99);
      listaProduktow.dodajProduktdoKatalogu(produkt2, 11551);
      listaProduktow.dodajProduktdoKatalogu(produkt3, 546);
      listaProduktow.printAll();
      Klient klient=new Klient();
      Rachunek rachunek=new Rachunek(43);
      Rachunek rachunek2 =new Rachunek(1);
      Zakup zakup0=new Zakup(produkt, 1);
      Zakup zakup1=new Zakup(produkt1, 1);
      Zakup zakup2=new Zakup(produkt2, 1);
      Zakup zakup3=new Zakup(produkt3, 1);
      rachunek.DodajZakup(zakup0);
      rachunek.DodajZakup(zakup1);
      rachunek.DodajZakup(zakup2);
      rachunek.DodajZakup(zakup3);
      rachunek2.DodajZakup(zakup3);
      System.out.println("----------------RACHUNEK---------------------");
      rachunek.print();
      klient.dodajRachunek(rachunek);
      klient.dodajRachunek(rachunek2);
      System.out.println("43: "+rachunek.ileZakupow());
      System.out.println("1: "+rachunek2.ileZakupow());
     
      klient.PrintAll();
       System.out.println(klient.ObliczWartoscRachunku(43));
      System.out.println(klient.ObliczWartoscRachunku(1)); */
    //server myserver=new server();
    //myserver.addUsertoDB("Adrian","Malecki","popek","xd");
    //myserver.addProducttoDB( "komputer", 89.87, 0.4, 0.0,10);
    //myserver.addProducttoDB( "telefon", 11.41, 0.1, 0.8,84);
    //myserver.readProductsFromDB(listaProduktow);
    //listaProduktow.printAll();
    /*
    JFrame aWindow = new JFrame("This is the Window Title");
    int windowWidth = 400;           // Window width in pixels
    int windowHeight = 150;          // Window height in pixels
    aWindow.setBounds(50, 100,       // Set position
         windowWidth, windowHeight);  // and size
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aWindow.setVisible(true);        // Display the window
    
*/  
    Podatek podatek=new Podatek(13);
      Produkt produkt=new Produkt(0,"buty",10,podatek);
      Produkt produkt1=new Produkt(1,"plecak",22,podatek);
      Produkt produkt2=new Produkt(2,"kapelusz",44,podatek);
      Produkt produkt3=new Produkt(3,"torba",77,podatek);
      listaProduktow.dodajProduktdoKatalogu(produkt, 10);
      listaProduktow.dodajProduktdoKatalogu(produkt1, 99);
      listaProduktow.dodajProduktdoKatalogu(produkt2, 11551);
      listaProduktow.dodajProduktdoKatalogu(produkt3, 546);
    Uzytkownik a=new Uzytkownik(1,"hubert","wnuk","user","user");
    Manager klient=new Manager();
    klient.setImie("root");
    klient.setNazwisko("root");
    klient.setLogin("root");
    klient.setHaslo("root");
    Rachunek rachunek=new Rachunek(43);
    Rachunek rachunek2=new Rachunek(55);
    //klient.dodajRachunek(rachunek);
    //klient.dodajRachunek(rachunek2);
    listaUzytkownikow.dodajUzytkownika(klient);
    listaUzytkownikow.dodajUzytkownika(a);
    System.out.println("listaProduktow"+listaProduktow.getKatalog().size());
    Logowanie mainpanel=new Logowanie(listaUzytkownikow,listaProduktow);
    mainpanel.setVisible(true);
    mainpanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}