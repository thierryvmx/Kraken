package com.thierryv.weatho;

import javax.swing.*;
import java.awt.*;

public class Application {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mainFrame = new MainFrame("Weatho");
                mainFrame.setResizable(false);
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainFrame.pack(); // redimentionnement selon les composants
                mainFrame.setLocationRelativeTo(null); // pour centrer la fenêtre
                mainFrame.setVisible(true);
            }
        });
    }
}
