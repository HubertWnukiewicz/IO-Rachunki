/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.util.ArrayList;
import java.util.Random;

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
                                    //ObliczWartoscRachunku(rachunki.get(i).numer);
                                }
                                else
                                {
                                    System.out.println("NIE ISTNIEJE- Dodaje nowy produkt");
                                    rachunki.get(i).DodajNowyZakup(zakup);  
                                    //ObliczWartoscRachunku(rachunki.get(i).numer);
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
    public void stworzRachunek()
    {   
        Random generator=new Random();
        int nr=generator.nextInt();
        Rachunek rachunek=new Rachunek(nr); //TODO check if it already exists
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
        if(!this.rachunki.isEmpty())
        {
            for(int i=0;i<rachunki.size();i++)
            {
                if(rachunki.get(i).getNumer()==nr)
                    return rachunki.get(i);
            }
        }
         return null; 
    }
    public float ObliczWartoscRachunkuBezPodatku(int nr)
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
    public float ObliczWartoscRachunkuZPodatkiem(int nr)
    {
        float suma=0;
        float tmpSuma;
        Rachunek tmpRachunek=szukajRachunek(nr);
        if(tmpRachunek!=null)
        {
            for(int i=0;i<tmpRachunek.ileZakupow();i++)
            {
                tmpSuma=tmpRachunek.getZakup().get(i).getProdukt().getCena()*tmpRachunek.getZakup().get(i).getProdukt().getPodatek().getWartoscPodatku()+tmpRachunek.getZakup().get(i).getProdukt().getCena();
                suma=suma+(tmpSuma*tmpRachunek.getZakup().get(i).getIlosc());
            }
            return suma;
        }
        return suma;
    }
    public void PrintAll()
    {
        for(int i=0;i<rachunki.size();i++)
        {
            System.out.println("---Nr: "+rachunki.get(i).getNumer()+"---");
            for(int j=0;j<rachunki.get(i).ileZakupow();j++)
            {
                System.out.println("Zakup nr: "+j);
                rachunki.get(i).getZakup().get(j).printZakup();
            }
            System.out.println("------------------------------------");
        }
    }
    @Override
    public boolean equals(Object klient){
        Klient klient1=(Klient)klient;
        if(klient1==null)
            return false;
        boolean bKlient1=true;
        if(this.getID()!=klient1.getID())
            bKlient1=false;
        else if(!this.getImie().equals(klient1.getImie()))
            bKlient1=false;
        else if(!this.getLogin().equals(klient1.getLogin()))
            bKlient1=false;
        else if(!this.getNazwisko().equals(klient1.getNazwisko()))
            bKlient1=false;
        
        return bKlient1;
    }
}