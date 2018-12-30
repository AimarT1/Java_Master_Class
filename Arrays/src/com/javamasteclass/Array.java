package com.javamasteclass;

import java.util.Scanner;

public class Array {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInterger = getIntegers(5);
        for (int i = 0; i < myInterger.length; i++){
            System.out.println("Element " + i + ", typed value " + myInterger[i]);
        }
        System.out.println("The avrage is " + getAvarage(myInterger));
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r"); // \r" -for starting input at new line.
        int[] values = new int[number];

        for (int i = 0; i < values.length; i ++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAvarage(int[] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum = sum + array[i];
        }
        return  (double) sum / (double)array.length;
    }
}
