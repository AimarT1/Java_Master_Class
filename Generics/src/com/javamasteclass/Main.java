package com.javamasteclass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//methods take arguments.  Generics allow us to create Classes, interfaces, methods  that takes types as paramaters,
        // called: type parameters

        //defing a data type as Interger
        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n){
        for (int i = 0; i <= n.size(); i++){
            System.out.println(i*2);
        }

        /* second version of use.
        for (int i : n){
            System.out.println(i*2);
        }*/
    }
}
