/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author nick
 */
public class Resultaat {
   
    public Button b1,b2;
    public Text title;
    public Name name;
    public TextArea textfield;
    

    
    public Resultaat (Stage primaryStage, Name name){
        this.name = name;
        
        primaryStage.setTitle(" Rekentrainer - Resultaat " + name.getName());
        
        GridPane p = new GridPane();
        Scene scene = new Scene(p,550,250);
            
        primaryStage.setScene(scene);

        
        
        b1 = new Button ("Nog een keer");
        b2 = new Button ("Stoppen");
        textfield = new TextArea ("Aantal sommen goed: \nAantal sommen fout: \nscore");
        textfield.setEditable(false);
        
        title = new Text ("Je hebt de  opdracht afgerond " + name.getName() + ", hieronder zie je wat je resultaat is");
        
        title.setTextAlignment(TextAlignment.CENTER);
        
        textfield.setPrefHeight(60);
        
        b1.setOnAction(event ->{
        
            new Keuzescherm(primaryStage,name);
        });
        
        b2.setOnAction(event ->{
            Platform.exit();
        });
        
        
        
        p.setVgap(10);
        p.setHgap(10);
        p.setPadding(new Insets(10,10,10,10));
            
        
        p.add(title,0,1);
        p.add(textfield,0,2 ,2,1);
        p.add(b1,0,3);
        p.add(b2,1,3);
        
        
        
   
                
    } 
}
    
    