package com.example.tmoon.scs.Models;

/**
 * Created by tmoon on 3/4/17.
 */

public class Stations {
    int stationNumber;

    public Stations(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public String getStationNumberString(){
        return Integer.toString(stationNumber);
    }

    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public void incrementStationNumber() {
        this.stationNumber++;
    }

    @Override
    public String toString() {
        return "Stations{" +
                "stationNumber=" + stationNumber +
                '}';
    }
}