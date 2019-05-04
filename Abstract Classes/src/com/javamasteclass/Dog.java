package com.javamasteclass;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    //overriding the abstract methods from Animal class.
    @Override
    public void eat() {
        System.out.println(getName() + " is eating");

    }

    @Override
    public void breathe() {
        System.out.println("Breath in, breath out, repeat");
    }
}
