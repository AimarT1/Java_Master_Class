package com.javamasteclass;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\n Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            switch (action){
                case 0:
                    System.out.println("\n Shutting down..." +
                                       "\n Exiting Android...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    updateContacts();
                    break;
                case 4:
                    removeContacts();
                    break;
                case 5:
                    searchContacts();
                    break;
                case 6:
                    printActions();
                    break;

            }
        }
    }
    private static void addContacts(){
        System.out.println("Enter new contact name: ");
        String name = scanner.next();
        System.out.println("Enter phone number: ");
        String number = scanner.next();
        Contacts newContact = Contacts.createContacts(name,number);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = " + name + ", phone number = " + number);
        }else{
            System.out.println("Cannot add, " + name + "already on file");
        }
    }
    private static void updateContacts(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.next();
        mobilePhone.queryContact(name);
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.next();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.next();
        Contacts newContactRecord = Contacts.createContacts(newName,newNumber);
        if (mobilePhone.updateContact(existingContactRecord,newContactRecord)){
            System.out.println("Successfully updated record!");
        }else {
            System.out.println("Error updateing record.");
        }
    }
    private static void removeContacts() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.next();
        mobilePhone.queryContact(name);
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted!");
        }else{
            System.out.println("Error deleting record.");
        }
    }
    private static void searchContacts() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.next();
        mobilePhone.queryContact(name);
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }

    public static void startPhone(){
        System.out.println("Starting phone...");
        System.out.println("Android loading...");
    }

    public static void printActions(){
        System.out.println("\n Available actions: \n press");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - query if an existing contact exists\n" +
                           "6 - to print a list of available options.");
        System.out.println("Choose your action: ");
    }
}
