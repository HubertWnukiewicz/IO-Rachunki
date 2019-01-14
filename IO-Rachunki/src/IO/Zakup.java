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
     public void setIlosc(int ilosc)
    {
        this.ilosc=ilosc;
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
     public Zakup UtworzZakup(Produkt produkt, int ilosc, ListaProduktow listaProduktow)
    {
        if(listaProduktow.szukajProdukt(produkt)==true)
        {
            if(listaProduktow.getIloscProduktu(produkt)>=ilosc)
            {   
                int value=listaProduktow.getIloscProduktu(produkt)-ilosc;
                listaProduktow.setIloscProduktu(produkt,value);
                Zakup zakup=new Zakup(produkt, ilosc);
                return zakup;
            }
            else
                System.out.println("Brak takiej ilości towaru");
        }
        return null;
    }
    
    @Override
    public boolean equals(Object zakup){
     Zakup zakup1=(Zakup)zakup;
     if(zakup1==null)
         return false;
     boolean bZakup1=true;
     if(this.ilosc!=zakup1.getIlosc())
         bZakup1=false;
     else if(!this.produkt.equals(zakup1.getProdukt()))
         bZakup1=false;
     
     return bZakup1;
    }
}
