package com.javamasteclass;

import java.util.ArrayList;
import java.util.List;

public class Ferrari implements ISavable {

    //fields
    private String model;
    private String engineType;
    private String colour;
    private int kw;
    private int gears;

    //constructor
    public Ferrari() {
        this.model = "F40";
        this.engineType = "2.9 twin-turbocharged";
        this.colour = "RED";
        this.kw = 356;
        this.gears = 5;
    }

    //Getters
    public String getModel() {
        return model;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getColour() {
        return colour;
    }

    public int getKw() {
        return kw;
    }

    public int getGears() {
        return gears;
    }

    //Overide method to String output
    @Override
    public String toString() {
        return "Ferrari{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                ", colour='" + colour + '\'' +
                ", kw=" + kw +
                ", gears=" + gears +
                '}';
    }

    //Implemeting the interface methods.
    @Override
    public List<String> write() {
        //creating new list caled values , and create a new instance as type arraylist, where we write the values into.
        List<String> values = new ArrayList<String>();
        //now we add these positions to specific values.
        values.add(0,this.model);
        values.add(1,this.engineType);
        values.add(2,this.colour);
        values.add(3,"" + this.kw);
        values.add(4,"" + this.gears);

        return values;
    }

    //methood to read the saved values.
    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0){
            this.model = savedValues.get(0);
            this.engineType = savedValues.get(1);
            this.colour = savedValues.get(2);
            this.kw = Integer.parseInt(savedValues.get(3));
            this.gears = Integer.parseInt(savedValues.get(4));
        }
    }
}
