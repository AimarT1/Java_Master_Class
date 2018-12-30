package com.javamasteclass;

public class Animal {
    private String name;
    private int brain;
    private int size;
    private int weight;
    private int body;

    public Animal(int brain, int size, int weight, String name, int body) {
        this.brain = brain;
        this.size = size;
        this.weight = weight;
        this.name = name;
        this.body = body;
    }
    //Common methods for animals
    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal is moveing at: " + speed);

    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }
}
