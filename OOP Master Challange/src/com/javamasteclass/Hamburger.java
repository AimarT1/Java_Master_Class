package com.javamasteclass;

public class Hamburger {
    private String burgerName;
    private double basePrice;
    private String rollType;
    private String meat;
    //additions
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;

    // addition prices
   private double addition1price;
   private double addition2price;
   private double addition3price;
   private double addition4price;
//base constuctors
    public Hamburger(String burgerName, double basePrice, String rollType) {
        this.burgerName = burgerName; //Classic Burger
        this.basePrice = basePrice; //4.0
        this.rollType = rollType; //White bread
        this.meat = "Beef";     //Beef
    }
// method for addition inizialiazion
    public void addition1(){
        this.addition1 = "lettuce";
        this.addition1price = 0.2;
    }
    public void addition2(){
        this.addition2 = "tomato";
        this.addition2price = 0.3;
    }
    public void addition3(){
        this.addition3 = "onion";
        this.addition3price = 0.2;
    }
    public void addition4(){
        this.addition4 = "cheese";
        this.addition4price = 0.3;
    }
    // method for Delux only addition inizialiazion
    public void Deluxaddition1(){
        this.addition1 = "Chips";
        this.addition1price = 2.2;
    }
    public void Deluxaddition2(){
        this.addition2 = "Drink";
        this.addition2price = 2;
    }
    //method to activate the burger and chosen addition and return cost
    public double activateBurger(){
        double HamburgerPrice = this.basePrice;
        System.out.println(this.burgerName + " on a " + this.rollType + " roll with " + this.meat+ ", price is " + this.basePrice + " €");
        if (addition1 != null){
            HamburgerPrice = HamburgerPrice + addition1price;
            System.out.println("Added " + this.addition1 + " for an extra " + this.addition1price);
        }
        if (addition2 != null){
            HamburgerPrice = HamburgerPrice + addition2price;
            System.out.println("Added " + this.addition2 + " for an extra " + this.addition2price);
        }
        if (addition3 != null){
            HamburgerPrice = HamburgerPrice + addition3price;
            System.out.println("Added " + this.addition3 + " for an extra " + this.addition3price);
        }
        if (addition4 != null){
            HamburgerPrice = HamburgerPrice + addition4price;
            System.out.println("Added " + this.addition4 + " for an extra " + this.addition4price);
        }
        return  HamburgerPrice;
    }

    public String getRegularBurger() {
        return burgerName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getRollType() {
        return rollType;
    }

    public String isMeat() {
        return meat;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = 4.0;
    }
}
