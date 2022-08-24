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
@Named(value="navigationBean")
@SessionScoped()
public class NavigationBackingBean implements Serializable{
    
    public NavigationBackingBean(){
    }
       
    public String augenfarbe(){
        return "/index1.xhtml";
    }
    
    public String haarfarbe(){
        return "/index2.xhtml";
    }
    public String last(){
        return "/indexLast.xhtml";
    }
}
