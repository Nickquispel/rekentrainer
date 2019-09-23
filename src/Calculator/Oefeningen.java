/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 *
 * @author nick
 */
public class Oefeningen {
    public Text t1,t2,t3,t4;
    public Name name;
    public Button b1;
    public String title;
    public TextField textfield;
    public RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8;
    
    public Oefeningen (GridPane p){
        
        t1 = new Text("Kies je groep:");
        t2 = new Text("Hoeveel sommen wil je maken?");
        t3 = new Text("Wil je de sommen door elkaar heen?");
        rb1 = new RadioButton("Groep 3");
        rb2 = new RadioButton("Groep 4");
        rb3 = new RadioButton("Groep 5");
        rb4 = new RadioButton("Groep 6");
        rb5 = new RadioButton("Groep 7");
        rb6 = new RadioButton("Groep 8");
        rb7 = new RadioButton("ja");
        rb8 = new RadioButton("nee");
        
        b1 = new Button ("Start rekentrainer");
        b1.setMaxWidth(Double.MAX_VALUE);
        
        textfield = new TextField();
        name = new Name();
        
        title = new String ("Keuze scherm");
        name.setTitle(title);
        
        p.setVgap(10);
        p.setHgap(10);
        p.setPadding(new Insets(10,10,10,10));
            
        
        p.add(t1,0,0);
        p.add(rb1,0,1);
        p.add(rb2,0,2);
        p.add(rb3,0,3);
        p.add(rb4,0,4);
        p.add(rb5,0,5);
        p.add(rb6,0,6);
        p.add(b1,2,6,2,2);
        p.add(t2,2,0);
        p.add(textfield,3,0);
        p.add(t3,2,1);
        p.add(rb7,3,2);
        p.add(rb8,3,3);
                
    } 
    
    }
   