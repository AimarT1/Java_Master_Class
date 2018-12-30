package com.javamasteclass;

public class Door {
    private int door;

    public Door(int door) {
        this.door = door;
    }

    public void installingDoor(){
        System.out.println("Installing door to the house that is been built");
    }

    public int getDoor() {
        return door;
    }
}
