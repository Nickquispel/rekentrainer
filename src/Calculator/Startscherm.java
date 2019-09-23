/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author bignick
 * @version 1.0
 * De klasse Eventhandler vericht alle methoden en acties. Daarnaast zijn alle variabelen hier gedeclareert.
 * @see Name
 * @see PrimaryStage
 * 
 */
public class Startscherm{
    
    public Text title;
    public TextField textfield;
    public Button b1;
    public Name name;
    public Alert alert;
    
    
    
    public Startscherm (GridPane p) {
        
        
        title = new Text ("Vul hieronder je naam in om de rekentrainer te starten");
        textfield = new TextField();
        b1 = new Button ("Start");
        name = new Name();
        GridPane root = new GridPane();

                
        p.setVgap(10);
        p.setHgap(10);
        p.setPadding(new Insets(10,10,10,10));
        
        p.setAlignment(Pos.CENTER);
        p.add(title,0,1);
        p.add(textfield,0,2);
        p.add(b1,0,3);
        
        b1.setOnAction(event -> {
            
            String invoer = textfield.getText().toString();
            if (invoer.equals("")){
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Waarschuwing");
                    alert.setHeaderText(null);
                    alert.setContentText("Je bent je naam vergeten in te vullen.");

                    alert.showAndWait();
            }else{
                  name.setName(invoer);
                  
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Welkom");
                    alert.setHeaderText(null);
                    alert.setContentText("Hallo " + name.getName() +", succes met de oefeningen.");
                    
                    alert.showAndWait();
                    
                    };
            
            
            
            
        });
    
}

}
