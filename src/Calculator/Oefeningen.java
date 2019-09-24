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
   
    public Button b1;
    public Text title;
    public TextField textfield;

    
    public Oefeningen (GridPane p){

        b1 = new Button ("Volgende som");
        b1.setMaxWidth(Double.MAX_VALUE);
        
        textfield = new TextField();
//        name = new Name();

        
        
        title = new Text ("Welkom "+/*name.getName()+*/", Vul het antwoord van de volgende som in?");

        p.setVgap(10);
        p.setHgap(10);
        p.setPadding(new Insets(10,10,10,10));
            
        
        p.add(title,0,1);
        p.add(textfield,0,2);
        p.add(b1,0,3);
        
   
                
    } 
    
    }
   