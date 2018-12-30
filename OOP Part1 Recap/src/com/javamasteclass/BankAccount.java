package com.javamasteclass;

public class BankAccount {
    //creating fields aka variables.Encaptulation to hide from viev outside.
    private int accountNumber;
    private int balance;
    private String CustomerName;
    private String email;
    private String phoneNumber;

    //default constructor optional
    public BankAccount(){
        this(1, 0,"deafault customer","defaultmail@tim.ee","555555");
        System.out.println("Empty constructor called");
    }

    //Constructors
    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        CustomerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Constuctor part2 video

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99,0,customerName,email,phoneNumber);
        this.CustomerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    //Constuctor part2 video end

    //method1
    public int depositFunds(int deposit){
        if (deposit > 0){
            balance = balance + deposit;
            System.out.println("You deposited: " + deposit + " €. and your balance is now " + balance + " €");
        }
        return balance;
    }
    //method2
    public int withdrawFunds(int withdraw){
        if (withdraw <= balance){
            balance = balance - withdraw;
            System.out.println("You withdrawd : " + withdraw + " €." + "Your balance is: " + balance + " €");
        }else{
            System.out.println("Not enogh money in the accaunt to withdraw." + "Your balance is: " + balance + " €");
        }
        return -1;
    }
//Getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
