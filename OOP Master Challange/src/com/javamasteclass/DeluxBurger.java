package com.javamasteclass;

public class DeluxBurger extends Hamburger {

    public DeluxBurger() {
        super("Delux Burger", 8, "Brown rye");
        super.Deluxaddition1();
        super.Deluxaddition2();
    }

    @Override
    public void addition1() {
        System.out.println("Cannot add additional items to delux burger");
    }

    @Override
    public void addition2() {
        System.out.println("Cannot add additional items to delux burger");
    }

    @Override
    public void addition3() {
        System.out.println("Cannot add additional items to delux burger");
    }

    @Override
    public void addition4() {
        System.out.println("Cannot add additional items to delux burger");
    }
}
