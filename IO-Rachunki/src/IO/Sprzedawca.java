/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Admin
 */
public class Sprzedawca extends Uzytkownik
{

    public void dodajProdukt(String[] dane, ListaProduktow listaProduktow)
    {
        int id=Integer.parseInt(dane[0]);
        String name=dane[1];
        float cena=Float.parseFloat(dane[2]);
        float wartosc=Float.parseFloat(dane[3]);
        int ilosc=Integer.parseInt(dane[4]);
        
        Podatek podatek=new Podatek(wartosc);
        Produkt produkt=new Produkt(id,name,cena,podatek);
        listaProduktow.dodajProduktdoKatalogu(produkt, ilosc);
        
    }
    
    public void zatwierdzRachunek(int nr, ListaUzytkownikow spis)
    {
        for(int i=0;i<spis.getUzytkownicy().size();i++)
       {
           if(spis.getUzytkownicy().get(i) instanceof Klient)
           {
               Klient xx=(Klient) spis.getUzytkownicy().get(i);
                        for(int j=0;j<xx.getRachunki().size();j++)
                       {
                           if( xx.getRachunki().get(j).numer==nr)
                           {
                                xx.getRachunki().get(j).oplacony=true;
                                return;
                           }
                           else 
                               System.out.println("nie ten numer przykro mi " + xx.getRachunki().get(j).numer);
                       }
              
                
           }
           else
               System.out.println("To nie jest Klient to jest: "+spis.getUzytkownicy().get(i).getClass()+ "o id: "+spis.getUzytkownicy().get(i).getID());
       }

       
    }
}