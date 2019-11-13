/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 *
 * @author nick
 */
public class OefeningenGen {
  
    public Name name;
    private int huidigeOpgave, getalA, getalB, antwoordGetal, aantal;
    private String operator,groep;
    private boolean random;
    public BufferedReader reader;
    private ArrayList <String[]> opgavenLijst;
    

    public OefeningenGen (Name name){
        this.name= name;
        aantal = name.getquantity();
        groep = name.getGroup();
        random = name.getRandom();        
        huidigeOpgave = 0;
        operator = " ";
        opgavenLijst = new ArrayList<String[]>();
        
        try{
        reader = new BufferedReader(new FileReader(groep));
        for (int i= 0; i< aantal; i++){
            String regel = reader.readLine();
            String[] opgave = regel.split(" ");
            opgavenLijst.add(opgave);
            }
        } catch(IOException ioe){
            ioe.printStackTrace();
        }
        genereerOpgave();
       
    } 

    
        public void genereerOpgave(){
            if(random == true) {
            huidigeOpgave = (int) (Math.random() * opgavenLijst.size());

            getalA = Integer.parseInt(opgavenLijst.get(huidigeOpgave)[0]);
            operator = opgavenLijst.get(huidigeOpgave)[1];
            getalB = Integer.parseInt(opgavenLijst.get(huidigeOpgave)[2]);
            antwoordGetal = Integer.parseInt(opgavenLijst.get(huidigeOpgave)[3]);
        }
        else if(random == false) {
            getalA = Integer.parseInt(opgavenLijst.get(huidigeOpgave)[0]);
            operator = opgavenLijst.get(huidigeOpgave)[1];
            getalB = Integer.parseInt(opgavenLijst.get(huidigeOpgave)[2]);
            antwoordGetal = Integer.parseInt(opgavenLijst.get(huidigeOpgave)[3]);

            huidigeOpgave++;
        }
    }

    public int getGetalA() {
        return getalA;
    }

    public int getGetalB() {
        return getalB;
    }

    public int getAntwoordGetal() {
        return antwoordGetal;
    }
    
    public String getOperator() { return operator; }

    public static int getFileLength(String groep) throws Exception {
        InputStream is = new BufferedInputStream(new FileInputStream(groep));
        try {
            byte[] c = new byte[1024];
            int count = 0;
            int readChars = 0;
            boolean empty = true;
            while ((readChars = is.read(c)) != -1) {
                empty = false;
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n') {
                        ++count;
                    }
                }
            }
            return (count == 0 && !empty) ? 1 : count;
        } finally {
            is.close();
        }
    }
    
    
}
        
        
        
        
    
    