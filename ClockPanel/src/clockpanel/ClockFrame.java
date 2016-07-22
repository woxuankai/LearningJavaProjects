/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockpanel;
import java.awt.*;
import javax.swing.*;
        
        
/**
 *
 * @author KayleXuan
 */
public class ClockFrame extends JFrame {
    public ClockFrame() {
        super("Clock");
        this.setLookAndFeel();
        super.setSize(225,125);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        ClockPanel time = new ClockPanel();
        super.add(time);
        super.setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception exc){
            //Ignore error
        }
    }
    
    
    public static void main(String[] args) {
        ClockFrame clock = new ClockFrame();
    }
}
