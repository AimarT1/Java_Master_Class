package com.javamasteclass;

import java.util.HashSet;
import java.util.Set;

    public abstract class HeavenlyBody {
        //new field after innerclass
        private final Key key;
        //fields
        private final double orbitalPeriod;
        //Set contains the HeavanlYbody classes objects.
        private final Set<HeavenlyBody> satelites;
        //addeda field for BodyTypes calles bodyType
        public enum BodyTypes{
            STAR,
            PLANET,
            MOON,
            COMET,
            ASTEROID
        }

        //constructors
        public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
            //new constructors after innerclass
            //Iniziating the innerclass
            this.key = new Key(name,bodyType);
            this.orbitalPeriod = orbitalPeriod;
            //we iniziate the field to new HasSet instance.
            this.satelites = new HashSet<HeavenlyBody>();
        }

        //Getters(new )
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
        //changed it to addSatelites
        public boolean addSatelite(HeavenlyBody moon){
            return this.satelites.add(moon);
        }

        //Override method after the innerclass:
        @Override
        public final boolean equals(Object obj){
            //does the same object equal itself
            if (this == obj){
                return true;
            }
            //confirms the class we recive is correct(passed as apramater)
            if (obj instanceof HeavenlyBody){
                HeavenlyBody bodyObj = (HeavenlyBody) obj;
                return this.key.equals(bodyObj.getKey());
            }
            return false;
        }

        //new haschCode after innerclass
        @Override
        public int hashCode() {
            return this.key.hashCode();
        }

        //added override tostring method.
        public static Key makeKey(String name,BodyTypes bodyType){
            //passing the paramaters to key.
            return new Key(name,bodyType);
        }
        @Override
        public String toString() {
            return this.key.name + ": " + this.key.bodyType + ": " + this.orbitalPeriod;
        }

        //innerClass
        public static final class Key{
            private String name;
            private BodyTypes bodyType;

            public Key(String name, BodyTypes bodyType) {
                this.name = name;
                this.bodyType = bodyType;
            }

            public String getName() {
                return name;
            }

            public BodyTypes getBodyType() {
                return bodyType;
            }

            //Overridemethods for Map()
            @Override
            public int hashCode() {
                return this.name.hashCode() + this.bodyType.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj){
                    return true;
                }
                Key key = (Key) obj;
                if (this.name.equals(key.getName())){
                    //aka return true;
                    return (this.bodyType.equals(key.getBodyType()));
                }
                return false;
            }

            @Override
            public String toString() {
                return this.name + " " + this.bodyType;
            }
        }
    }

