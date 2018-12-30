package com.javamasteclass;

public class Hamburger {
    //base burger fileds
    private String burgerName;
    private String rollType;
    private boolean meat;
    private double price;

    //burger addition fields
    private String addition_1;
    private double addition_1_price;

    private String addition_2;
    private double addition_2_price;

    private String addition_3;
    private double addition_3_price;

    private String addition_4;
    private double addition_4_price;



    //default constuctor for burger call
    public Hamburger() {
        this("Classic Hamburger","American White Bread",4.0);
        System.out.println("You chose the following burger: " + getBurgerName() + ", it has a roll type of: "+
                getRollType() + ", and is priced at: " + getPrice() + "€.");

    }

    //constructors
    public Hamburger(String burgerName, String rollType, double price) {
        this.burgerName = burgerName;
        this.rollType = rollType;
        this.meat = true;
        this.price = price;
    }

    //methods vor additions
    public void  addition1(boolean Onion){
        //added if statements to check when condition is inserted as false,
        // then it will not inizialize it as its field values will return to null value.
        if (Onion != false){
            this.addition_1 = "Onion";
            this.addition_1_price = 0.5;
        }
    }

    public void  addition2(boolean Tomato){
        if (Tomato != false){
            this.addition_2 = "Tomato";
            this.addition_2_price = 0.4;
        }
    }
    public void  addition3(boolean Lettuce){
        if (Lettuce != false){
            this.addition_3 = "Lettuce";
            this.addition_3_price = 0.6;
        }
    }
    public void  addition4(boolean Cheese){
        if (Cheese != false){
            this.addition_4 = "Cheese";
            this.addition_4_price = 0.8;
        }
    }

    //method for total cost oder calculation and iniziation
    public double orderCost(){
        double totalOrderCost = this.price;
        if (this.addition_1 != null){
            totalOrderCost += addition_1_price;
            System.out.println("You chouse an addition: " + addition_1 + " with the price of: " + addition_1_price);
        }
        if (this.addition_2 != null){
            totalOrderCost += addition_2_price;
            System.out.println("You chouse an addition: " + addition_2 + " with the price of: " + addition_2_price);
        }
        if (this.addition_3 != null){
            totalOrderCost += addition_3_price;
            System.out.println("You chouse an addition: " + addition_3 + " with the price of: " + addition_3_price);
        }
        if (this.addition_4 != null){
            totalOrderCost += addition_4_price;
            System.out.println("You chouse an addition: " + addition_4 + " with the price of: " + addition_4_price);
        }

        return totalOrderCost;
    }

    //getters
    public String getBurgerName() {
        return burgerName;
    }

    public String getRollType() {
        return rollType;
    }

    public boolean isMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }
}
