package com.javamasteclass;

public class DeluxHamburger  extends  Hamburger{
    private String chips;
    private String drink;

    public DeluxHamburger(String chips, String drink) {
        super("American White Bread ",8, "Delux Hamburger");
        this.chips = chips;
        this.drink = drink;
        System.out.println("You chose: " + getBurgerName()+ ", it has regular type of hamburger roll: " + getRollType() + ",\n" +
                 getBurgerName() +" has price of: " + getPrice() + "€ " + "and it comes with additions of your choice: "  + "\n" +
                "drink: " + drink + " and your chips: "  + chips);
    }

    @Override
    public boolean additions(boolean addition1, boolean addition2, boolean addition3, boolean addition4) {
        super.additions(false,false,false,false);
        System.out.println("No additional item alowed with thos choise of burger !");
        return true;
    }
}
