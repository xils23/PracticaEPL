package interBket;


import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carles
 */
public class BsketMain {
    public static void main (String args[]) {
        Player p1 = new Player("Carles", "5",1.97, "Pívot", "23/6/1995", "Sicoris","Espanya");
        Player p2 = new Player ("Angel", "8", 1.94, "Aler", "19/2/1995", "Sicoris","Espanya");
        Player p3 = new Player ("Peirau", "4", 1.80, "Aler", "23/12/1995", "Sicoris","Espanya");
        Club c1 = new Club ("Sicoris", 1955, "Martin Cano");
        Club c2 = new Club ("Lleida", 1952, "Barris Nord");
        BasketDirectori bd = new BasketDirectori<>();
        bd.addClub(c1);
        bd.addClub(c2);
        bd.addPlayer(p1);
        bd.addPlayer(p2);
        bd.addPlayer(p3);
        bd.ContractPlayer(c1, p1);
        bd.ContractPlayer(c1, p3);
        bd.ContractPlayer(c2, p3);
        bd.ContractPlayer(c2, p1);
        System.out.println(bd.getClubInfo("Hello"));
        System.out.println(bd.getPlayerInfo("Kobe"));
        System.out.println(bd.getClubInfo("Lleida"));
        System.out.println(bd.getClubInfo("Sicoris"));
        System.out.println(bd.getPlayerInfo("5"));
        System.out.println(bd.getClubsPlayers("5"));
        
        
    }
    
}
