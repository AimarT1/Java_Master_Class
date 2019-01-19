package com.javamasteclass;

import java.util.ArrayList;

public class Costumers {
    //fields customer name and array list of doubles.
    private String customerName;
    private ArrayList<Double> transactions;

    //Constructors for customers
    public Costumers(String customerName, double inizialAmaoint) {
        this.customerName = customerName;
        //we inizialixe the array list to the constructor.
        this.transactions = new ArrayList<Double>();
        transactions.add(inizialAmaoint);
    }
    //method for new tranaction for costumer.
    public void addTranaction(double amount){
        //This is converting from a primitive double to the object wrapper. Autoboxing.
        this.transactions.add(amount);
    }

    //Getters
    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
