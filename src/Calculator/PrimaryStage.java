/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.awt.Image;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author bignick
 */
public class PrimaryStage extends Application {
    
    public String title;
    
    @Override
    public void start(Stage primaryStage) {
    GridPane root = new GridPane();
    Scene scene = new Scene(root,450,200);
    
    title = new String ("Start scherm");
    
    
    new EventHandler(root);
    
    primaryStage.setScene(scene);
    primaryStage.setTitle(" Rekentrainer - "+ title);
    primaryStage.show();
    primaryStage.setFullScreen(false);
    primaryStage.setResizable(false);
    
    }
    
 
        
    public static void main(String[] args) {
        launch(args);
    }
    
}
