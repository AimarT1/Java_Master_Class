package com.javamasteclass;

public class EnhancedPlayer {
    private String name;
    private int healt = 100;
    private String weapon;

    //we creay´ted a constructor
    public EnhancedPlayer(String name, int healt, String weapon) {
        //we are garanteenig that name,healt and weapon are inizialisedwhen the class is created.
        this.name = name;
        //tingimuse lisame kohe.
        if (healt > 0 && healt <= 100){
            this.healt = healt;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        this.healt = this.healt - damage;
        if (this.healt <= 0){
            System.out.println("Player knocked out.");
            //reduce number of lives remaing for the player
        }
    }

    public int getHealt() {
        return healt;
    }
}
