/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carles
 */
public class Player {
    private String name;
    private String NIF;
    private String country;
    private double height;
    private String position;
    private String born;
    private String club;
    public Player (String name, String NIF, double height, String position, String born, String club, String country){
        this.NIF = NIF;
        this.name = name;
        this.height = height;
        this.position = position;
        this.born = born;
        this.club = club;
        this.country = country;        
        
    }
    public String getName(){
        return this.name;
    }
    public String getNIF(){
        return this.NIF;
    }
    public String getPosition(){
         return this.position;
     }
    public String getBorn(){
         return this.born;
     }
    public String getClub(){
         return this.club;
     }
    public double getHeight(){
          return this.height;
      }
    public String getCountry(){
        return this.country;
    }
    public void SetClub (String newClub){
        this.club = newClub;
    }
}
