package com.javamasteclass;

public class HealthyBurger extends Hamburger {

    //Healthy burger addition fields
    private String healthyAddition_1 = "Beacon";
    private double healthyAddition_1_price = 1.2;

    private String healthyAddition_2 = "Fried carlic";
    private double healthyAddition_2_price = 0.9;

    public HealthyBurger() {
        super("White Rye Premium", 6, "Healthy Burger");
        System.out.println("You chose the following burger: " + getBurgerName() + ", it has a roll type of: "+
                getRollType() + ", and is priced at: " + getPrice() + "€.");
    }

    public boolean healthyAdditions(boolean healthyAddition1, boolean healthyAddition2){
        double totalPrice = getPrice();
        if (healthyAddition1){
            totalPrice += healthyAddition_1_price;
            System.out.println("You chouse an Healthy addition: " + healthyAddition_1 + " with the price of: " + healthyAddition_1_price);
        }
        if (healthyAddition2){
            totalPrice += healthyAddition_2_price;
            System.out.println("You chouse an Healthy addition: " + healthyAddition_2 + " with the price of: " + healthyAddition_2_price);
        }
        //if one or both of them are selected than print this + totalPrice
        if (healthyAddition1 || healthyAddition2){
            System.out.println("Total cost of your Healthy burger with additions  is: " + totalPrice);
        }
        return true;
    }
}
