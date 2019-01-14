
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
    
    private int numer;
    ArrayList<Zakup> zakup;
    boolean oplacony;
    
    public Rachunek(int numer)
    {
     this.numer=numer;
     zakup=new ArrayList<Zakup>();
     oplacony=false;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public boolean isOplacony() {
        return oplacony;
    }

    public void setOplacony(boolean oplacony) {
        this.oplacony = oplacony;
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
    @Override
    public boolean equals(Object rachunek){
        Rachunek rachunek1=(Rachunek)rachunek;
        if(rachunek1==null)
            return false;
        boolean bRachunek1=true;
        if(this.numer!=rachunek1.numer)
            bRachunek1=false;
        else if(this.oplacony!=rachunek1.oplacony)
            bRachunek1=false;
        else if(!this.getZakup().equals(rachunek1.getZakup()))
            bRachunek1=false;
        
        return bRachunek1;
    }
}
