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
    
    /**
     *
     * @param name
     */
    public void setName (String name){
        this.name ="";
        this.name += name;
    }
    
    /**
     *
     * @return name
     */
    public String getName () {
        return name;
    }
    
    /**
     *
     * @param title
     */
    public void setTitle (String title){
        this.title = "";
        this.title += title;
    }
    
    /**
     *
     * @return title
     */
    public String getTitle () {
        return title;
    }
    
    /**
     *
     * @param group
     */
    public void setGroup (String group){
        this.group = "";
        this.group += group;
    }
    
    /**
     *
     * @return group
     */
    public String getGroup () {
        return group;
    }
    
    /**
     *
     * @param quantity
     */
    public void setquantity(int quantity){
        this.quantity = 0;
        this.quantity = quantity;
    }
    
    /**
     *
     * @return quantity
     */
    public int getquantity(){
        return quantity;
    }
    
    public void setRandom (boolean random){
        this.random = random;
    }
    
    /**
     *
     * @return name
     */
    public boolean getRandom () {
        return random;
    }
}
