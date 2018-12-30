package com.javamasteclass;

public class Array_2 {
    public static void main(String[] args) {
        // Array - allows you to store sequence of values that are all of the same type (int arrays, character arrays).

        // regular variable
        int myVariable = 50;
        // how you cteate array variable
        //[10] assigns 10 elements aka number of separate integers we want to assign.
        int[] myArrayVariable = new int[10];
        ;
        // this means we assign the fifth array element avalue of 50. Since array starts counting from 0, the fifth element is 4.
        myArrayVariable[5] = 50;
        System.out.println(myArrayVariable[5]);

        //we assign values to myArrayVariable2.
        int[] myArrayVariable2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // ehk kohal 0 asub 1
        System.out.println(myArrayVariable2[0]);
        // ehk kohal 6 asub 7
        System.out.println(myArrayVariable2[6]);
        // ehk kohal 9 asub 10
        System.out.println(myArrayVariable2[9]);


        int[] myArrayVariable3 = new int[10];
        // useing for loop to inizialize
        //the first loop is used to populate the array
        for (int i = 0; i < 10; i++) {
            //we are going throgh each element of array, starting from element 0
            //i in brackets "[i]" means, acesss element 0 and go thourh entire values.
            // exp: myArrayVariable3[3] = 3 * 10
            myArrayVariable3[i] = i * 10;
        }
        // the second loop is used to print it
        //the above vörks the same without this, less code.
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + ", value is " + myArrayVariable3[i]);
        }

        System.out.println("****");

        int[] myArrayVariable4 = new int[15];
        // by useing "myArrayVariable4.length" we can change the int lenght, without having to change the lenght values in code
        for (int i = 0; i < myArrayVariable4.length; i++) {
            myArrayVariable4[i] = i * 10;
            System.out.println("Element " + i + ", value is " + myArrayVariable4[i]);
        }
        System.out.println("***");

        //Greatead a method and we call it
        int[] myArrayVariable5 = new int[15];
        for (int i = 0; i < myArrayVariable5.length; i++) {
            myArrayVariable5[i] = i * 10;
        }
        //Greatead a method and we call it
        printArray(myArrayVariable5);
    }
    //Greatead a method
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

}
