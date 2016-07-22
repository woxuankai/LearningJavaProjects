/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;

/**
 *
 * @author KayleXuan
 */
public class RootApplet extends javax.swing.JApplet {
    int number;
    
    public void init(){
        number = 10;
        number = (number++)*(number++);
    }
    
    public void paint(Graphics screen){
        Graphics2D screen2D = (Graphics2D) screen;
        screen2D.drawString("The square root of " + number + " is " + Math.sqrt(number),5,50);
    }
}
