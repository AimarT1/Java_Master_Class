package com.javamasteclass;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5 / 3;
        //width of int = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        //width of float = 32 (4 bytes)
        double myDoubleValue = 5d / 3d;
        //width of double = 64 (8 bytes)
       //Double value is far more precise. IF YOU dont specify the F or D, it will give a double.
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("MyFloat Value = "  + myFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);

        //Challange exercise

        double myPounds = 140d;
        double myKg = myPounds * 0.453592737d;
        System.out.println("My weight is: " + myKg);

    }
}
