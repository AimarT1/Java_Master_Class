package com.javamasteclass;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    //fields
    private final String name;
    private final double orbitalPeriod;
    //Set contains the HeavanlYbody classes objects.
    private final Set<HeavenlyBody> satelites;

    //constructors
    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        //we iniziate the field to new HasSet instance.
        this.satelites = new HashSet<HeavenlyBody>();
    }

    //Getters
    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatelites() {
        //we retun new hashset so original remains untoched.
        return new HashSet<HeavenlyBody>(this.satelites);
    }

    //method to add moon to the satelites. Useing Heavanlybody object as a Type pramater.
    public boolean addMoon(HeavenlyBody moon){
        return this.satelites.add(moon);
    }
}
