/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.util.ArrayList;

/**
 *
 * @author huber
 */
public class ListaUzytkownikow {

     private ArrayList<Uzytkownik> uzytkownicy;
    
    public ListaUzytkownikow() {
        uzytkownicy=new ArrayList<Uzytkownik>();
    }
        
    public ArrayList<Uzytkownik> getUzytkownicy() {
        return uzytkownicy;
    }

    public void setUzytkownicy(ArrayList<Uzytkownik> uzytkownicy) {
        uzytkownicy = uzytkownicy;
    }
        
    public void dodajUzytkownika(Uzytkownik nowyUzytkownik)
    {
        uzytkownicy.add(nowyUzytkownik);
    }
    public void printAll()
    {
        for(int i=0;i<uzytkownicy.size();i++)
        {
            System.out.println(uzytkownicy.get(i).getImie());
        }
    }
    public Rachunek szukanieRachunku(int nr)
    {
       for(int i=0;i<uzytkownicy.size();i++)
       {
           if(getUzytkownicy().get(i) instanceof Klient)
           {
               Klient klient=(Klient) getUzytkownicy().get(i);
               Rachunek rachunek=klient.szukajRachunek(nr);
               if(rachunek!=null)
               {
                   System.out.println("Numer rachunku: " +rachunek.getNumer() +" id klienta: " + klient.getID());
                   return rachunek;
               }
           }
       }
       System.out.println("Nie ma takiego rachunku");
         return null;
    }
}