package com.javamasteclass;

import java.util.ArrayList;

public class Main {

    //methods take arguments.  Generics allow us to create Classes, interfaces, methods  that takes types as paramaters,
    // called: type parameters

    public static void main(String[] args) {

        //Defing the data type. So when we add string we get an error at compile time, when not defing the object type.
        ArrayList<Integer> items = new ArrayList<>();
        //autoboxing
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        //method to print the items in the arrayList
        printDoubled(items);
    }

    //method to print the arraylist values and doble them
    private static void printDoubled(ArrayList<Integer> items){
        for (int i = 1; i <= items.size(); i++){
            System.out.println(i*2);
        }

        /* differt aproce to same loop
        * for(int i : items){
        * sout(i*2)
        * }
        * */
    }
}
