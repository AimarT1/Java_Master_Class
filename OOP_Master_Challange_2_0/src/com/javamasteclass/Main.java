package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger();
        hamburger.addition1(true);
        hamburger.addition2(true);
        //hat to do the printaout of a total cost in main to get the correct results with both healthy and regular addirions.
        //in other burgers it will print the cost, just iniszialize order.cost !
        System.out.println("Total cost of your burger with additions is: " + hamburger.orderCost()+ "€");

        System.out.println(hamburger.getPrice());
        System.out.println(hamburger.getBurgerName());
        System.out.println(hamburger.getRollType());
        System.out.println("****");

        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.addition1(true);
        healthyBurger.addition2(true);
        healthyBurger.healthyAddition1(true);
        healthyBurger.healthyAddition2(true);
        healthyBurger.orderCost();

        System.out.println(healthyBurger.getBurgerName());
        System.out.println(healthyBurger.getPrice());
        System.out.println(healthyBurger.getRollType());

        System.out.println("****");

        DeluxHamburger deluxHamburger = new DeluxHamburger("Lays","Coca-Cola");
        deluxHamburger.addition1(true);
        deluxHamburger.addition2(true);
        deluxHamburger.addition3(true);
        deluxHamburger.addition4(false);
        deluxHamburger.orderCost();

        System.out.println(deluxHamburger.getPrice());
        System.out.println(deluxHamburger.getBurgerName());
        System.out.println(deluxHamburger.getRollType());

        System.out.println("****");
        DeluxHamburger moreDelux = new DeluxHamburger("Handmade with sea salt","Beer");
        System.out.println("****");
        HealthyBurger moreHealth = new HealthyBurger();
        moreHealth.addition1(true);
        moreHealth.addition2(true);
        moreHealth.addition3(true);
        moreHealth.addition4(true);
        moreHealth.healthyAddition1(true);
        moreHealth.healthyAddition2(true);
        moreHealth.orderCost();
    }
}
