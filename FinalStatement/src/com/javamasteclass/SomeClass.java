package com.javamasteclass;

//values that are constant are usually declared as static final.

public class SomeClass {
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    //you might need to inixzialize the field in the constructor, if its value is result tof some calculation,
    // wich relise on some other code aka a method from another class.

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        this.instanceNumber = classCounter;
        System.out.println(name + " created instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
