package com.javamasteclass;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    //fields
    //Key field for name and bodytype as pramaters.
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satelites;
    public enum Bodytypes{
        PLANET,
        MOON,
        ALIANPLANET
    }

    //constructors
    public HeavenlyBody(String name, double orbitalPeriod,Bodytypes bodytype) {
        this.key = new Key(name,bodytype);
        this.orbitalPeriod = orbitalPeriod;
        //we iniziate the field to new HasSet instance.
        this.satelites = new HashSet<HeavenlyBody>();
    }

    //Getters
    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatelites() {
        //we retun new hashset so original remains untoched.
        return new HashSet<HeavenlyBody>(this.satelites);
    }

    //method to add moon to the satelites. Useing Heavanlybody object as a Type pramater.
    public boolean addSatelites(HeavenlyBody moon){
        return this.satelites.add(moon);
    }

    //Override method for equals.
    @Override
    public boolean equals(Object obj){
        //does the same object equal itself
        if (this == obj){
            return true;
        }
        //if the instance of Heavanlybody object is egual to  HeavenlyBody bodyObj then return equal keys.
        if (obj instanceof HeavenlyBody){
            HeavenlyBody bodyObj = (HeavenlyBody)obj;
            return this.key.equals(bodyObj.getKey());
        }
        return false;
    }

    //hashCode method
    @Override
    public int hashCode() {
        //return the Strings hashCode that it compares.
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodytype + ": " + this.orbitalPeriod;
    }

    //method to make a new key
    public static Key makeKey(String name, Bodytypes bodytype){
        return new Key(name,bodytype);
    }

    public static final class Key {
        //Fileds for Key class
        private String name;
        private Bodytypes bodytype;

        public Key(String name, Bodytypes bodytype) {
            this.name = name;
            this.bodytype = bodytype;
        }

        public String getName() {
            return name;
        }

        public Bodytypes getBodytypes() {
            return bodytype;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + this.bodytype.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj){
                return true;
            }
            Key key = (Key)obj;
            if (this.name.equals(key.getName())){
                return this.bodytype.equals(key.getBodytypes());
            }
            return false;
        }
        @Override
        public String toString() {
            return this.name + " " + this.bodytype;
        }
    }
}
