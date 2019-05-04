package com.javamasteclass;

public class StaticTest {
    //we made the "private int numberInstances" filed static.
    //Now every time we create a new instance of it the number of instances will increment(we use ++).
    private static int numberInstances = 0;
    private String name;

    //constructor
    public StaticTest(String name) {
        this.name = name;
        numberInstances++;
    }

    //getters
    public static int getNumberInstances() {
        return numberInstances;
    }

    public String getName() {
        return name;
    }
}
