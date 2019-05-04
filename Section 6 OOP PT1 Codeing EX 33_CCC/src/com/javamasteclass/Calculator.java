package com.javamasteclass;

public class Calculator {
    //Object fields from classes
    public Floor floor;
    public Carpet carpet;

    //constructors

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
