package me.merhlim;

import java.util.Random;

public class gameData {
    private int food;
    private int water;

    private int govornmentStation = 0;
    private int peoplesStation= 0;
    private int airForce = 0;
    private int spaceStation = 0;
    private int landMobileCommunication = 0;
    private int amateurChannel = 0;

    public gameData(int food, int water) {
        this.food = food;
        this.water = water;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getGovornmentStation() {
        return govornmentStation;
    }

    public void setGovornmentStation(int govornmentStation) {
        this.govornmentStation = govornmentStation;
    }

    public int getPeoplesStation() {
        return peoplesStation;
    }

    public void setPeoplesStation(int peoplesStation) {
        this.peoplesStation = peoplesStation;
    }

    public int getAirForce() {
        return airForce;
    }

    public void setAirForce(int airForce) {
        this.airForce = airForce;
    }

    public int getSpaceStation() {
        return spaceStation;
    }

    public void setSpaceStation(int spaceStation) {
        this.spaceStation = spaceStation;
    }

    public int getLandMobileCommunication() {
        return landMobileCommunication;
    }

    public void setLandMobileCommunication(int landMobileCommunication) {
        this.landMobileCommunication = landMobileCommunication;
    }

    public int getAmateurChannel() {
        return amateurChannel;
    }

    public void setAmateurChannel(int amateurChannel) {
        this.amateurChannel = amateurChannel;
    }

    public void generateRadioStations(){
        Random rand = new Random();
        govornmentStation = rand.nextInt(108+1) + 87;
        while(true){
            peoplesStation = rand.nextInt(108+1) + 87;
            if(peoplesStation==govornmentStation){
                continue;
            }
            break;
        }
        airForce = rand.nextInt(137+1) + 109;
        spaceStation = 138;
        landMobileCommunication = rand.nextInt(144+1) + 139;
        amateurChannel = rand.nextInt(146+1) + 145;
    }
}
