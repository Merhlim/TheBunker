package me.merhlim;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startingMenu {
    private JPanel mainPanel;
    private JButton newGameButton;
    private JButton loadGameButton;
    private JButton exitButton;
    private JLabel theBunkerLabel;
    private static JFrame frame;

    public startingMenu() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.dispose();
                System.exit(0);
            }
        });
        loadGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.dispose();
                loadGameWindow lgw = new loadGameWindow();
                lgw.loadGame();
                gameData gd = lgw.getGameData();



            }
        });
    }

    public static void main(String[] args){
        frame = new JFrame("The bunker");
        frame.setContentPane(new startingMenu().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
