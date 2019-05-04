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

    //its easy to overload the equals method rather then overrideing it.
    //fIRST IT CHECKS IF ITS COMPARED TO ITSELF, IF IT IS, RETURNS TRUE.
    //next it does the instance test,
    // what we do is we check the actual class of the object being compared against the class the method is in.
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        System.out.println("object.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        //null check is reguired if useing instanseOF.
        /*if (obj == null || (obj.getClass()) != this.getClass()){
            return false;
        }*/
        //comparing names. Compares its name against the corrent object name.
        String objectName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objectName);
    }

    //Checks the same hach codes to check for duplicates.
    //Useing the equals object override you allso need to override the hashcode,
    //otherwise the eguals method wont work.
    @Override
    public int hashCode() {
        //adding number 57, cause hachcode from the string is returning its own hachCode.
        System.out.println("HashCode called");
        return this.name.hashCode() + 57;
    }
}
