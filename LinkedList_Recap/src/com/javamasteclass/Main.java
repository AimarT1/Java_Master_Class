package com.javamasteclass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //we created a new instance of customer class. and assingned the value: 54.96
        Customer customer = new Customer("Tim",54.96);
        //created another instance of customer class
        //we set the value of this class = the first object/instance we created
        Customer anotherCustomer = customer;
        //then set the balance field : 12.28 for the second class
        //it updated the first class, its how memory is used in java.
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer: " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);


        for (int i = 0; i <intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
        System.out.println("****");
        //it sets the value(elementvalue:2) to the indexposition 1, and the previous element in that position is moved backwards.
        intList.add(1,2);
        for (int i = 0; i <intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));

        }
    }
}
