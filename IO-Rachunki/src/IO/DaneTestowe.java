/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

/**
 *
 * @author Admin
 */
public class DaneTestowe {
    Produkt produkt;
    Podatek podatek;
    Klient klient;
    Zakup zakup;
    Rachunek rachunek;
    ListaProduktow listaProduktow=new ListaProduktow();
    ListaUzytkownikow listaUzytkownikow=new ListaUzytkownikow();
    
    public DaneTestowe()
    {
        podatek=new Podatek((float) 0.18);
        produkt=new Produkt(0,"buty",10,podatek);
        klient=new Klient();
        rachunek =new Rachunek(11);
        zakup=new Zakup(produkt,2);
        listaProduktow.dodajProduktdoKatalogu(produkt, 9);
        listaUzytkownikow.dodajUzytkownika(klient);
    }
}
