package com.javamasteclass;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    //we pass the "HeavenlyBody" class as a paramater in the created set.
    private final Set<HeavenlyBody> satelites;


    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        //WE just inizialize the set in the constructor without useing it as a parameter.
        this.satelites = new HashSet<HeavenlyBody>();
    }

    //getters
    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }
    //methods [passing the class object ]
    public boolean addMoon(HeavenlyBody moon){
        this.satelites.add(moon);
        return true;
    }

    public Set<HeavenlyBody> getSatelites() {
        //we are creating anew hasSet of current contents.
        return new HashSet<>(this.satelites);
    }
}
