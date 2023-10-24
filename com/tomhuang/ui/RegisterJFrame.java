package com.tomhuang.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    public RegisterJFrame(){
        // Set height and width
        this.setSize(488,500);
        // Set title
        this.setTitle("Sign up");
        // Stays frame at the top layer
        this.setAlwaysOnTop(true);
        // Set frame at center of screen
        this.setLocationRelativeTo(null);
        // End the program when frame is closed. "3": EXIT_ON_CLOSE
        this.setDefaultCloseOperation(3);
        // Render frame
        this.setVisible(true);
    }
}
