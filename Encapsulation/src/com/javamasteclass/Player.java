package com.javamasteclass;

public class Player {

    public String name;
    public int health;
    public String weapon;

    //We didnt create any constructors here, just methods.

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health <= 0){
            System.out.println("Player knocked out.");
            //reduce number of lives remaing for the player
        }
    }

    public int healthRemaing(){
        return this.health;
    }
}
