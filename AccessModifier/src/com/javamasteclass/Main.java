package com.javamasteclass;

public class Main {

    public static void main(String[] args) {

        Account aimar = new Account("AImar");
        aimar.deposit(1000);
        aimar.withdraw(500);
        aimar.withdraw(-200);
        aimar.deposit(-20);
        aimar.calculateBalance();
        //aimar.balance = 5000;
        System.out.println("Balance on account is " + aimar.getBalance());

    }
}
