package com.javamasteclass;

//we made the class avstarct, and extends the abstct Animal class + implements the fly interface
public abstract class Bird extends Animal implements CanFly{
    //Constructor generated from the main Class aka Animal class. Bird inherits from animal.
    public Bird(String name) {
        super(name);
    }
    //overriding the abstract methods from Animal class.
    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breath in, breath out, repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName() + "is flapping");
    }
}
