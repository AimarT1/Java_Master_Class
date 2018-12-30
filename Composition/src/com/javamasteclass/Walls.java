package com.javamasteclass;

public class Walls {
    private int walls;

    public Walls(int walls) {
        this.walls = walls;
    }
    public void installingWalls(){
        System.out.println("Installing Walls to the house that is been built");
    }

    public int getWalls() {
        return walls;
    }
}
