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
public class Manager extends Sprzedawca{
    
    public void anulujRachunek(int nr, ListaUzytkownikow spis)
    {
       for(int i=0;i<spis.getUzytkownicy().size();i++)
       {
           if(spis.getUzytkownicy().get(i) instanceof Klient)
           {
               Klient klient=(Klient) spis.getUzytkownicy().get(i);
                    for(int j=0;j<klient.getRachunki().size();j++)
                    {
                        if( klient.getRachunki().get(j).numer==nr)
                        {
                            Rachunek rachunek=klient.getRachunki().get(j);
                            System.out.println("Taki rachunek istnieje i nalezy do kliena o ID: "+klient.getID()+klient.getImie());
                            klient.getRachunki().remove(rachunek);
                            return;
                        }
                    }  
           }
           
       } 
        System.out.println("Nie znaleziono rachunku");
    }

    public void dodajPromocje(ListaProduktow listaProduktow, Produkt produkt, Promocja promocja)
    {
        //TODO dodajpromocje
        if(listaProduktow.szukajProdukt(produkt)==true)
        {
            produkt.setPromocja(promocja);
        }

    }
}
