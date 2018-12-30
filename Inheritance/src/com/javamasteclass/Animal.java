package com.javamasteclass;

public class Animal {
    // contents of the fields, common charakteristiks aka state.
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //defining  more methods for animals, what are common to all animals.
    public void eat(){
        System.out.println("Animal.eat() called");

    }
    // its "public" so we can inherit it.
    public void move(int speed){
        System.out.println("Animal is moving at " + speed);

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
