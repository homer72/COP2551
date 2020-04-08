import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
	JFrame frame = new JFrame("Chat Frame");
    

    //Creating the MenuBar and adding components
    JMenuBar mb = new JMenuBar();
    JMenu m1 = new JMenu("FILE");
    JMenu m2 = new JMenu("Help");
    
    JMenuItem m11 = new JMenuItem("Open");
    JMenuItem m22 = new JMenuItem("Save as");
    

    //Creating the panel at bottom and adding components
    JPanel panel = new JPanel(); // the panel is not visible in output
    JLabel label = new JLabel("Narration");
    JTextField tf = new JTextField(10); // accepts upto 10 characters
    JButton send = new JButton("Yes");
    JButton reset = new JButton("No");
    

    // Text Area at the Center
    JTextArea ta = new JTextArea();    
    
    public GUI() {
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        mb.add(m1);
        mb.add(m2);
        m1.add(m11);
        m1.add(m22);
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
        send.addActionListener(new ActionListener() { 
        	  public void actionPerformed(ActionEvent e) { 
        		  //set up story stuff?
        	  } 
        });
    }
}
