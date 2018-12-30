package com.javamasteclass;

public class EnhancedPlayer {
    private String name;
    //setting a value, so if input is over 100 it will retrurn inizial value
    private int health = 100;
    private String weapon;
//Constructors
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
//validation paramaters
        if (health > 0 && health <= 100 ){
            this.health = health;
        }

        this.weapon = weapon;
    }
    //method for calculating damage
    public void loseHealth(int damage){
        this.health= this.health - damage;
        if (this.health <= 0){
            System.out.println("Player knocked out");
            //Reduce number of lives remainig for the player.
        }
    }
//Getter for get health
    public int getHealth() {
        return health;
    }
}
