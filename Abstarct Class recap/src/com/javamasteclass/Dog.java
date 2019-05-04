package com.javamasteclass;

public class Dog extends Animal {


    //generates the constractor from the extended animal class.
    public Dog(String name) {
        super(name);
    }

    //implements override methods from Animal.
    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breath() {
        System.out.println("Breath in, breath out, repeat.");
    }
}


