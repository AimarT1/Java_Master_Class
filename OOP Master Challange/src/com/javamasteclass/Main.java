package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Classic Burger",4.0,"White bread");
        //hamburger.activateBurger();
        hamburger.addition1();
        hamburger.addition2();
        hamburger.addition3();
        hamburger.addition4();
        System.out.println("Total Burger price is " + hamburger.activateBurger());
        System.out.println("**");

        HealthyBurger healthyBurger = new HealthyBurger("yep","yep");
        healthyBurger.addition1();
        healthyBurger.addition2();
        healthyBurger.addition3();
        healthyBurger.addition4();
        healthyBurger.healthAddition1();
        healthyBurger.healthAddition2();
        System.out.println("Total Healthy Burger price of is " + healthyBurger.activateBurger());
        System.out.println("**");

        DeluxBurger deluxBurger = new DeluxBurger();
        deluxBurger.addition1();
        System.out.println("Total Delux Burger price of is " + deluxBurger.activateBurger());
    }
}
