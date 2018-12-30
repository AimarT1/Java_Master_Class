package com.javamasteclass;

public class Account_Tim {
    private String accountNr;
    private double balance;
    private String custumerName;
    private String email;
    private String phoneNr;

    //this is for testing and if you do so then it has to first line in constructor body!
    public Account_Tim() {
        this("3", 0, "Default", "Default", "Default");
        System.out.println("Emty constructor called");
    }

    //Constructor, with fields you want to include as parameters of this constructor.
    public Account_Tim(String number, double balance, String custumerName, String email, String phoneNr) {
        System.out.println("Account constructor with parameters called");
        this.accountNr = number;
        this.balance = balance;
        this.custumerName = custumerName;
        this.email = email;
        this.phoneNr = phoneNr;
    }

    //version for not creating duplication in many places, common with coders.
    public Account_Tim(String custumerName, String email, String phoneNr) {
        this("99",100.55,custumerName,email,phoneNr);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        } else {
            this.balance = this.balance - withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaing balance = " + balance);
        }
    }

    public String getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(String accountNr) {
        this.accountNr = accountNr;
    }

    public double getBalance() {
        System.out.println("Your balance is: " + balance);
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustumerName() {
        return custumerName;
    }

    public void setCustumerName(String custumerName) {
        this.custumerName = custumerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }
}
