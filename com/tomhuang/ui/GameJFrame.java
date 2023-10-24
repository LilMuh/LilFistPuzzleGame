package com.tomhuang.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame(){
        // Set height and width
        this.setSize(603,680);
        // Set title
        this.setTitle("LilFist_Puzzle v1.0");
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
