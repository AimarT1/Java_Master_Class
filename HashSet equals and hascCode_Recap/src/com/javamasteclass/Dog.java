package com.javamasteclass;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //marked it as final that means it cant be overriden in subclass.
    @Override
    public final boolean equals(Object obj) {
        //Comparasion against itself
        if (this == obj){
            return true;
        }
        //is the compared string same to the one we compare.
        if (obj instanceof Dog){
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        } else {
            //empty
        }
        return false;
    }
}
