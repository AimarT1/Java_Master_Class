package com.javamasteclass;

import java.util.Scanner;

public class Main {

    //Calling the Mobilephone class with the filed called mobile phone and create a new istance of that Mobile phone class.
    private static MobilePhone mobilePhone = new MobilePhone();
    //Creating a scanner for system input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Creating variables for quiting and chooseing menu options
        boolean quit = false;
        int chooseOption = 0;
        //method to see available menuoptions as program is started.
        printMenuOptions();

        while (!quit){
            //empty print for readabillity
            System.out.println("");
            System.out.println("Enter option to choose from: ");
            //We make variable "chooseOption" available to accept input for choice.
            chooseOption = scanner.nextInt();

            switch (chooseOption){
                case 1:
                    printMenuOptions();
                    break;
                case 2:
                    addNewContact();
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
                    System.out.println("Exiting the contact list...");
                    break;
            }
        }

    }

    public static void printMenuOptions(){
        System.out.println("Available menu options: ");
        System.out.println("1 - Print menu options.");
        System.out.println("2 - Add new contact.");
        System.out.println("3 - Update contacts.");
        System.out.println("4 - Remove contact.");
        System.out.println("5 - Search contact.");
        System.out.println("6 - Print contact list.");
        System.out.println("7 - Exit mobile phone.");
    }

    public static void addNewContact(){
        System.out.println("Enter contact name: ");
        String name = scanner.next();
        System.out.println("Enter contact phone number: ");
        String phoneNumber = scanner.next();
        mobilePhone.addContact(name,phoneNumber);
    }

    public static void upDateContact(){
        System.out.println("Enter existing contact name you want to update: ");
        String oldContact = scanner.next();
        System.out.println("Enter new contact name: ");
        String newContact = scanner.next();
        System.out.println("Enter new contact phone number: ");
        String newContactsPhoneNumber = scanner.next();
        mobilePhone.upDateContact(oldContact,newContact,newContactsPhoneNumber);
    }
    public static void searchContact(){
        System.out.println("Enter contact name you want to find:");
        String name = scanner.next();
        mobilePhone.searchContact(name);
    }
    public static void removeContact(){
        System.out.println("Enter contact name you want to remove: ");
        String name = scanner.next();
        mobilePhone.removeContact(name);
    }
}
