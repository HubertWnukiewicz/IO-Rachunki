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
    private String login;
    private String haslo;
    
public Uzytkownik( int id,String imie, String nazwisko,String login,String haslo)
{
    this.imie=imie;
    this.nazwisko=nazwisko;
    this.id=id;
    this.login=login;
    this.haslo=haslo;
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

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
  
  public void setID(int id)
  {
     this.id=id;
  }
  public void setLogin(String login)
  {
      this.login=login;
  }
  public String getLogin()
  {
      return login;
  }
  public boolean weryfikacja(String login ,String haslo) 
  {
      if(this.login.equals(login) && this.haslo.equals(haslo))
          return true;
                  
    return false;
  }
      
}
