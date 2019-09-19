/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 *
 * @author bignick
 * @version 1.0
 * De klasse Eventhandler vericht alle methoden en acties. Daarnaast zijn alle variabelen hier gedeclareert.
 * @see Name
 * @see PrimaryStage
 * 
 */
public class EventHandler {
    
    public Text title;
    public TextField textfield;
    public Button b1;

    public EventHandler (GridPane p) {
        
        
        title = new Text ("Vul hieronder je naam in om de rekentrainer te starten");
        textfield = new TextField();
        b1 = new Button ("Start");
        
        p.setVgap(10);
        p.setHgap(10);
        p.setPadding(new Insets(10,10,10,10));
        
        p.setAlignment(Pos.CENTER);
        p.add(title,0,1);
        p.add(textfield,0,2);
        p.add(b1,0,3);
    
}

}
