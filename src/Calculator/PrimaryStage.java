/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author bignick
 */
public class PrimaryStage extends Application {
    public Name name;
    public String title;
    
    @Override
    public void start(Stage primaryStage) {

    Startscherm startscherm = new Startscherm(primaryStage);
    
    name = new Name();
    title = new String ("Start scherm");
    name.setTitle(title);
    
   
    primaryStage.setTitle(" Rekentrainer - "+ name.getTitle());
    primaryStage.show();
    primaryStage.setFullScreen(false);
    primaryStage.setResizable(false);
    
    }
    
 
        
    public static void main(String[] args) {
        launch(args);
    }
    
}
