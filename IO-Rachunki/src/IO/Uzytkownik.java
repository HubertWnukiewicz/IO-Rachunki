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
public class Uzytkownik 
{
    private String imie;
    private String nazwisko;
    private int id;
    private String email;
    private String password;
    
public Uzytkownik(String imie, String nazwisko, int id,String email)
{
    this.imie=imie;
    this.nazwisko=nazwisko;
    this.id=id;
    this.email=email;
}
public Uzytkownik()
{
   
}
  public String getImie()
  {
      return imie;
  }
  public void setImie(String imie)
  {
      this.imie=imie;
  }
  public String getNazwisko()
  {
    return null;
  } 
  public void setNazwisko(String nazwisko)
  {
      this.nazwisko=nazwisko;
  }
  public int getID()
  {
      return id;
  }
  public void setID(int id)
  {
     this.id=id;
  }
  public void setEmail(String email)
  {
      this.email=email;
  }
  public String getEmail()
  {
      return email;
  }
  public float podajWartoscRachunkuZPodatkiem(int nr)
  {
      return 0; //TODO
  }
      
}
