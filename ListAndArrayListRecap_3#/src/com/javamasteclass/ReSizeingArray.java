package com.javamasteclass;

import java.util.Scanner;

public class ReSizeingArray {
    //Scanner for input
    private static Scanner scanner = new Scanner(System.in);
    //Array field/object for arrays.
    private static  int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integrs: ");
        getInput();
        printArray(baseData);
        System.out.println("***");
        resizeArray();
        //System.out.println("Enter 12 integres: ");
        //getInput();
        baseData[10] = 7;
        baseData[11] = 23;
        printArray(baseData);

    }
    //method to get input
    private static void getInput(){
        for (int i = 0; i < baseData.length; i++ ){
            baseData[i] = scanner.nextInt();
        }
    }
    //method to print the array
    private static void printArray(int[] array){
        //variable to count elements.
        int count = 0;
        for (int i = 0; i < array.length; i++){
            count++;
            System.out.print("Elemen #" + count +" is: " +array[i]);
            System.out.println();
        }
    }
    //method to resize the original array
    private static void resizeArray(){
        int[] originalArray = baseData;

        //for restoring original values
        baseData = new int[12];

        for (int i = 0; i < originalArray.length; i++){
            baseData[i] = originalArray[i];
        }
    }
}
