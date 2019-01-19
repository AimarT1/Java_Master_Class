package com.javamasteclass;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        anotherIntValue++;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        //array from 0 to 4 elements.
        // "new" operator creates a new operator object in memory
        int[] myIntArray = new int[5];
        int[] myAnotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("MyOnotherArray = " +  Arrays.toString(myAnotherArray));

        myAnotherArray[0] = 1;
        myIntArray[1] = 2; // for testing, aka both refferences refer to same array, and both can see the change.
        //both variables are refferenceing the same array in memory and result in both is : [1, 0, 0, 0, 0]
        //reference types represent the address of the variable rather than the data itself.
        System.out.println(" after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println(" after change MyOnotherArray = " +  Arrays.toString(myAnotherArray));

        //we are passing a refference type to the method
        modyfyArray(myIntArray);
        System.out.println(" after modyfy myIntArray = " + Arrays.toString(myIntArray));
        System.out.println(" after modyfy  MyOnotherArray = " +  Arrays.toString(myAnotherArray));

        //"new" operator creates a new operator object in memory
        //if it would be  in line 36, the print would print the myAnnothetArry values as :[4,5,6,7,8]
        myAnotherArray = new int[]{4,5,6,7,8};
        System.out.println(" after modyfy  MyOnotherArray = " +  Arrays.toString(myAnotherArray));

    }

    private static void modyfyArray(int[] array){
        array[0] = 2;
        //we are derefferencing that refference
        //"new" operator creates a new operator object in memory
        array = new int[]{1,2,3,4,5};
    }
}
