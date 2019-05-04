package com.javamasteclass;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //marked it final that we cannot override it.
    @Override
    public final boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Dog){
            String objName = ((Dog)obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }
}
