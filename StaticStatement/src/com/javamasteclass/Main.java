package com.javamasteclass;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {

        //creating a new instance of Static test
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumberInstances());

        //creating a new instance of Static test
        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumberInstances() );

        //we still get the right result, even if we use the "secondInstance" variable.
        //cause we are sharing that one variable in all instances of the class.NB! badpractice !
        StaticTest thirdInstance = new StaticTest("3nd Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + secondInstance.getNumberInstances() );

        //Since we made the getter "getNumberInstances()" static, we can access it directly.
        StaticTest fourthInstance = new StaticTest("4th instance");
        System.out.println(fourthInstance.getName() + " is instance number " + StaticTest.getNumberInstances());

        //STATIC METHODS AND FIELDS belong to the Class, not to instances of the class, and can be called referecing the class name,
        //rather rhen the class instance.


        //Java cant allow static method to access non-static fields/methods, cause they only exist when the static method is called.
        int anserw =  multyply(6);
        System.out.println("Anserw is " + anserw);
        System.out.println("Multiplier is " + multiplier);
    }
    public static int multyply(int number){
        return number * multiplier;
    }
}
