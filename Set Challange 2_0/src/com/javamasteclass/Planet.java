package com.javamasteclass;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, Bodytypes.PLANET);
    }

    @Override
    public boolean addSatelites(HeavenlyBody moon) {
        if (moon.getKey().getBodytypes().equals(Bodytypes.MOON)){
            return super.addSatelites(moon);
        }
        return false;
    }
}
