/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author huber
 */
public class server {
    Connection conn;
    Statement statement;
    int user=1;
    int product=1;
    public server() throws SQLException
    {
        conn=DriverManager.getConnection("jdbc:derby://localhost:1527/IO", "localhost", "localhost");
        System.out.println("Connection created");
        statement=conn.createStatement();
    }
    public void addUsertoDB(String imie,String nazwisko,String login,String haslo) throws SQLException
    {
        statement.executeUpdate("INSERT INTO UZYTKOWNICY(ID,NAZWISKO,IMIE,LOGIN,PASSWORD) values("+user+",'"+nazwisko+"','"+imie+"','"+login+"','"+haslo+"')");
        user++;
    }
    public void addProducttoDB(String nazwa,double cena,double promocja, double podatek, int ilosc) throws SQLException
    {
        statement.executeUpdate("INSERT INTO PRODUKTY(ID,NAZWA,CENA,PROMOCJA,PODATEK,ILOSC) values("+product+",'"+nazwa+"',"+cena+","+promocja+","+podatek+","+ilosc+")");
        product++;
    }
    public void readUsersFromDB(ListaUzytkownikow listaUzytkownikow) throws SQLException
    {
        ResultSet resultset=statement.executeQuery("SELECT * FROM UZYTKOWNICY");
        while(resultset.next())
        {
            int id=resultset.getInt("ID");
            String nazwisko=resultset.getString("NAZWISKO");
            String imie=resultset.getString("IMIE");
            String login=resultset.getString("LOGIN");
            String password=resultset.getString("PASSWORD");
            Uzytkownik uzytkownik=new Uzytkownik(id,imie,nazwisko,login,password);
            listaUzytkownikow.dodajUzytkownika(uzytkownik);
        }
    }
    public void readProductsFromDB(ListaProduktow listaproduktow) throws SQLException
    {
        ResultSet resultset=statement.executeQuery("SELECT * FROM PRODUKTY");
        while(resultset.next())
        {
            int id=resultset.getInt("ID");
            String nazwa=resultset.getString("NAZWA");
            float cena=resultset.getFloat("CENA");
            float xpromocja=resultset.getFloat("PROMOCJA");
            float xpodatek=resultset.getFloat("PODATEK");
            int ilosc=resultset.getInt("ILOSC");
            Promocja promocja=new Promocja(xpromocja);
            Podatek podatek= new Podatek(xpodatek);
            Produkt produkt=new Produkt(id,nazwa,cena,podatek,promocja);
            listaproduktow.dodajProduktdoKatalogu(produkt, ilosc);
        }
    }
}
