package com.javamasteclass;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayWithInputMyOwnChallange {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter count of numbers you are going to pass to array: ");

        //count of number vraiable you want to enter.
        int count = scanner.nextInt();
        scanner.nextLine();

        // array varuable passes numbers back to as an array in original order
        int[] array = ReadInteger(count);
        System.out.println("This is array: " + Arrays.toString(ReadInteger(count)));

        // array varuable passes numbers back in reversed order
        int[] reverseArray = reverse(array);
        System.out.println("This is reversed array: " + Arrays.toString(array));

    }

    //method to read the input numbers
    public static int[] ReadInteger(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element#" + i + " number of elements in array: " + array.length + "\r");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    //method to return reversed array
    private static int[] reverse(int[] array) {
        int[] reversedArray = array.clone();
        for (int i = 0; i < array.length; i++) {
            array[i] = reversedArray[array.length - 1 - i];
        }
        return reversedArray;
    }
}
