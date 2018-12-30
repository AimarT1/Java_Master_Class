package com.javamasteclass;

public class Vehicle {
    // contents of the fields, common charakteristiks aka state.
    private int engine;
    private int windows;
    private int wheels;
    private int gears;
    private int steeringWeels;
    //generate constructors
    public Vehicle(int engine, int windows, int wheels, int gears, int steeringWeels) {
        this.engine = engine;
        this.windows = windows;
        this.wheels = wheels;
        this.gears = gears;
        this.steeringWeels = steeringWeels;
    }
    //defining  more methods for vehicles, what are common to all vehicles.
    //loon meetodi "move" parameetriga "speed" liikumiseks.
    public void move (int speed){
        System.out.println("Vehicle.move() called");

    }

    public void changeGear(int gears){
        System.out.println("Vehicle.changeGear() called");
    }

    public void steering(int steering){
        System.out.println("Vehicle.steering() called");

    }

    //generate getters for all fields
    public int getEngine() {
        return engine;
    }

    public int getWindows() {
        return windows;
    }

    public int getWheels() {
        return wheels;
    }

    public int getGears() {
        return gears;
    }

    public int getSteeringWeels() {
        return steeringWeels;
    }
}
