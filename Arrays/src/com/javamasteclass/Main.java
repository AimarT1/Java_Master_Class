package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        //regular variable
        int myVar = 50;
        //varriable with array
        int[] myIntArray = new int[10];
        //starts counting from 0 to 9 !
        myIntArray[5] = 50;
       double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);
        //loend kohale 8 ei ole väärtust antud ja tagastb 0.
        System.out.println(myIntArray[8]);

        int[] myProperArray = {1,2,3,4,5,6,7,8,9,10};
        //kuna array alustab lugemist kohalt 0 siis printides myProperArray[4] saame tagasi arv väärtuse 5,
        // kuna ta asub array loendi 4ndal kohaö
        System.out.println(myProperArray[4]);
        System.out.println(myProperArray[9]);

        int[] myIntArray2 = new int[10];
        for (int i = 0; i < 10; i++){
            myIntArray2[i] = i * 10;
        }
        for (int i = 0; i < 10; i++){
            System.out.println("Element " + i + ", value is " +  myIntArray2[i]);
        }
        System.out.println("*********");
        //you get the same result as above
        //better way then above, you get more flexibilti if you change value of int
        int[] myIntArray3 = new int[10];
        for (int i = 0; i <myIntArray3.length; i++){
            myIntArray3[i] = i * 10;
        }
        for (int i = 0; i <myIntArray3.length; i++){
            System.out.println("Element " + i + ", value is " +  myIntArray3[i]);
        }
        System.out.println("*********");
        printArray(myIntArray2);
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + ", value is " +  array[i]);
        }

    }
}
