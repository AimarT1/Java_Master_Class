package com.javamasteclass;

public class DeluxHamburger extends Hamburger{
    //Delux set additions.
    private String chips;
    private String drink;

    public DeluxHamburger(String chips, String drink) {
        super("Delux Hamburger", "American White Bread", 8);
        this.chips = chips;
        this.drink = drink;
        System.out.println("You chose: " + getBurgerName()+ ", it has regular type of hamburger roll: " + getRollType() + ",\n" +
                getBurgerName() +" set, has price of: " + getPrice() + "€ " + "and it comes with additions of your choice: "  + "\n" +
                "drink: " + drink + " and your chips: "  + chips);
    }
    //No extras allowed on Delux

    @Override
    public void addition1(boolean Onion) {
        System.out.println("No extra additions are allowed to Delux Hamburger.");
    }

    @Override
    public void addition2(boolean Tomato) {
        System.out.println("No extra additions are allowed to Delux Hamburger.");
    }

    @Override
    public void addition3(boolean Lettuce) {
        System.out.println("No extra additions are allowed to Delux Hamburger.");
    }

    @Override
    public void addition4(boolean Cheese) {
        System.out.println("No extra additions are allowed to Delux Hamburger.");
    }

    //made an orederCost override to print it straight out when deluxHambureger.orderCost is called.
    @Override
    public double orderCost() {
        System.out.println("Total cost of your Delux Hamburger set is: " + getPrice()+ "€" );
        return super.orderCost();
    }
}
