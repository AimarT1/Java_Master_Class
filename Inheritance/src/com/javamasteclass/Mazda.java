package com.javamasteclass;

public class Mazda extends Car {
    public Mazda() {
        super(1, 6, 6, 5, "6", "black");
    }

    private void drive(){
        // caling super method from vehicle class move, to be able to move the car
        System.out.println("Your current speed is:  ");
        super.move(90);

    }
    private void steer(){
        super.steering(1);

    }
    private void changeGears(){
        super.changeGear(4);

    }
}

