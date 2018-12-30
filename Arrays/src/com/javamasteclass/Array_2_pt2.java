package com.javamasteclass;

import java.util.Scanner;

public class Array_2_pt2 {
    //we insert input now, static field called scanner
    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //we are defing an array called myIntegers,
        // the actual value of array is passed back automaticly from created method"getInteger(5)".
        int[] myIntegers = getInteger(5);
        for (int i = 0; i < myIntegers.length; i++){
            System.out.println("Element " + i + ", type value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }
    //int[] - int as ana array
    public static int[] getInteger(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0;i < array.length; i++){
            sum = sum + array[i];
        }
        return ((double) sum) / ((double) array.length);
    }
}
