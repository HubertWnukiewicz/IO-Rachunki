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
public class Zakup {
    
    private Produkt produkt;
    private int ilosc;

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }
    
    public int getIlosc()
    {
        return ilosc;
    }
    public Zakup( Produkt produkt, int ilosc)
    {
        this.ilosc=ilosc;
        this.produkt=produkt;
    }
    public void printZakup()
    {
        System.out.println("Nazwa: " + this.produkt.getNazwa() +", ilosc:" + this.ilosc);
    }
    
    
    
}
