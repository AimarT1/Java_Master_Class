package com.javamasteclass;

public class DogMain {
    public static void main(String[] args) {

        Labador rover = new Labador("Rover");
        Dog rover2 = new Dog("Rover");

        //testing rover against rover.
        //return true cause Labador is instance of Dog
        System.out.println(rover2.equals(rover));
        //returns false cause Dog is not an instance of Labador.
        System.out.println(rover.equals(rover2));

        //now it return to cause we are not overrideing the equals method in Labador Class
    }
}
