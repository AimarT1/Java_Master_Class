package com.javamasteclass;

public class Car_I extends Vehicle{
    private String model;
    private String engine;
    private boolean isManual;
    private String colour;

    private int currentGear;
//Constructors


    public Car_I(String name, String size, int Currentdirection, int CurrentSpeed, String model, String engine, boolean isManual, String colour, int currentGear) {
        super(name, size, Currentdirection, CurrentSpeed);
        this.model = model;
        this.engine = engine;
        this.isManual = isManual;
        this.colour = colour;
        this.currentGear = 0;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");

    }
    public void changeSpeed(int speed,int direction){
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed,direction);

    }

}
