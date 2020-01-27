package me.merhlim;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

public class mainWindow {

    private JPanel MainPanel;
    private JPanel TextField;
    private JPanel ValueField;
    private JLabel MainText;
    private JScrollPane MainTextScroller;
    private JPanel ResourcesPanel;
    private JPanel InteractivePanel;
    private JButton checkWaterCollectionSystemButton;
    private JButton checkIndoorFarmsButton;
    private JSlider RadioTuner;
    private JPanel RadioPanel;
    private JLabel RadioValue;
    private JLabel WaterRemaining;
    private JLabel FoodRemaining;
    private JButton RadioListenButton;
    private JLabel rfPower;
    private JLabel rfContent;
    private JButton clearButton;
    private JButton exitButton;
    private JButton saveButton;
    private JProgressBar WaterProgress;
    private JProgressBar progressBar1;
    private JProgressBar progressBar2;
    private JButton burnFoodToProduceButton;
    private JButton refuelGeneratorButton;
    private static JFrame frame;

    private String mainPanelText="";

    gameData gamedata;


    public mainWindow() {
        RadioTuner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                RadioValue.setText("Radio Tuning: "+RadioTuner.getValue()+"MHz");
            }
        });
        RadioTuner.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                addTextToMainText("<br/><br/>You tune the radio");

            }
        });
        RadioListenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int frequency = RadioTuner.getValue();
                String band = radioCheck(frequency);
                if(!band.equals("none")){
                    rfContent.setText("Content: Voice");
                } else {
                    rfContent.setText("Content: Static");
                }

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainPanelText = "";
                MainText.setText("");
            }
        });
    }

    public String radioCheck(int frequency){
        if(frequency == gamedata.getGovornmentStation()){
            return "govornmentstation";
        } if (frequency == gamedata.getPeoplesStation()){
            return "peoplesstation";
        } if (frequency == gamedata.getAirForce()){
            return "airforce";
        } if (frequency == gamedata.getSpaceStation()) {
            return "spacestation";
        } if (frequency == gamedata.getLandMobileCommunication()) {
            return "landmobile";
        } if (frequency == gamedata.getAmateurChannel()) {
            return "amateur";
        } else {
            return "none";
        }
    }

    public void addTextToMainText(String text){
        mainPanelText += text;
        MainText.setText("<html>"+mainPanelText+"</html>");

    }

    public void start(){
        frame = new JFrame("The humming of the ventilation system.");
        frame.setContentPane(new mainWindow().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.resize(600,500);
        frame.setResizable(false);
        frame.setVisible(true);

        FoodRemaining.setText("Food: "+gamedata.getFood());
        WaterRemaining.setText("Water: "+gamedata.getWater());

    }
}
