package com.javamasteclass;

public class Dog_Main {
    public static void main(String[] args) {
        //Created 2 new instances of Dog and Labador. Both get the same name.
        Labador rover = new Labador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));
    }
}
