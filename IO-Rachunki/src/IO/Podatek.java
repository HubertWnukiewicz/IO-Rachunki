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
public class Podatek {
     private float wartoscPodatku;

    public Podatek(float wartoscPodatku) {
        this.wartoscPodatku = wartoscPodatku;
    }

    public float getWartoscPodatku() {
        return wartoscPodatku;
    }

    public void setWartoscPodatku(float wartoscPodatku) {
        this.wartoscPodatku = wartoscPodatku;
    }
    @Override
    public boolean equals(Object podatek){
        Podatek podatek1=(Podatek)podatek;
     if(podatek1==null)
         return false;
     
     boolean bPodatek1=true;
     if(this.wartoscPodatku!=podatek1.getWartoscPodatku())
         bPodatek1=false;
     
     return bPodatek1;
    }
     
     
}
