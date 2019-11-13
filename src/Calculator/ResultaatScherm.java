/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import static java.lang.String.format;
import java.text.DecimalFormat;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author nick
 */
public class ResultaatScherm {
   
    private Button b1,b2;
    private Text title;
    private Name name;
    private TextArea textfield;
    private int aantalGoed, aantalFout;
    

    
    public ResultaatScherm (Stage primaryStage, Name name, int aantalGoed, int aantalFout){
        this.name = name;
        
        primaryStage.setTitle(" Rekentrainer - Resultaat " + name.getName());
        
        GridPane p = new GridPane();
        Scene scene = new Scene(p,550,220);
            
        primaryStage.setScene(scene);
        DecimalFormat df = new DecimalFormat("#.00"); 
        
        
        b1 = new Button ("Nog een keer");
        b2 = new Button ("Stoppen");
        textfield = new TextArea ("Aantal sommen goed: "+aantalGoed+"\nAantal sommen fout: "+ aantalFout + "\nscore "+df.format(((name.getquantity()-aantalFout)/(double) name.getquantity()*100))+ "%");
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
    
    