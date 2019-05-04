package com.javamasteclass;

import java.util.ArrayList;

public class Gearbox {
    //fileds
    private  ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;

    //constructors
    public Gearbox(int maxGears) {
        this.gears = new ArrayList<>();
        this.maxGears = maxGears;
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    //Gear is an innerClass of the Gearbox aka a subclass
    public class  Gear{
        //
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        public double driveSpeed(int revs){
            return revs * (this.ratio);
        }
    }
}
