package com.javamasteclass;

import java.util.ArrayList;

public class MobilePhone {
    //we need to define the type and the variable name.
    //ArrayList can hold objects aka what type of data is going to the array list. //And Contact class fields are String type.
    //ArrayList is a class. // naming the field to :contactsList  - AS Contact-class has/creates a contacts paramter
    private ArrayList<Contacts> contactsList = new ArrayList<Contacts>();

    //method to add new contacts
    public void addContact(String name, String phoneNumber) {
        //added check to it.
        int position = findSearchedContact(name);
        if (position >= 0){
            System.out.println("Cant add, contact with this name is allready on the list.");
        }else{
            //Contact claas calls constructor contact = and creates a new record into the ststoc createContact method.
            //Contacts contacts = Contacts.createContact(name,phoneNumber); //comedid it out sould work both ways.
            Contacts contacts = new Contacts(name, phoneNumber);
            //calling the variable/field contactsList and use .add(item) to add an item to the "new ArrayList<Contacts>" instance.
            contactsList.add(contacts);
            System.out.println("New contact: " + name + " with number: " + phoneNumber + " added to contact list.");
        }
    }

    //method to print the contact list
    public void printContactList() {
        System.out.println("You have: " + contactsList.size() + " contact in your contact list");
        //we loop the list to see how many element are there and then print out the number of elements there are.
        //used the size to return the number of elements in the list.
        for (int i = 0; i < contactsList.size(); i++) {
            //(i+1) to start the counting from number 1. .get(i) to print elements in the position.
            //prints the element position number and the element stored in that arryList number position.
            //contactsList.get(i).getName() - returns the elemnt in that position with the name inserted and
            //contactsList.get(i).getPhoneNumber() - returns the elemnt in that position with the number inserted.
            System.out.println((i + 1) + ". " + contactsList.get(i).getName() + " " + contactsList.get(i).getPhoneNumber());
        }
    }

    //method to remove the contact from contact list.
    public void removeContact(String name) {
        //searching the contacts position
        int position = findSearchedContact(name);
        if (position >= 0) {
            contactsList.remove(position);
            System.out.println("Contact: " + name + ", has been removed from the list.");
        } else {
            System.out.println("Unable to remove contact, contact doest exist!");
        }
    }

    //method to update contact.
    public void upDateContact(String oldContactName, String newContactName, String newContactPhoneNumber) {
        //we search for the name we want to replace, if its there we check conditions.
        int position = findSearchedContact(oldContactName);
        if (position < 0) {
            System.out.println(oldContactName + " has not been found from the list.");
            //same as oldContactName == newContactName
        } else if (newContactName.equals(oldContactName)) {
            System.out.println("Update not possible, contact with name: " + oldContactName + " already exists.");
        } else {
            //first it check the above condisions, if those dont fail then it updates.
            upDateContact(position, newContactName, newContactPhoneNumber);
            System.out.println("Old contact: " + oldContactName + " has been updated to: " + newContactName + " with number: " + newContactPhoneNumber);
        }
    }

    //overloaded method of upDateContact to deal withe int posision.
    private void upDateContact(int position, String newContactName, String newContactPhoneNumber) {
        //Here we create a new instane of that contact and save it into oldcontacts position.
        Contacts contacts = new Contacts(newContactName, newContactPhoneNumber);
        this.contactsList.set(position, contacts);
    }

    //method to search the contact
    public void searchContact(String name) {
        //we create a variable to store search the position of the input name.
        // Then we pass it the "findSearchedContact(name);" method with our parameter name to search the int position
        int position = findSearchedContact(name);
        //if the posion we search wor is in there we get positive reply.
        if (position >= 0) {
            System.out.println("Contact found: " + name + " is in the contact list");
        } else {
            System.out.println("Contact not in the contact list. Try to add it first.");
        }
    }

    //method to deal with the contact index position
    private int findSearchedContact(String name) {
        //we go through loop to get the size of the list
        for (int i = 0; i < contactsList.size(); i++) {
            //we create a variable for the searched name and return the name of it in that position
            String searchedContactName = contactsList.get(i).getName();
            //checking if serached name equals to the name on the contaclist,if so we return its position
            if (name.equals(searchedContactName)) {
                return i;
            }
        }
        //if its not there we return -1
        return -1;
    }
}