/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package IO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


/**
 *
 * @author Admin
 */
public class ListaProduktow {
    
    //private ArrayList<Produkt> produkty=new ArrayList<Produkt>();
    private Map<Produkt, Integer> katalog=new HashMap<>();//=new TreeMap<>();
/*
    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }
    public void setProdukty(ArrayList<Produkt> produkty) {
        this.produkty = produkty;
    }
    
    public void dodajProdukt(Produkt produkt)
    {
        produkty.add(produkt);
    }
    public boolean szukajProdukt(Produkt produkt)
    {
        for (Produkt produkty1 : produkty) {
            if(produkty1.equals(produkt))
                return true;
        }
        return false;
    }*/
    //////////////////////////////////////////////////////////////////////////////////////////////

    public Map<Produkt, Integer> getKatalog() {
        return katalog;
    }

    public void setKatalog(Map<Produkt, Integer> katalog) {
        this.katalog = katalog;
    }
    public boolean szukajProdukt(Produkt produkt)
    {
        if(katalog.get(produkt)!=null)
            return true;
        return false;
    }
    public void dodajProduktdoKatalogu(Produkt produkt, int Ilosc)
    {
        katalog.put(produkt, Ilosc);
    }
    public int getIloscProduktu(Produkt produkt)
    {
        if(szukajProdukt(produkt)==true)
            return katalog.get(produkt);
        return -1;
    }
    
    public void setIloscProduktu(Produkt produkt, int ilosc)
    {
        if(szukajProdukt(produkt)==true)
            katalog.replace(produkt, ilosc);
    }
    public void printAll()
    {
        int i=0;
        System.out.println("Wielkosc" + katalog.size());
       for (Produkt produkt: katalog.keySet())
        {
            
            String name =produkt.getNazwa();
             float cena =produkt.getCena();
            System.out.println("Numer: " + i +", nazwa: " + name + " ,cena: "+cena+ " ,ilość: "+getIloscProduktu(produkt)+", id_produktu: "+produkt.getID()); 
            i++;

        } 
    }
}