package com.javamasteclass;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable{

    //fields
    private String name;
    private int hitpoints;
    private int strenght;

    //constructor
    public Monster(String name, int hitpoints, int strenght) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strenght = strenght;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getStrenght() {
        return strenght;
    }

    //creating to string method .
    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strenght=" + strenght +
                '}';
    }

    //implements methods.
    @Override
    public List<String> write() {
        //creating a new arraylist instance
        ArrayList<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,"" + this.hitpoints);
        values.add(2,"" + this.strenght);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.hitpoints = Integer.parseInt(savedValues.get(1));
            this.strenght = Integer.parseInt(savedValues.get(2));
        }
    }
}
