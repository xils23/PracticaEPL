
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carles
 */
public class BasketDirectori<C,P> {
    Map<Club,List<Player>> Directori;
    Map<Player, List<Club>> PlayersDir;
    Map<String, Player> AllPlayers;
    Map<String, Club> AllClubs;
    public BasketDirectori(){
        this.Directori = new HashMap<>();
        this.PlayersDir = new HashMap<>();
        this.AllPlayers = new HashMap<>();
        this.AllClubs = new HashMap<>();
        
    }
    public void addClub(Club c){
     
           this.Directori.put(c, new LinkedList <Player>());
           this.AllClubs.put(c.getName(), c);
           
    }
    public void addPlayer (Player p){
            this.AllPlayers.put(p.getNIF(), p);
            this.PlayersDir.put(p, new LinkedList <Club>());
             }
    public void ContractPlayer (Club c, Player p){
         
        if(!this.PlayersDir.get(p).isEmpty()){
            Iterator<Club> it = this.PlayersDir.get(p).iterator();
            while(it.hasNext()){
                Club club = it.next();
                if(this.Directori.get(club).contains(p)){
                    this.Directori.get(club).remove(p);
                }
                else{
                    it.next();
                }
            }
        }
           
         if(!this.Directori.get(c).contains(p)){
            this.Directori.get(c).add(p);
            p.SetClub(c.getName());
        }
       if(!this.PlayersDir.get(p).contains(c)){
            this.PlayersDir.get(p).add(c);
        }
            
    }
    public String getClubInfo (String Name){
        if(this.AllClubs.containsKey(Name)){
        return "Club: {"+ Name +"} " + " Players: {" + Players(this.AllClubs.get(Name))+"}";
            }
        else{
            return "This player doesn't exist";
        }
    }
    public String getPlayerInfo (String NIF){
        if(this.AllPlayers.containsKey(NIF)){
            return "Player data:\n Player name:{ " + this.AllPlayers.get(NIF).getName()+ " }" + " NIF:{ " + NIF + " } " + " Height:{ "+this.AllPlayers.get(NIF).getHeight()+" } " 
                    +" Birth:{ "+this.AllPlayers.get(NIF).getBorn() + " } " + " Position: { " + this.AllPlayers.get(NIF).getPosition() + " } " 
                    + " Club name: { " + this.AllPlayers.get(NIF).getClub() + " } "
                    +" Country: { " + this.AllPlayers.get(NIF).getCountry() + " } " ;
        }
        return "This player doesn't exist";
    }
    public String getClubsPlayers (String NIF){
        if(this.AllPlayers.containsKey(NIF)){
            return "Player: " + "{ " +this.AllPlayers.get(NIF).getName() +" }" + " Clubs: { " + Clubs(this.AllPlayers.get(NIF))+ " }";
        }
        else{
            return "This club doesn't exist";
        }
    }
        

//Funcions auxiliars
    public String Players (Club c){
      Iterator<Player> list = Directori.get(c).iterator();
      String Play = new String();
      while (list.hasNext()){
        Play += list.next().getName();
        if (list.hasNext()){
            Play += ", ";
        }
      }
      return Play;
    }
     public String Clubs (Player p){
      Iterator<Club> list = PlayersDir.get(p).iterator();
      String Cl = new String();
      
      while (list.hasNext()){
        Cl += list.next().getName();
        if (list.hasNext()){
            Cl += ", ";
       }
      }
      return Cl;
    }
    
    }
