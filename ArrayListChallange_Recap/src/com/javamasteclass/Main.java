package com.javamasteclass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Scanner for intput data
    private static Scanner scanner = new Scanner(System.in);
    //
    private static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {

        //variable to quit/exit the prosess
        boolean quit = false;
        //variable for menu choice options.
        startPhone();
        printMenu();

        while (!quit){
            System.out.println("\n Enter actions: (6 for available menu options)");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 0:
                    System.out.println("\n Shutting down...");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                case 5:
                    searchContact();
                case 6:
                    printMenu();
            }

        }

    }
    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContacts(name,phoneNumber);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = " + name + ", phone = "+ phoneNumber);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter current contact name: ");
        String oldContactname = scanner.nextLine();
        Contacts existingContact = mobilePhone.searchContact(oldContactname);
        if (existingContact == null){
            System.out.println("Contact not found,");
            return;
        }
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContacts(name,phoneNumber);
        if (mobilePhone.updateContact(existingContact,newContact)){
            System.out.println("Sucessfully updated record.");
        }else{
            System.out.println("Error updateing record.");
        }
    }
    private static void removeContact() {
        System.out.println("Enter current contact name: ");
        String oldContactname = scanner.nextLine();
        Contacts existingContact = mobilePhone.searchContact(oldContactname);
        if (existingContact == null) {
            System.out.println("Contact not found,");
            return;
        }
        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting record.");
        }
    }
    private static void searchContact() {
        System.out.println("Enter current contact name: ");
        String oldContactname = scanner.nextLine();
        Contacts existingContact = mobilePhone.searchContact(oldContactname);
        if (existingContact == null) {
            System.out.println("Contact not found,");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + " phone number is "+ existingContact.getPhoneNumber());
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
        System.out.println("Android loading...");
    }

    private static void printMenu(){
        System.out.println("\n Available actions: \n press");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print a list of available menu options.");
        System.out.println("Choose your action: ");
    }
}
