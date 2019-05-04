package com.javamasteclass;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    //we want to override it for penguin, cause its more specific
    @Override
    public void fly() {
        super.fly();
        System.out.println("Im not very good at that, can i go for a swimm instead ?");
    }
}
