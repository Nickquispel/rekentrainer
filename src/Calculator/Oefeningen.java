/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author nick
 */
public class Oefeningen {
   
    public Button b1;
    public Text title;
    public TextField textfield;
    public Name name;

    
    public Oefeningen (Stage primaryStage){
        GridPane p = new GridPane();
        Scene scene = new Scene(p,430,300);
        
        primaryStage.setScene(scene);
//        primaryStage.setTitle(" Rekentrainer "+ name.getGroup());

        b1 = new Button ("Volgende som");
        b1.setMaxWidth(Double.MAX_VALUE);
        
        textfield = new TextField();

        title = new Text ("Welkom "+ name.getName() +", Vul het antwoord van de volgende som in?");

        title.setTextAlignment(TextAlignment.CENTER);
        b1.setMaxWidth(Double.MAX_VALUE);
        p.setVgap(10);
        p.setHgap(10);
        p.setPadding(new Insets(10,10,10,10));
            
        
        p.add(title,0,1);
        p.add(textfield,0,2);
        p.add(b1,0,3);
        
   
                
    } 
}
    
    