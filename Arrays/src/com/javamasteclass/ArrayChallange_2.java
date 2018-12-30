package com.javamasteclass;

import java.util.Scanner;

public class ArrayChallange_2 {

    //Scanner method  for user input, scanner - is a field
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
     //passing "getIntegers" method vith its parameter number, no [] here !.
        //ehk array pikkus
        int[] myArray = getIntegers(5);
        //Calling the methodPrintArray() and passing it the paramter variable myarray
        PrintArray(myArray);
        System.out.println("***");
        PrintArray(sortIntegers(myArray));

    }


    //Creating a method to get the intigers/numbers
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        //input numbers
        int[] enteredNumbers = new int[number];
        //the first loop is used to populate the array
        for (int i = 0; i < enteredNumbers.length; i++) {
            enteredNumbers[i] = scanner.nextInt();

        }
        return enteredNumbers;
    }
    // the second loop is used to print out the values, in the lenght of array we created.
    public static void PrintArray(int[] myArray) {
        //the first loop is used to populate the array and print them out with their given value
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + ", type value was " + myArray[i]);
        }
    }

    public static int[] sortIntegers(int[] myArray){
        //created new sortedArray to sorthem in decending order, passing a value of the array i want to sort.
        int[] sortedArray = new int[myArray.length];
        //passing the array i want to sort
        for (int i = 0; i < myArray.length; i++){
            sortedArray[i]= myArray[i];
            System.out.println(sortedArray[i]);//testing
            //TODO: need to expain to me what thein properly do !
            //j= i+1 ehk võtab arrays järgmise arvu
            for (int j= i+1; j<myArray.length;j++){
                //vürdelb kas esimene koht väärtus "sortedArray[i" on väiksem teinekoht väärtuses "myArray[j]".
  // ja prindib välja kui "sortedArray[i]" kui ta pole väiksem ja teeb seda seni kuni pole enam midagi võrrelda ja prindib viimase.
                //(sortedArray[i]>myArray[j]) kui tahad printida kasvavas järjekorras
                if (sortedArray[i]<myArray[j]){
                    sortedArray[i]= myArray[j];
                    System.out.println(sortedArray[i]);//testing
                    myArray[j] = myArray[i];
                    System.out.println(myArray[j]);//testing
                    myArray[i] = sortedArray[i];
                    System.out.println(myArray[i]);//testing

            }
        }
    }
        return myArray;
}
}
