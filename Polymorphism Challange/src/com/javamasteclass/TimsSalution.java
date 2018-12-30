package com.javamasteclass;

class Car_Tim{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car_Tim(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car: startEngine()";
    }
    public  String accelerate (){
        return "Car: accelerate()";
    }
    public String brake (){
        return "Car: btake()";
    }
}

class Mitsubishi extends Car_Tim {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi: startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi: accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi: brake()";
    }
}

class Ford extends Car_Tim {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford: startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford: accelerate()";
    }

    @Override
    public String brake() {
        return "Ford: brake()";
    }
}

class Holden extends Car_Tim {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //different way do extend name.
        return getClass().getSimpleName() + ": startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ": brake()";
    }
}

public class TimsSalution {
    public static void main(String[] args) {
        Car_Tim car = new Car_Tim(8,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6,"Ford falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6,"holden commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}


