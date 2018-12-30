package com.javamasteclass;

public class Room {
    private int floor;
    private int ceiling;
    private int walls;
    private int windows;
    private int doors;

    public Room(int floor, int ceiling, int walls, int windows, int doors) {
        this.floor = floor;
        this.ceiling = ceiling;
        this.walls = walls;
        this.windows = windows;
        this.doors = doors;
    }
    public void BuildRoom(int numberOfBuilders){
        System.out.println(numberOfBuilders + " Builders are starting to build the room ! ");
        System.out.println("The room consists of: " + floor + " floor, " + ceiling +" ceiling, " + walls + " walls, " +
                doors + " door");
        System.out.println("Room built, contiune.");

    }

    public int getFloor() {
        return floor;
    }

    public int getCeiling() {
        return ceiling;
    }

    public int getWalls() {
        return walls;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }
}
