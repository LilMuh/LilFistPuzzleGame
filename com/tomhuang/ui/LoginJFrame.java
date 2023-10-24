package com.tomhuang.ui;

import javax.swing.*;
import java.awt.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame(){
        // Set height and width
        this.setSize(488,430);
        // Set title
        this.setTitle("Log in");
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
