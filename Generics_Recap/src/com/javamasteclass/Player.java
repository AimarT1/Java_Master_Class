package com.javamasteclass;

public abstract class Player {
    //field
    private String name;

    //Constructor
    public Player(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }
}
