package com.javamasteclass;

public class Hamburger {
    //base burger fileds
    private String burgerName ;
    private String rollType;
    private boolean meat;
    private double price;

    //burger addition fields
    private String addition_1 = "Onion";
    private double addition_1_price = 0.5;

    private String addition_2 = "Tomato";
    private double addition_2_price = 0.4;

    private String addition_3 = "Lettuce";
    private double addition_3_price = 0.6;

    private String addition_4 = "Cheese";
    private double addition_4_price = 0.8;

//Deafult constructor for hamburger
    public Hamburger() {
        this("American White Bread ",4,"Classic Hamburger");
        System.out.println("You chose the following burger: " + getBurgerName() + ", it has a roll type of: "+
                getRollType() + ", and is priced at: " + getPrice() + "€.");
    }

    //Constructors
    public Hamburger(String rollType, double price, String burgerName) {
        this.rollType = rollType;
        this.meat = true;
        this.price = price;
        this.burgerName = burgerName;
    }

    public boolean additions (boolean addition1,boolean addition2, boolean addition3,boolean addition4){
        //totalPrice variable to calculate total price of the burger. total price set to burger base price.
        double totalPrice = price;
        if (addition1){
            totalPrice += addition_1_price;
            System.out.println("You chouse an addition: " + addition_1 + " with the price of: " + addition_1_price);
        }
        if (addition2){
            totalPrice += addition_2_price;
            System.out.println("You chouse an addition: " + addition_2 + " with the price of: " + addition_2_price);
        }
        if (addition3){
            totalPrice += addition_3_price;
            System.out.println("You chouse an addition: " + addition_3 + " with the price of: " + addition_3_price);
        }
        if (addition4){
            totalPrice += addition_4_price;
            System.out.println("You chouse an addition: " + addition_4 + " with the price of: " + addition_4_price);
        }
        if (addition1 || addition2 || addition3 || addition4 ) {
            System.out.println("Total cost of your burger with additions is: " + totalPrice);
        }
        return true;
    }
//Getters
    public String getRollType() {
        return rollType;
    }

    public boolean isMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBurgerName() {
        return burgerName;
    }
}
