package com.javamasteclass;

import java.util.Scanner;

public class Main {

    //Creating scanner for input.
    private static Scanner scanner = new Scanner(System.in);
    //creating the new object for mobile phone
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        int chooseOption = 0;
        //method to print menu options to the screen
        printOptions();

        while (!quit){
            //empty print for readabilty
            System.out.println("");
            System.out.println("Enter option to chose from: ");
            //we assing the input value to choose option we want to chose.
            chooseOption = scanner.nextInt();

            //swicht for opions
            switch (chooseOption){
                case 1:
                    printOptions();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    upDateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    mobilePhone.printContactList();
                    break;
                case 7:
                    quit = true;
                    System.out.println("List exit loading ...");

            }
        }
    }
    private static void printOptions(){

        System.out.println("Available options: ");
        System.out.println("1 - Print menu options.");
        System.out.println("2 - Add new contact.");
        System.out.println("3 - Update contact.");
        System.out.println("4 - Remove contact.");
        System.out.println("5 - Search contact.");
        System.out.println("6 - Print contact list.");
        System.out.println("7 - Exit contact list .");
    }

    private static void addContact(){

        System.out.println("Enter contact name: ");
        String name = scanner.next();
        System.out.println("Enter contact phone number: ");
        String phoneNumber = scanner.next();
        Contacts newContacts = new Contacts(name,phoneNumber);
        mobilePhone.addContact(newContacts);
    }
    private static void searchContact(){
        System.out.println("Enter contact you want to find: ");
        String name = scanner.next();
        mobilePhone.searchContact(name);

    }

    private static void upDateContact(){
        System.out.println("Enter contact name you want to update: ");
        String currentContactName = scanner.next();
        System.out.println("Enter new contact name: ");
        String newContactName = scanner.next();
        System.out.println("Enter new contact phone number: ");
        String newContactNumber = scanner.next();
        //Creating a new object for Contact class, its going to pass new values to the constractor parameters.
        Contacts newcontact = new Contacts(newContactName,newContactNumber);
        mobilePhone.updateContact(currentContactName,newcontact);
    }

    private static void removeContact(){
        System.out.println("Enter contacts name you want to remove: ");
        String name = scanner.next();
        mobilePhone.removeContact(name);

    }
}
