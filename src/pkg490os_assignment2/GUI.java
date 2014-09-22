/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg490os_assignment2;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Jose
 */
public class GUI extends JFrame {
    
        public GUI(){
            super("GUI");
                        
            JLabel codeLabel = new JLabel("Course Code:");
            codeLabel.setPreferredSize(new Dimension(90, 20));
            JLabel nameLabel = new JLabel("Course Name:");
            nameLabel.setPreferredSize(new Dimension(90, 20));
            JLabel creditsLabel = new JLabel("No. Of Credits:");
            creditsLabel.setPreferredSize(new Dimension(90, 20));
            JLabel departmentLabel = new JLabel("Department");
            departmentLabel.setPreferredSize(new Dimension(90, 20));
            JButton addButton = new JButton("Add course");
            addButton.setPreferredSize(new Dimension(90, 20));
            JButton displayAllButton = new JButton("Display all");
            displayAllButton.setPreferredSize(new Dimension(100, 20));
            JButton displayButton = new JButton("Display (dept)");
            displayButton.setPreferredSize(new Dimension(100, 20));
            JTextField codeText = new JTextField();
            codeText.setPreferredSize(new Dimension(100, 20));
            JTextField nameText = new JTextField();
            nameText.setPreferredSize(new Dimension(100, 20));
            JTextField creditText = new JTextField();
            creditText.setPreferredSize(new Dimension(100, 20));
            JList listBox = new JList();
            listBox.setPreferredSize(new Dimension(200,100));
            JComboBox combo = new JComboBox();
            
            Container pane = this.getContentPane();
            BoxLayout box=new BoxLayout(pane, BoxLayout.Y_AXIS);
            pane.setLayout(box);            
            
            JPanel panel = new JPanel();
            BoxLayout layout = new BoxLayout(panel, BoxLayout.X_AXIS);
            panel.setLayout(layout);
            
            GridLayout inputGrid = new GridLayout(4,2);
            JPanel inputPanel = new JPanel();           
            inputPanel.setLayout(inputGrid);
            
            inputPanel.add(codeLabel);
            inputPanel.add(codeText);         
            inputPanel.add(nameLabel);
            inputPanel.add(nameText);
            inputPanel.add(creditsLabel);
            inputPanel.add(creditText);         
            inputPanel.add(departmentLabel);
            inputPanel.add(combo);
            
            panel.add(inputPanel);
            panel.add(listBox);

            pane.add(panel);
            pane.add(Box.createRigidArea(new Dimension(0,10)));
            pane.add(addButton);
            pane.add(displayAllButton);
            pane.add(displayButton);

            setTitle("GUI");
            pack();

        }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               try{
                   UIManager.setLookAndFeel(
                   "javax.swing.plaf.metal.MetalLookAndFeel");
               }catch (Exception ex){
                   ex.printStackTrace();
               }
               new GUI().setVisible(true);
            }
        });
    }
}  
