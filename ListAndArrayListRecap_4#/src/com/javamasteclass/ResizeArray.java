package com.javamasteclass;

import java.util.Scanner;

public class ResizeArray {

    //Scanner for input
    private static Scanner scanner = new Scanner(System.in);
    //array called "int[] baseData" we create the instance of it "= new int[10]" with set lenght.
    private static int[] baseData = new int[10];

    public static void main(String[] args) {

        System.out.println("Enter 10 integers: ");
        //we call getInput to give input
        getInput();
        //we call printArray to print the array, withe lenght of created int[]type baseData.
        printArray(baseData);
        //we call the rezise array wich stores the original values and we pass 2 new values to it and the zise changes.
        resizeArray();
       // System.out.println("Enter 12 integers: ");
        //getInput();
        //we give the values to element nr 11 and 12. for the rezised array with original 10 values.
        baseData[10] = 23;
        baseData[11] = 7;
        printArray(baseData);



    }
    //to get the input
    public static void getInput(){
        for (int i = 0 ; i < baseData.length; i++ ){
            baseData[i] = scanner.nextInt();
        }
    }
    //print array contents
    public static void printArray(int[] array){
        for (int i = 0; i <array.length; i++){
            System.out.print(array[i] + " ");
            System.out.println();
        }
    }
    //takes a copy of original array, the create a new array to new size, and saves original 10 values.
    public static void resizeArray(){
        //we create a new array and give it the baseData array as parameter value
        int[] original = baseData;
        //now we inizialize a new instance of that array with new lenght.
        baseData = new int[12];
        for (int i = 0; i<original.length; i++){
            baseData[i] = original[i];
            System.out.println("Elent: " + baseData[i]); //for test
        }
    }
}
