package com.javamasteclass;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount){
        if (amount > 0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now:  " + this.balance);
        }else{
            System.out.println("Cant deposit, negative sums.");
        }
    }

    public void withdraw(int amount){
        if (amount > this.balance){
            System.out.println("Not enough funds. Your current balance is: " + this.balance);
        }
        else if (amount < 0){
            System.out.println("Cant withdraw a negative sum.");
        }else{
           this.transactions.add(amount);
           this.balance = this.balance - amount;
            System.out.println("You withdrew: " + amount + " Your new balance is: " + this.balance);
        }
    }
    /* //tim
    public void withdraw(int amount){
        int withdrawal = -amount;
        if (withdrawal < 0){
            this.transactions.add(withdrawal);
            this.balance = this.balance - withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        }else{
            System.out.println("Cant witdraw negative sums.");
        }
    } */

    public void calculateBalance(){
        /*this.balance = 0;
        for (int i : this.transactions){
            this.balance = this.balance +i;
        }*/
        System.out.println("Calculated balance is: " + this.balance);
    }
}
