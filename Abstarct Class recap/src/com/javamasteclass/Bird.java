package com.javamasteclass;

public abstract class Bird extends Animal implements CanFly {
    //generates the constractor from the extended animal class.
    public Bird(String name) {
        super(name);
    }

    //implements override methods from Animal.
    @Override
    public void eat() {
        System.out.println(getName() + " is pecking.");
    }

    @Override
    public void breath() {
        System.out.println("Breath in, breath out, repeat.");
    }
//made the class abstract and a new abstarct method, later cahend it and made a interface for fly method which this class is now
    //implementing.

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings.");
    }
}
