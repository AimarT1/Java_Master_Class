package com.javamasteclass;

import java.util.ArrayList;

public class MobilePhone {

    //creating the array list for contact objects
    private ArrayList<Contacts> contactlist = new ArrayList<Contacts>();

    //useing the Contact classes contact constuctor object: name and phinenumber as parameters.
    public void addContact(Contacts contacts){
        //checks if contact with the same name is allready in the kist
        if (findSearchedContact(contacts.getName())>= 0){
            System.out.println("Contact with this name is allready in the list, cannot add.");
        } else {
            contactlist.add(contacts);
            System.out.println("New contact: " + contacts.getName() + " ,with phone number: " + contacts.getPhoneNumber() + " added to contact list.");
        }
    }

    //method to prtint the contact list
    public void printContactList(){
        //return the contact count in the list.
        System.out.println("You have: " + contactlist.size() + " contact in your contact list.");
        for (int i = 0; i < contactlist.size(); i++){
            //(i + 1)-Start printing forom 1. and print the name and number in that position
            System.out.println((i + 1) + ". " + contactlist.get(i).getName() + " " + contactlist.get(i).getPhoneNumber());
        }
    }

    //method to search contact
    public void searchContact(String name){
        //int varaiable "position" gets the position from the findSearchedContact method withe parameter name we searched.
        int position = findSearchedContact(name);
        if (position >= 0){
            System.out.println("Contact: " + name + ", number: " + contactlist.get(position).getPhoneNumber()+ " is in the contact list.");
        }else{
            System.out.println("Searched contact: " + name + " is not in the contact list.");
        }
    }

    //method to find the searched contacts position.
    private int findSearchedContact(String name){
        for (int i = 0; i < contactlist.size(); i++){
            //we create a variable "searchedName" to get names in contact list positions
            String searchedName = contactlist.get(i).getName();
            //checking if serached name equals to the name on the contaclist,if so we return its position
            if (searchedName.equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void updateContact(String currentContactName,Contacts newContact){
        //find current contact position first.
        int position = findSearchedContact(currentContactName);
        if (position < 0){
            System.out.println("Contact not found, cant update.");
        }else if (currentContactName.equals(newContact.getName())){
            System.out.println("Cant update, contact with name: " + newContact.getName() + " is already in the list.");
        }else{
            //updates the old contacts position with new object values.
            contactlist.set(position,newContact);
            System.out.println("Contact: " + currentContactName + " has been updated to: " + newContact.getName() +
                    " number: "  + newContact.getPhoneNumber());
        }
    }
    //method to remove conatct
    public void removeContact(String name){
        //first look if the conatct is in the list.
        int position = findSearchedContact(name);
        if (position >= 0){
            //if it is remove the contact from its position
            contactlist.remove(position);
            System.out.println("Contact: " + name + " has been removed from the list.");
        }else{
            System.out.println("Contact not found, cant remove !");
        }
    }
}
