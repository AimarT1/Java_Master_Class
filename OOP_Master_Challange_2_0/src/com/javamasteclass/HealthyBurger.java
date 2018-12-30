package com.javamasteclass;

public class HealthyBurger extends Hamburger {

    //healthy burger addition fields.
    private String healthyAddition_1;
    private double healthyAddition_1_price;

    private String healthyAddition_2;
    private double healthyAddition_2_price;

    //constructor for healthy burger
    public HealthyBurger() {
        super("Healthy Burger", "White Rye Premium", 6);
        System.out.println("You chose the following burger: " + getBurgerName() + ", it has a roll type of: " +
                getRollType() + ", and is priced at: " + getPrice() + "€.");
    }

    //methods for healthy additions
    public void healthyAddition1(boolean Beacon) {
        //added if statements to check when condition is inserted as false,
        // then it will not inizialize it as its field values will return to null value.
        //aka validation.
        if (Beacon != false) {
            this.healthyAddition_1 = "Beacon";
            this.healthyAddition_1_price = 1.2;
        }
    }

    public void healthyAddition2(boolean friedCarlic) {
        if (friedCarlic != false) {
            this.healthyAddition_2 = "Fried carlic";
            this.healthyAddition_2_price = 0.9;
        }
    }

    @Override
    public double orderCost() {
        double totalOrderCost = super.orderCost();
        if (this.healthyAddition_1 != null) {
            totalOrderCost += this.healthyAddition_1_price;
            System.out.println("You chouse an Healthy addition: " + healthyAddition_1 + " with the price of: " + healthyAddition_1_price);
        }
        if (this.healthyAddition_2 != null) {
            totalOrderCost += this.healthyAddition_2_price;
            System.out.println("You chouse an Healthy addition: " + healthyAddition_2 + " with the price of: " + healthyAddition_2_price);
        }
        //made an orederCost override for healthadditions and to calculate them with all addition chosen.
        // and i print it straight out when HealthBurger.orderCost is called.
        System.out.println("Total cost of your healthy burger with additions is: " + totalOrderCost + "€");
        return totalOrderCost;
    }
}
