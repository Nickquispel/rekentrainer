/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.io.IOException;

/**
 *
 * @author bignick
 */
public class Name {
    private String name = "";
    private String title = "";
    private String group = "";
    private int quantity = 0;
    boolean random;
        
    public void setName (String name){
        this.name ="";
        this.name += name;
    }
    
    public String getName () {
        return name;
    }
    
    public void setTitle (String title){
        this.title = "";
        this.title += title;
    }
    
    public String getTitle () {
        return title;
    }
    
    public void setGroup (String group){
        this.group = "";
        this.group += group;
    }
    
    public String getGroup () {
        return group;
    }
    
    public void setquantity(int quantity){
        this.quantity = 0;
        this.quantity = quantity;
    }
    
    public int getquantity(){
        return quantity;
    }
    
}
