/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 *
 * @author nick
 */
public class Settings {
    public Text t1,t2,t3,t4;
      
    
    public Settings (GridPane c){
        t1 = new Text("Kies je groep:");
        t2 = new Text("Hoeveel sommen wil je maken?");
        t3 = new Text("Wil je de sommen door elkaar heen?");
        
        
        c.add(t1,0,0);
        c.add(t2,0,1);
        c.add(t3,0,2);
                
        
    
    }
}
