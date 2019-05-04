package com.javamasteclass;

public class SIBTest {
    public static final String owner;

    //static method. returns it first when the instance is created in main !
    static {
        owner = " Aimar";
        System.out.println("SIBTest static initialization block called");
    }

    //constructor. //returns the constructor after the static methods when the instance is created in main !
    public SIBTest() {
        System.out.println("SIB constructor called");
    }
    //static method. returns it second when the instance is created in main !
    static {
        System.out.println("2nd initialization block called");
    }
    //returns it last if is called.
    public void someMethod(){
        System.out.println("someMethod called");
    }
}
