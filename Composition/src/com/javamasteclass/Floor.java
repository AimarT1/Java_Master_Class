package com.javamasteclass;

public class Floor {
    private int floor;

    public Floor(int floor) {
        this.floor = floor;
    }

    public void installingFloor(){
        System.out.println("Installing Floor to the house that is been built");
    }

    public int getFloor() {
        return floor;
    }
}
