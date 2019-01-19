package com.javamasteclass;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallange {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //calling method "readIntegers" and passing a value how many user needs to enter.
        //have to inizialize inbuilt method "Arrays.toString()" to print the input out as an array.
       System.out.println(" Return numbers as array: " + Arrays.toString(readIntegers(5)));
        //created a variable to store the given integers
        int[] returnedArray = readIntegers(5);
        //using the created varaiable as a parameter  to call out findmin();
        int returnedMin = findMin(returnedArray);
        System.out.println("Minimal vaule in array  = " + returnedMin);
    }

    public static int[] readIntegers(int count){

        int[] array = new int[count];
        System.out.println("Enter " + count + " integer values.\r");
     //the first loop is used to populate the array
        for (int i = 0; i<array.length;i++){
            array[i] = scanner.nextInt();

        }
        return array;
    }

    private static int findMin(int[] array){

     int min = Integer.MAX_VALUE;

        // the second loop is used to print it.
     for (int i = 0; i < array.length; i++){
         int value = array[i];

         if (value < min){
             min = value;
         }
     }
     return min;
        }
    }
