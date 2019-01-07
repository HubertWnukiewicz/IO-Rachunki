/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Klient extends Uzytkownik {
    
private ArrayList<Rachunek> rachunki=new ArrayList<Rachunek>();
    
    public void wstawZakup(int nr, Zakup zakup, ListaProduktow listaProduktow)
     {
        if(listaProduktow!=null && zakup!=null)
            for(int i=0;i<this.rachunki.size();i++)
            {
                if(szukajRachunek(nr)!=null)
                {   
                    if(listaProduktow.szukajProdukt(zakup.getProdukt())==true)
                    {
                        if(rachunki.get(i).ileZakupow()!=0)
                        {
                                if(rachunki.get(i).czyJestZakup(zakup))
                                {
                                    System.out.println("ISTNIEJE - Dodaje ilosc");
                                    rachunki.get(i).DodajIloscDoZakupu(zakup.getProdukt(), zakup.getIlosc());
                                    ObliczWartoscRachunku(rachunki.get(i).numer);
                                }
                                else
                                {
                                    System.out.println("NIE ISTNIEJE- Dodaje nowy produkt");
                                    rachunki.get(i).DodajNowyZakup(zakup);  
                                    ObliczWartoscRachunku(rachunki.get(i).numer);
                                }

                        }
                        else
                        {
                            System.out.println("Pierwszy produkt na rachunu");
                            rachunki.get(i).DodajNowyZakup(zakup);
                        }

                    }

                }
             else System.out.println("Brak produktu w katalogu");
            }
     }

    public ArrayList<Rachunek> getRachunki() {
        return rachunki;
    }

    public void setRachunki(ArrayList<Rachunek> rachunki) {
        this.rachunki = rachunki;
    }
    public void dodajRachunek(Rachunek rachunek)
    {
        this.rachunki.add(rachunek);
    }
    
    public boolean szukajProdukt(Produkt produkt)
    {
        for(int i=0;i<rachunki.size();i++)
        {
            for(int j=0;j<rachunki.get(i).zakup.size();j++)
            if(rachunki.get(i).zakup.get(j).getProdukt().equals(produkt))
                return true;
        }
         return false;
    }
    
    public Rachunek szukajRachunek(int nr)
    {
        for(int i=0;i<rachunki.size();i++)
        {
            if(rachunki.get(i).numer==nr)
                return rachunki.get(i);
        }
        return null;
    }
    public float ObliczWartoscRachunku(int nr)
    {
        float suma=0;
        Rachunek tmpRachunek=szukajRachunek(nr);
        if(tmpRachunek!=null)
        {
            for(int i=0;i<tmpRachunek.ileZakupow();i++)
            {
                suma=suma+(tmpRachunek.getZakup().get(i).getProdukt().getCena()*tmpRachunek.getZakup().get(i).getIlosc());
            }
            return suma;
        }
        return suma;
    }
    public void PrintAll()
    {
        for(int i=0;i<rachunki.size();i++)
        {
            System.out.println("---Nr: "+rachunki.get(i).numer+"---");
            for(int j=0;j<rachunki.get(i).ileZakupow();j++)
            {
                System.out.println("Zakup nr: "+j);
                rachunki.get(i).getZakup().get(j).printZakup();
            }
            System.out.println("------------------------------------");
        }
    }
}