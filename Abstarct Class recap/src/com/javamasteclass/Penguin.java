package com.javamasteclass;

public class Penguin extends Bird {
    //generates the constractor from the extended animal class, wich is extended in the bird class.
    public Penguin(String name) {
        super(name);
    }

    //for specific functionality
    @Override
    public void fly() {
        System.out.println("Im not very good at that, can i go for a swimm ?");
    }
}
