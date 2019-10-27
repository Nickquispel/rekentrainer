/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
    public Button b1;
    public String title;
    public TextField textfield;
    public RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8;
    public ToggleGroup group1,group2;
    public Name name;
    public boolean random;
    
    public Keuzescherm (Stage primaryStage, Name name){
        this.name = name;
        
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
        
        b1.setOnAction(event-> {
            RadioButton selectedRadioButton = (RadioButton) group1.getSelectedToggle();
            RadioButton selectedRadioButton2 = (RadioButton) group2.getSelectedToggle();
  
            if (selectedRadioButton == null){
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("test");
                    alert.setHeaderText(null);
                    alert.setContentText("Kies een groep");           
                    alert.showAndWait();  
                    return;
            }
            
            if (textfield.getText().isEmpty()){
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("test");
                    alert.setHeaderText(null);
                    alert.setContentText("Kies hoeveel sommen je wilt doen");           
                    alert.showAndWait(); 
                    return;
            }
            
            if (Integer.parseInt(textfield.getText()) > 15){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("test");
                    alert.setHeaderText(null);
                    alert.setContentText("Kies een aantal tussen 1 en 15 ");           
                    alert.showAndWait();  
                    return;
            }
            
            if (selectedRadioButton2 == null){
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("test");
                    alert.setHeaderText(null);
                    alert.setContentText("Kies of je de sommen door elkaar heen wil ");           
                    alert.showAndWait();  
                    return;
            }
            
            String toggleGroupValue = selectedRadioButton.getText();
            String toggleGroupValue2 = selectedRadioButton2.getText();
            name.setGroup(toggleGroupValue);
            
            int quantity = Integer.parseInt(textfield.getText());
            name.setquantity(quantity);
            
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("test");
                    alert.setHeaderText(null);
                    if (toggleGroupValue2 == "ja"){
                    alert.setContentText("Je krijgt nu "  +name.getquantity() + " sommen van " + name.getGroup()+ " door elkaar heen"); 
                    } else{alert.setContentText("Je krijgt nu "  +name.getquantity() + " sommen van " + name.getGroup()+ " op volgorde"); }
                    alert.showAndWait();
            
          new Oefeningen(primaryStage,name);
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
   