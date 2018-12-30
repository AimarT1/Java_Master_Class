package com.javamasteclass;

public class Car extends  Vehicle{
    private int doors;
    private String model;
    private String colour;

    //generate constructors
    public Car(int engine, int windows, int gears, int doors, String model, String colour) {
        super(engine, windows, 4, gears, 1);
        this.doors = doors;
        this.model = model;
        this.colour = colour;
    }

    public void move(){
        System.out.println("Car.move() called");
        move(90);
    }
    public void changeGear(){
        System.out.println("Car.changeGear() called");
        changeGear(5);
    }

    public void steering(){
        System.out.println("Car.steering() called");

    }

}
