package com.javamasteclass;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additon1_Name;
    private double addition1_Price;

    private String additon2_Name;
    private double addition2_Price;

    private String additon3_Name;
    private double addition3_Price;

    private String additon4_Name;
    private double addition4_Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHumburderAddition1(String name,double price){
        this.additon1_Name = name;
        this.addition1_Price = price;
    }
    public void addHumburderAddition2(String name,double price){
        this.additon2_Name = name;
        this.addition2_Price = price;
    }
    public void addHumburderAddition3(String name,double price){
        this.additon3_Name = name;
        this.addition3_Price = price;
    }
    public void addHumburderAddition4(String name,double price){
        this.additon4_Name = name;
        this.addition4_Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger "+ " on a " + this.breadRollType + " roll with " + this.meat+ " price is " + this.price);
        //        //we have something sent to it
        if (this.additon1_Name != null){
            hamburgerPrice = hamburgerPrice + this.addition1_Price;
            System.out.println("Added " + this.additon1_Name + " for an extra " + this.addition1_Price);
        }
        if (this.additon2_Name != null){
            hamburgerPrice = hamburgerPrice + this.addition2_Price;
            System.out.println("Added " + this.additon2_Name + " for an extra " + this.addition2_Price);
        }
        if (this.additon3_Name != null){
            hamburgerPrice = hamburgerPrice + this.addition3_Price;
            System.out.println("Added " + this.additon3_Name + " for an extra " + this.addition3_Price);
        }
        if (this.additon4_Name != null){
            hamburgerPrice = hamburgerPrice + this.addition4_Price;
            System.out.println("Added " + this.additon4_Name + " for an extra " + this.addition4_Price);
        }
        return  hamburgerPrice;
    }
}
