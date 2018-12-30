package com.javamasteclass;

public class HealthyBurger extends Hamburger {
    private String healtyAddition1;
    private String healtyAddition2;

    private double healtyAddition1Price;
    private double healtyAddition2Price;

    public HealthyBurger(String healtyAddition1, String healtyAddition2) {
        super("Healthy Burger", 7, "Brown rye");
    }

    //Constuctor that extends Hamburger

    public void healthAddition1(){
        this.healtyAddition1 = "Soy sause";
        this.healtyAddition1Price = 0.8;
    }
    public void healthAddition2 (){
        this.healtyAddition2 = "GarlicPowder";
        this.healtyAddition2Price = 0.8;
    }

    @Override
    public double activateBurger() {
        double HamburgerPrice = super.activateBurger();
        if (healtyAddition1 != null){
            HamburgerPrice = HamburgerPrice + healtyAddition1Price;
            System.out.println("Added " + this.healtyAddition1 + " for an extra " + this.healtyAddition1Price);
        }
        if (healtyAddition2!= null){
            HamburgerPrice = HamburgerPrice + healtyAddition2Price;
            System.out.println("Added " + this.healtyAddition2 + " for an extra " + this.healtyAddition2Price);
        }
        return HamburgerPrice;
    }
}
