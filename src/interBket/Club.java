package interBket;


import java.util.Date;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carles
 */
public class Club {
    private String name;
    private int fundationYear;
    private String presName;
    
    public Club (String Name, int fundationYear, String presName){
        this.name = Name;
        this.fundationYear = fundationYear;
        this.presName = presName;
    }
    public String getName(){
        return this.name;
    }
    public String getPresName(){
        return this.presName;
    }
    public int getFundationYear (){
        return this.fundationYear;
    }
}
