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
    
}
