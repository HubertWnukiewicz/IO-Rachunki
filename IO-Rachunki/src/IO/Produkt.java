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
public class Produkt {
    
    int id;
    private String nazwa;
    private float cena;
    private Promocja promocja;
    private Podatek podatek;
    
    public Produkt(int id,String nazwa, float cena, Podatek podatek)
    {
        this.id=id;
        this.nazwa=nazwa;
        this.cena=cena;
        this.podatek=podatek;
    }
    public Produkt(int id,String nazwa, float cena, Podatek podatek, Promocja promocja)
    {
        this.id=id;
        this.nazwa=nazwa;
        this.cena=cena;
        this.podatek=podatek;
        this.promocja=promocja;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public void setPromocja(Promocja promocja) {
        this.promocja = promocja;
    }

    public void setPodatek(Podatek podatek) {
        this.podatek = podatek;
    }
    public String getNazwa() {
        return nazwa;
    }

    public float getCena() {
        return cena;
    }
     public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id=ID;
    }
    
    public Promocja getPromocja() {
        return promocja;
    }

    public Podatek getPodatek() {
        return podatek;
    }
    
    @Override
    public boolean equals(Object produkt){

     Produkt produkt1=(Produkt)produkt;
     if(produkt1==null)
         return false;
     boolean bProdukt1=true;
     
     if(!this.nazwa.equals(produkt1.getNazwa()))
         bProdukt1=false;
     else if(this.id!=produkt1.getID())
         bProdukt1=false;
     else if(this.cena!=produkt1.cena)
         bProdukt1=false;
     else if(!this.podatek.equals(produkt1.podatek))
         bProdukt1=false;
     //else if(!this.promocja.equals(produkt1.promocja))
         //bProdukt1=false;
     
     return bProdukt1;
    }
}