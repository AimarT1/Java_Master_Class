package com.javamasteclass;

import java.util.ArrayList;
import java.util.List;

public class Mazda implements ISavable {

    //fields
    private String model;
    private String engineType;
    private String colour;
    private int kw;
    private int gears;

    //Constructor
    public Mazda(String model, String engineType, String colour, int kw, int gears) {
        this.model = model;
        this.engineType = engineType;
        this.colour = colour;
        this.kw = kw;
        this.gears = gears;
    }

    //getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getKw() {
        return kw;
    }

    public void setKw(int kw) {
        this.kw = kw;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    //toString method
    @Override
    public String toString() {
        return "Mazda{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                ", colour='" + colour + '\'' +
                ", kw=" + kw +
                ", gears=" + gears +
                '}';
    }

    //implementing the interface methods
    @Override
    public List<String> write() {
        //List extends the public Inteface class of all listTypes.
        //Defing a new list of String type called values, and i create a new instance of this list wuth type arrayList.
        List<String> values = new ArrayList<String>();
        // values.add ads the values to the arrayList, when i create a new instance of this class.
        //indexposition is the position where it saves the value of given filed.
        values.add(0,this.model);
        values.add(1,engineType);
        values.add(2,colour);
        //using "" tühjad sulud et parsida int stringiks.
        values.add(3,"" + this.kw);
        values.add(4,"" + this.gears);
        return values;
    }

    //Interface method to read the saved valus.
    @Override
    public void read(List<String> savedValues) {
        //kui on mida lugeda
        if (savedValues != null && savedValues.size() > 0){
            //now i give the index position of the givenfield to read from, to read as a list
            this.model = savedValues.get(0);
            this.engineType = savedValues.get(1);
            this.colour = savedValues.get(2);
            //using Intger class, parseInt method to parse integer values to string.
            this.kw = Integer.parseInt(savedValues.get(3));
            this.gears = Integer.parseInt(savedValues.get(4));
        }

    }
}
