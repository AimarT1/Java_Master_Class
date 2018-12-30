package com.javamasteclass;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon",14.54,"White");
        super.addHumburderAddition1("Chips",2.75);
        super.addHumburderAddition2("Drink",1.81);
    }

    @Override
    public void addHumburderAddition1(String name, double price) {
        System.out.println("Cannot add additional items to delux burger");
    }

    @Override
    public void addHumburderAddition2(String name, double price) {
        System.out.println("Cannot add additional items to delux burger");
    }

    @Override
    public void addHumburderAddition3(String name, double price) {
        System.out.println("Cannot add additional items to delux burger");
    }

    @Override
    public void addHumburderAddition4(String name, double price) {
        System.out.println("Cannot add additional items to delux burger");
    }
}
