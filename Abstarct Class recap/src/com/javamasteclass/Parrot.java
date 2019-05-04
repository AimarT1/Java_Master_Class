package com.javamasteclass;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

 /*   @Override
    public void fly() {
        System.out.println("Flitting from branch, to branch.");
    } */
}
//Parrot class extends the eat and breath methods from the bird class we dont need to override them here.
//And Bird class itself extends these method from the abstarct anilmal class.
