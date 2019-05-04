package com.javamasteclass;

public abstract class Animal {
    //fields
    private String name;

    //constructor
    public Animal(String name) {
        this.name = name;
    }

    //getter

    public String getName() {
        return name;
    }

    //abstract methods
    public abstract void eat();
    public abstract void breath();
}

////with interface - the interface was completele abstract, no implementation .
//with abstract class you can, enter fields, constructors, methods and we can specify that certain methods are abstract.
