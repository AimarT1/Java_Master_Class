package com.javamasteclass;

public class Main {
    //statement that creates a class in java

    public static void main(String[] args) {
	// software objects stores its state in fileds aka variables. And the expose their behavior with methods.
    // class aka teplate or ablueprint for creating objects.

        //we created an object called porsche from the template car
        //you have to inizialize them useing the new keyword.
        Car porsche = new Car();
        Car mazda = new Car();
        //setModel
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

        mazda.setModel("6");
        System.out.println("Model is " + mazda.getModel());

    }
}
