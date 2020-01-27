package me.merhlim;

import javax.swing.*;

public class loadGameWindow {
    private JPanel mainPanel;
    private JButton save1EmptyButton;
    private JButton save2EmptyButton;
    private JButton save3EmptyButton;
    private JFrame frame;

    gameData gamedata;

    public void loadGame(){
        frame = new JFrame("Load game");
        frame.setContentPane(new loadGameWindow().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public gameData getGameData() {
        return gamedata;
    }
}
