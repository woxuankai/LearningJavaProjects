/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playback;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author KayleXuan
 */



public class Playback extends JFrame {
    public Playback() {
//        super("Salution mondo!");
        super();
        super.setTitle("Playback");
        this.setLookAndFeel();
        super.setSize(500,200);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        super.setLayout(flo);
        addJButton();
         addJLabel_and_TextField();
        addCheckBox();
        addJComboBox();
        addJTextArea();
        addJPanel();

        super.setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
//            UIManager.setLookAndFeel(
//                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
//            );
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception exc) {
            // ignore error
        }
    }
    
    
    private void addJButton() {
        
        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pause = new JButton("Pause");
        super.add(play);
        super.add(stop);
        super.add(pause);
    }
    
    private void addJLabel_and_TextField() {
        
        JLabel pagelabel = new JLabel();
//        pagelabel.setHorizontalAlignment(JLabel.LEFT);
        pagelabel.setText("String1: ");
        super.add(pagelabel);
        
        JTextField pageaddress = new JTextField(20);
        super.add(pageaddress);
        
    }
    
    private void addCheckBox() {
        JCheckBox jumbSize = new JCheckBox("Jumb Size",true);
        super.add(jumbSize);
        
        JCheckBox food0 = new JCheckBox("Food0");
        JCheckBox food1 = new JCheckBox("Food1");
        JCheckBox food2 = new JCheckBox("Food2");
        JCheckBox food3 = new JCheckBox("Food3");
        
        ButtonGroup meals = new ButtonGroup();
        meals.add(food0);
        meals.add(food1);
        meals.add(food2);
        meals.add(food3);
        
        super.add(food0);
        super.add(food1);
        super.add(food2);
        super.add(food3);
        
    }
    
    private void addJComboBox() {
        JComboBox profession = new JComboBox();
        profession.addItem("Pro0");
        profession.addItem("Pro1");
        profession.addItem("Pro2");
        profession.addItem("Pro3");
        profession.addItem("Pro4");
        profession.addItem("Pro5");
        
        profession.setEditable(true);
        
        super.add(profession);
    }
    
    private void addJTextArea() {
        JTextArea comments = new JTextArea("sdfsdf\nsdfasdf\nsfa",8,40);
        super.add(comments);
    }
    
    private void addJPanel() {
        JPanel topRow = new JPanel();
        super.add(topRow);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Playback pb = new Playback();
    }
    
}
