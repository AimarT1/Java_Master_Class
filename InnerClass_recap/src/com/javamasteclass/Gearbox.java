package com.javamasteclass;

import java.util.ArrayList;

//Gearbox class
public class Gearbox {
    //fields
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    //cosnstructor
    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        //acessing gear class, creating new instance of it, variable called neutral.
        Gear neutral = new Gear(0,0.0);
        //now adding the created new instance to the gear field
        this.gears.add(neutral);

        //to change gears
        for (int i = 0; i <= maxGears; i++){
            addGear(i,i *5.3);
        }
    }

    //method to operate cluch - sidur
    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    //method to add gear
    public void addGear(int number, double ratio){
        //if gearnumber is betweeen ...
        if (number > 0 && number <= maxGears){
            //adds a new gear instnce values to gears Array list.
            this.gears.add(new Gear(number,ratio));
        }
    }

    //method to change gear
    public void changeGear(int newGear){
        //cheking, validating if we have gear of that number and if the cluch is in.
        if (newGear >= 0 && newGear < this.gears.size() && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        }else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    //method for wheel speed
    public double wheelSpeed(int revs){
        if (clutchIsIn){
            System.out.println("Scream");
            return 0.0;
        }
        //ratio called from inner class gear
        return revs * gears.get(currentGear).ratio;
    }


    //inner class Gear[encatulation]
    private class Gear {

        private int gearNumber;
        private double ratio;

        //constructor for gear
        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        public double driveSpeed(int revs){
            return revs * ratio;
        }
    }
}
