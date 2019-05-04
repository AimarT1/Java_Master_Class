package com.javamasteclass;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {

    //fields
    private String name;
    private int hitpoints;
    private int strenght;
    private String weapon;

    //Constructors
    public Player(String name, int hitpoints, int strenght) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strenght = strenght;
        this.weapon = "Gun";
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    //created override tostring method automaticly so we dont have to write any code.
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strenght=" + strenght +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    // implements the methods from Isavable interface
    //write method is going to save all the values that needed to status of player to our arraylist,
    //and then return it, anityhing that is not string need to be casted to string.
    @Override
    public List<String> write() {
        //useing the generic list interface and then we define the new instance and type of list we want to create.
        //creating a list of strings named "values" and new instance of that listas an ArrayList.
        List<String> values = new ArrayList<String>();
        //useing the index position to save values
        values.add(0,this.name);
        //addind emty "" to cast int to string.
        values.add(1,"" + this.hitpoints);
        values.add(2,"" + this.strenght);
        values.add(3,this.weapon);
        //return that list.
        return values;
    }

    //read method is going to recive the arraylist containing the values and uses it to recreate the status of all member variable.
    //we are useing arraylist to send data to this method but all generalfuncion besad on list will work.
    @Override
    public void read(List<String> savedValues) {
        //checking if there are any values saved to list.
        if (savedValues != null && savedValues.size() > 0){
            //here we give savedValues - parameter,.get()-the index position we saved the name value to.
            this.name = savedValues.get(0);
            //useing the Integer Class method parseInt - to convert it to String type.
            this.hitpoints = Integer.parseInt(savedValues.get(1));
            this.strenght = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}
