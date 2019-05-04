package com.javamasteclass;

import java.util.ArrayList;

public class Gearbox_3 { //fileds
    private ArrayList<Gear_3> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    //constructors
    public Gearbox_3(int maxGears) {
        this.gears = new ArrayList<>();
        this.maxGears = maxGears;
        Gear_3 neutral = new Gear_3(0, 0.0);
        this.gears.add(neutral);

        for (int i = 0; i < maxGears; i++){
            addGear(i,i * 5.3);
        }
    }

    public void operateCluch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int gearNumber, double ratio){
        if (gearNumber > 0 && gearNumber <= maxGears){
            this.gears.add(new Gear_3(gearNumber,ratio));
        }
    }

    public void changeGear(int newGear){
        if (newGear > 0 && newGear < this.gears.size() && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        }else{
            System.out.println("Grind!");
            this.currentGear= 0;
        }
    }

    public double wheelSpeed (int revs){
        if (clutchIsIn){
            System.out.println("Scream");
            return 0.0;
        }else {
            return revs * gears.get(currentGear).ratio;
        }
    }

    //Gear is an innerClass of the Gearbox aka a subclass
    private class Gear_3 {
        //fields
        private int gearNumber;
        private double ratio;

        public Gear_3(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}