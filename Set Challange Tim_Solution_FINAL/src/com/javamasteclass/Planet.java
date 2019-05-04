package com.javamasteclass;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod,BodyTypes.PLANET);
    }

    @Override
    public boolean addSatelite(HeavenlyBody moon) {
        //checking if its a moon
        if (moon.getKey().getBodyType().equals(BodyTypes.MOON)){
            return super.addSatelite(moon);
        } else {
            return false;
        }
    }
}
