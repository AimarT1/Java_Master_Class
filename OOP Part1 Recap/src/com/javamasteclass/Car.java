package com.javamasteclass;

public class Car {
    //class named car
    //public-unresticted acess

    //creating fields aka variables.Encaptulation to hide from viev outside.
    private int doors;
    private int windows;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
//Constructors
    public Car(int doors, int windows, int wheels, String model, String engine, String colour) {
        this.doors = doors;
        this.windows = windows;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }
//Getters
    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setModel(String model) {
        //making a test to test is the model a "porche or mazda" a validation
        String validModel = model.toLowerCase();
        if (validModel.equals("911") || validModel.equals("6")){
            this.model = model;
        }else{
            this.model = "unknowm";
        }
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
