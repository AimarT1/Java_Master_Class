package com.javamasteclass;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    //fields
    private final String name;
    private final double orbitalPeriod;
    //Set contains the HeavanlYbody classes objects.
    private final Set<HeavenlyBody> satelites;

    private final BodyTypes bodyType;

    //constructors
    public HeavenlyBody(String name, double orbitalPeriod,BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        //we iniziate the field to new HasSet instance.
        this.satelites = new HashSet<HeavenlyBody>();
        this.bodyType = bodyType;
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
        String moonName = "Moon";
        if (moon.getBodyType().getBodyType().equals(moonName)){
            return this.satelites.add(moon);
        } else {
            System.out.println("Wrong body type");
        }
        return false;
    }

        @Override
        public boolean equals(Object obj){
            //does the same object equal itself
            if (this == obj){
                return true;
            }
            if ((obj == null) || (obj.getClass() != this.getClass())){
                return false;
            }
            HeavenlyBody heavenlyBody = (HeavenlyBody)obj;
            String objName = ((HeavenlyBody) obj).getName();
            if (this.bodyType.equals(heavenlyBody.getBodyType()) && this.name.equals(objName) ){
                return false;
            }
            if (this.bodyType != getBodyType() && this.name.equals(getName())){
                return true;
            }
            return this.name.equals(objName);
        }
    //hashCode method
    @Override
    public int hashCode() {
        //return the Strings hashCode that it compares.
        //System.out.println("HashCode Called");
        return this.name.hashCode();
    }

    public HeavenlyBody.BodyTypes getBodyType() {
        return bodyType;
    }

    public static class BodyTypes{
        public final String bodyType;

        public BodyTypes(String bodyType) {

            String planet = "Planet";
            String moon = "Moon";
            if (bodyType.equals(planet)){
                this.bodyType = planet;
            } else if (bodyType.equals(moon)){
                this.bodyType = moon;
            } else {
                this.bodyType = bodyType;
                System.out.println("Incorrect bodyType.");
            }
        }

        public String getBodyType() {
            return this.bodyType;
        }
    }

}
