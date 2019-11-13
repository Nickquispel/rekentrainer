/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author nick
 */
public class Oefeningen {
   
    private Button b1;
    private Text title, text1;
    private TextField AntwoordVak;
    private TextArea textfield2;
    private Name name;
    private OefeningenGen oefeningenGen;
    private int input,aantal,aantalGoed,aantalFout,aantalTeGaan;
    private boolean random;
    private String groep;
    
   
    
    public Oefeningen (Stage primaryStage, Name name){
        this.name = name;
        groep = name.getGroup();
        aantal = name.getquantity();
        random = name.random;
        
        aantalGoed = 0;
        aantalFout = 0;
        aantalTeGaan = aantal;
        
        
        oefeningenGen = new OefeningenGen(name);
        
        /**
         * Setting up Primary Stage
        */
        primaryStage.setTitle(" Rekentrainer - " + name.getGroup());
        GridPane p = new GridPane();
        Scene scene = new Scene(p,450,220);
        primaryStage.setScene(scene);
        
         /**
          * Setting up GUI
          */       
         title = new Text ("Welkom "+ name.getName()+ ",  Vul het antwoord van de volgende som in?");
         text1 = new Text("  "+oefeningenGen.getGetalA()+"  "+oefeningenGen.getOperator()+"  "+oefeningenGen.getGetalB()+"  = ");
         text1.setFont(Font.font ("Verdana", 20));
         text1.setTextAlignment(TextAlignment.CENTER);
         
         
         AntwoordVak = new TextField();
         textfield2 = new TextArea("Aantal sommen tot nu toe goed: " + aantalGoed +"\nAantal sommen tot nu toe fout: "+ aantalFout +"\nNog "+ aantalTeGaan +" sommen te maken");
         textfield2.setEditable(false);
         textfield2.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
         textfield2.setFont(Font.font ("Verdana", 14));
        
         b1 = new Button ("Volgende som");

         /**
          * Positioning GUI
          */
        title.setTextAlignment(TextAlignment.CENTER);
        AntwoordVak.setAlignment(Pos.CENTER);
        b1.setMaxWidth(Double.MAX_VALUE);
        p.setAlignment(Pos.CENTER);
        p.setVgap(10);
        p.setHgap(10);
        p.setPadding(new Insets(10,10,10,10));
        
        
        p.add(title,0,1,2,1);
        p.add(text1,0,2);
        p.add(AntwoordVak,1,2);
        p.add(b1,0,3);
        p.add(textfield2,0,4,2,2);

        /**
         * Event handler
         */
        b1.setOnAction(event ->{
            
            try{
                input = Integer.parseInt(AntwoordVak.getText());
            }catch(NumberFormatException nfe) {
                nfe.printStackTrace();
                System.out.println("NumberFormatException in invulVak");
            }
            
            if(input == oefeningenGen.getAntwoordGetal()) {
                aantalGoed++;
            }
            else{
                aantalFout++;
            }
            aantalTeGaan--;
            
            if (aantalTeGaan == 1){
                b1.setText("Naar resultaat");
            }
            if (aantalTeGaan > 0){
                refresh();
            }
            if (aantalTeGaan == 0){
                new ResultaatScherm(primaryStage, name, aantalGoed,aantalFout);
            }
        });
        
        
        AntwoordVak.setOnAction(event ->{
            
            try{
                input = Integer.parseInt(AntwoordVak.getText());
            }catch(NumberFormatException nfe) {
                nfe.printStackTrace();
                System.out.println("NumberFormatException in invulVak");
            }
            
            if(input == oefeningenGen.getAntwoordGetal()) {
                aantalGoed++;
            }
            else{
                aantalFout++;
            }
            aantalTeGaan--;
            
            if (aantalTeGaan == 1){
                b1.setText("Naar resultaat");
            }
            if (aantalTeGaan > 0){
                refresh();
            }
            if (aantalTeGaan == 0){
                new ResultaatScherm(primaryStage, name, aantalGoed,aantalFout);
            }
        });
                
    } 
    
     public void refresh() {
        oefeningenGen.genereerOpgave();
        text1.setText(oefeningenGen.getGetalA() + "  " + oefeningenGen.getOperator() + "  " + oefeningenGen.getGetalB() + "   = ");
        textfield2.setText("Aantal sommen tot nu toe goed: " + aantalGoed +"\nAantal sommen tot nu toe fout: "+ aantalFout +"\nNog "+ aantalTeGaan +" sommen te maken");
        AntwoordVak.setText("");

    
    }
}
        
        
        
        
    
    