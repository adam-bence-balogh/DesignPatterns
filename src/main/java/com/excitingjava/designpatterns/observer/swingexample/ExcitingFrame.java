package com.excitingjava.designpatterns.observer.swingexample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author: Balogh Ádám Bence
 */
public class ExcitingFrame extends JFrame {
    public ExcitingFrame(String title) throws HeadlessException {
        super(title);
        //create subject
        JButton myButton = new JButton("Click me");
        //create observer
        ActionListener myListener = action -> JOptionPane.showMessageDialog(null, "www.excitingjava.com");
        //register observer
        myButton.addActionListener(myListener);
        //make things visible
        add(myButton);
        setSize(300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class Main{
    public static void main(String[] args) {
        new ExcitingFrame("Observer example in Swing");
    }
}
