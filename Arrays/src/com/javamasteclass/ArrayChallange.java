package com.javamasteclass;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallange {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray =  getIntegers(5);
        int[] sorted = sortIntegers(myArray);
        printArray(sorted);


    }
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r"); // \r" -for starting input at new line.
        int[] values = new int [number];
        for (int i = 0; i< values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + ", typed value " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array) {
//      int[] sortedArray = new int[array.length];
//    for (int i = 0; i < array.length; i++){
//      sortedArray[i] = array[i];
//       }
        //built in method == to above code, saves time .
        int[] sortedArray = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            //exp element 0 = 50
            //exp element 0 = 160
            //exp element 0 = 40
            for (int i = 0; i<sortedArray.length -1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
