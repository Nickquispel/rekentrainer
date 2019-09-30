/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author nick
 */
public class Keuzescherm {
    public Text t1,t2,t3,t4;
    public Name name;
    public Button b1;
    public String title;
    public TextField textfield;
    public RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8;
    public ToggleGroup group1,group2;
    
    public Keuzescherm (Stage primaryStage){
        GridPane p = new GridPane();
        Scene scene = new Scene(p,450,250);
        
        primaryStage.setScene(scene);
        
        
        group1 = new ToggleGroup();
        group2 = new ToggleGroup();
        
        t1 = new Text("Kies je groep:");
        t2 = new Text("Hoeveel sommen wil je maken?");
        t3 = new Text("Wil je de sommen door elkaar heen?");
        rb1 = new RadioButton("Groep 3");
        rb1.setToggleGroup(group1);
        rb2 = new RadioButton("Groep 4");
        rb2.setToggleGroup(group1);
        rb3 = new RadioButton("Groep 5");
        rb3.setToggleGroup(group1);
        rb4 = new RadioButton("Groep 6");
        rb4.setToggleGroup(group1);
        rb5 = new RadioButton("Groep 7");
        rb5.setToggleGroup(group1);
        rb6 = new RadioButton("Groep 8");
        rb6.setToggleGroup(group1);
        rb7 = new RadioButton("ja");
        rb7.setToggleGroup(group2);
        rb8 = new RadioButton("nee");
        rb8.setToggleGroup(group2);
        
        b1 = new Button ("Start rekentrainer");
        b1.setMaxWidth(Double.MAX_VALUE);
        
        textfield = new TextField();
      
        
        title = new String ("Keuze scherm");
        primaryStage.setTitle(" Rekentrainer - Keuze scherm ");
        
        b1.setOnAction(event->{
            RadioButton selectedRadioButton = (RadioButton) group1.getSelectedToggle();
            String toggleGroupValue = selectedRadioButton.getText();
            name.setGroup(toggleGroupValue);
            textfield.setText(name.getGroup());
//            new Oefeningen(primaryStage);
        });
        
        
        
        p.setVgap(10);
        p.setHgap(10);
        p.setPadding(new Insets(10,10,10,10));
            
        
        p.add(t1,0,1);
        p.add(rb1,0,2);
        p.add(rb2,0,3);
        p.add(rb3,0,4);
        p.add(rb4,0,5);
        p.add(rb5,0,6);
        p.add(rb6,0,7);
        p.add(b1,2,6,2,2);
        p.add(t2,2,1);
        p.add(textfield,3,1);
        p.add(t3,2,2);
        p.add(rb7,3,3);
        p.add(rb8,3,4);
                
    } 
    
    }
   