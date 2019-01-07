
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
public class Rachunek {
    
    int numer;
    ArrayList<Zakup> zakup;
    boolean oplacony;
    
    public Rachunek(int numer)
    {
     this.numer=numer;
     zakup=new ArrayList<Zakup>();
     oplacony=false;
    }

    public void setZakup(ArrayList<Zakup> zakup) {
        this.zakup = zakup;
    }

    public ArrayList<Zakup> getZakup() {
        return zakup;
    }
    
    void zatwierdzRachunek()
    {
       oplacony=true;
    }
     public void DodajIloscDoZakupu(Produkt produkt,int ilosc)
    {
     for(int i=0;i<this.ileZakupow();i++)
     {
         if(this.zakup.get(i).getProdukt().equals(produkt))
         {
             this.zakup.get(i).setIlosc(ilosc+ this.zakup.get(i).getIlosc());
         }
     }
    }
    public void DodajNowyZakup(Zakup zakup)
    {
        this.zakup.add(zakup);
    }
    public void print()
    {   for(int i=0;i<this.zakup.size();i++)
        {
            System.out.println("Pozycja: "+i+", nazwa:" + this.zakup.get(i).getProdukt().getNazwa());
        }
    }
    public int ileZakupow()
    {
        return zakup.size();
    }
     public boolean czyJestZakup(Zakup zakup)
    {
        for(int i=0;i<this.ileZakupow();i++)
        {
            if(this.zakup.get(i).getProdukt().equals(zakup.getProdukt()))
                return true;
        }
        return false;
    }
    
}
