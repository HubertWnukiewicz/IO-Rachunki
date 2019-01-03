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
public class Produkt {
    
    private String nazwa;
    private float cena;
    private Promocja promocja;
    private Podatek podatek;
    
    public Produkt(String nazwa, float cena, Podatek podatek)
    {
        this.nazwa=nazwa;
        this.cena=cena;
        this.podatek=podatek;
    }
    public Produkt(String nazwa, float cena, Podatek podatek, Promocja promocja)
    {
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

    public Promocja getPromocja() {
        return promocja;
    }

    public Podatek getPodatek() {
        return podatek;
    }
}
