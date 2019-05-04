/*Unncommented
package com.javamasteclass;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    //fields
    private final String name;
    private final double orbitalPeriod;
    //Set contains the HeavanlYbody classes objects.
    private final Set<HeavenlyBody> satelites;

    public final String bodyType;

    //constructors
    public HeavenlyBody(String name, double orbitalPeriod,String bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        //we iniziate the field to new HasSet instance.
        this.satelites = new HashSet<HeavenlyBody>();

        //Challange code
        if (bodyType == "PLANET".toUpperCase() || bodyType == "MOON".toUpperCase()){
            this.bodyType = bodyType;
        } else {
            this.bodyType = null;
            System.out.println("Incorrect bodyType.");
        }
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

    //Override method for equals.
    @Override
    public boolean equals(Object obj){
        //does the same object equal itself
        if (this == obj){
            return true;
        }
        //for debugging
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        //its easy to overload the equals method rather then overrideing it.
        String objName = ((HeavenlyBody) obj).getName();
        //this.name - the current name
        return this.name.equals(objName);
    }

    //hashCode method
    @Override
    public int hashCode() {
        //return the Strings hashCode that it compares.
        System.out.println("HashCode Called");
        return this.name.hashCode();
    }

    //Challange code

    public String getBodyType() {
        return bodyType;
    }

    public class bodyType{

    }
}
*/