package com.javamasteclass;

//made the class abstract.
//abstact - cant be instansiated directly, class that is abstarct.
public abstract class Animal {
    //field
    private String name;

    //constructor
    public Animal(String name) {
        this.name = name;
    }

    //abstact methods, we make these methods abstarct beacuse they are more common behaviors for more annimals.
    public abstract void  eat();
    public abstract void breathe();

    //getter
    public String getName() {
        return name;
    }
}
