/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author KayleXuan
 */
public class KeyViewer extends JFrame implements KeyListener {
    
    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press any key in the text field");
    
    public KeyViewer() {
        super("KeyViewer");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception exc) {
            //ignore error
        }
        this.setSize(350,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyText.addKeyListener(this);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
        this.setVisible(true);
    }
    
    public void keyTyped(KeyEvent input) {
        char key = input.getKeyChar();
        keyLabel.setText("You pressed " + key);
    }
    
    public void keyReleased(KeyEvent txt){
        //do nothing
    }
    
    public void keyPressed(KeyEvent txt) {
        //do nothing
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KeyViewer frame = new KeyViewer();
    }
    
}
