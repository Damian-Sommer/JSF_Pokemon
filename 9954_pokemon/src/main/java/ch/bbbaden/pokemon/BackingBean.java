/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.bbbaden.pokemon;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author da_so
 */
@Named(value="backingBean")
@SessionScoped()
public class BackingBean implements Serializable{
    
    private String img = "";
    private String auswahl = "";
    public BackingBean(){
    }

    public String getImg() {
        return img;
    }

    public void setImg(String i) {
        this.img = i + img;
    }

    public String getAuswahl() {
        setAuswahl();
        trenneAuswahl();
        return auswahl;
    }

    public void setAuswahl() {
        this.auswahl = img;
    }
    private void trenneAuswahl(){
        String sb[] = new String[3];
        
        for(int i = 0; i < auswahl.length(); i++){
            switch (i) {
                case 0:
                    switch (auswahl.charAt(i)){
                        case 'b':
                            sb[i] = "Blonde";
                            break;
                        case 's':
                            sb[i] = "Schwarze";
                            break;
                    }   break;
                case 1:
                    switch (auswahl.charAt(i)){
                        case 'b':
                            sb[i] = "blaue";
                            break;
                        case 'g':
                            sb[i] = "grüne";
                            break;
                    }   break;
                case 2:
                    switch (auswahl.charAt(i)){
                        case 'h':
                            sb[i] = "helle";
                            break;
                        case 'd':
                            sb[i] = "dunkle";
                            break;
                    }   break;
                default:
                    break;
            } 
        }
        auswahl = "Deine Auswahl: "+sb[0]+" Haare, "+sb[1]+" Augen, "+sb[2]+" Haut.";
    }
    
}
