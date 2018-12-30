package com.javamasteclass;

public class Vehicle {
    private String name;
    private String size;

    private int Currentdirection;
    private int CurrentSpeed;

    public Vehicle(String name, String size, int Currentdirection, int CurrentSpeed) {
        this.name = name;
        this.size = size;
        this.Currentdirection = 0;
        this.CurrentSpeed = 0;
    }

    public void steer(int direction){
        this.Currentdirection = Currentdirection + direction;
        System.out.println("Vehicle.steer(): Steering at " + Currentdirection + " degrees.");
    }
    public void move(int speed, int direction){
        Currentdirection = direction;
        CurrentSpeed = speed;
        System.out.println("Vehicle.move(): Moving at " + CurrentSpeed + " in direction " + Currentdirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentdirection() {
        return Currentdirection;
    }

    public int getCurrentSpeed() {
        return CurrentSpeed;
    }
    public void stop(){
        System.out.println("You stopped and the speed is: ");
        this.CurrentSpeed = 0;

    }
}
