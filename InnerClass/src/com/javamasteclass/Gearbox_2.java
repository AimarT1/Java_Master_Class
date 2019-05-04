package com.javamasteclass;

import java.util.ArrayList;

public class Gearbox_2 { //fileds
    private ArrayList<Gear_2> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    //constructors
    public Gearbox_2(int maxGears) {
        this.gears = new ArrayList<>();
        this.maxGears = maxGears;
        Gear_2 neutral = new Gear_2(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateCluch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int gearNumber, double ratio){
        if (gearNumber > 0 && gearNumber <= maxGears){
            this.gears.add(new Gear_2(gearNumber,ratio));
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
    private class Gear_2 {
        //fields
        private int gearNumber;
        private double ratio;

        public Gear_2(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}