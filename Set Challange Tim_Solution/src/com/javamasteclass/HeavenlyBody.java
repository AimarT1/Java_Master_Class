package com.javamasteclass;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody{
    //fields
    private final String name;
    private final double orbitalPeriod;
    //Set contains the HeavanlYbody classes objects.
    private final Set<HeavenlyBody> satelites;
    //addeda field for BodyTypes calles bodyType
    private final BodyTypes bodyType;

    public enum BodyTypes{
        STAR,
        PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    //constructors
    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        //we iniziate the field to new HasSet instance.
        this.satelites = new HashSet<HeavenlyBody>();
        //added bodyTypes
        this.bodyType = bodyType;
    }

    //Getters
    //added getter for enum BodyTypes.
    public BodyTypes getBodyType() {
        return bodyType;
    }

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
    //changed it to addSatelites
    public boolean addSatelite(HeavenlyBody moon){
        return this.satelites.add(moon);
    }


    @Override
    public final boolean equals(Object obj){
        //does the same object equal itself
        if (this == obj){
            return true;
        }
        //confirms the class we recive is correct(passed as apramater)
        if (obj instanceof HeavenlyBody){
            HeavenlyBody bodyObj = (HeavenlyBody) obj;
            //if names are the same
            if (this.name.equals(bodyObj.getName())){
                return this.bodyType == bodyObj.getBodyType();
            }
        }
        //if names or bodytypes are different.
        return false;
    }

    //hashCode method
    @Override
    public final int hashCode() {
        //return the Strings hashCode that it compares.
        return this.name.hashCode() + this.bodyType.hashCode();
    }

    //added override tostring method.
    @Override
    public String toString() {
        return this.name + ": " + this.bodyType + ": " + this.orbitalPeriod;
    }
}
