package com.javamasteclass;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","Sausage",3.56,"White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHumburderAddition1("Tomato",0.27);
        hamburger.addHumburderAddition2("Lettuce",0.75);
        hamburger.addHumburderAddition3("Cheese",1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealtyBurger healtyBurger = new HealtyBurger("Bacon", 5.67);
        healtyBurger.addHealthAddition1("Egg",5.43);
        healtyBurger.addHumburderAddition1("Lentis", 3.41);
        healtyBurger.itemizeHamburger();
        System.out.println("Total Healt Burger price is " + healtyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHumburderAddition1("Sould not do this", 100);
        db.itemizeHamburger();

    }
}
