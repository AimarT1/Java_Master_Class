package com.javamasteclass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Creating a new instance o cotumer class
        Customer customer = new Customer("Josh",56.34);
        //another instance
        Customer anotherCustomer;
        //java is assing the second customer class to point to the first class, it saves the memmory address,
        // but doesnt create a seperate class
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer: "  + customer.getName() + " Balance is: " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,2);
        for (int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
    }
    //linked list - stores the actual link to the next item in the list, each element in the list holds the link to the item
    // that fallows it as well as the actual value.
}
