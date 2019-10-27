/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    public Text title, text1;
    public TextField textfield, textfield2;
    public Name name;
    public BufferedReader reader;

    
    public Oefeningen (Stage primaryStage, Name name){
        this.name = name;
        
        primaryStage.setTitle(" Rekentrainer - " + name.getGroup());
        
        GridPane p = new GridPane();
        Scene scene = new Scene(p,450,250);
        
        primaryStage.setScene(scene);

        try{
        reader = new BufferedReader(new FileReader("groep3"));
        } catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        
        b1 = new Button ("Volgende som");
        
        
        textfield = new TextField();
        textfield2 = new TextField("Aantal sommen tot nu toe goed: \nAantal sommen tot nu toe fout: \n Nog sommen te gaan");
        textfield2.setEditable(false);
        textfield2.setAlignment(Pos.CENTER_RIGHT);
        
        text1 = new Text("test");

        
        title = new Text ("Welkom "+ name.getName()+ ",  Vul het antwoord van de volgende som in?");

        title.setTextAlignment(TextAlignment.CENTER);
        textfield.setAlignment(Pos.CENTER);
        b1.setMaxWidth(Double.MAX_VALUE);
        p.setAlignment(Pos.CENTER);
        p.setVgap(10);
        p.setHgap(10);
        p.setPadding(new Insets(10,10,10,10));
            
        
        p.add(title,0,1);
        p.add(text1,0,2);
        p.add(textfield,1,2);
        p.add(b1,0,3);
        p.add(textfield2,0,4,2,2);
        
        
   
                
    } 
}
    
    