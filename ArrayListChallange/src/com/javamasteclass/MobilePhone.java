package com.javamasteclass;

import java.util.ArrayList;

public class MobilePhone {
    //anname arrayListile parameetrics classi "contacts" ja muutuja nimeks myContacts.
    private ArrayList<Contacts> myContacts;

    public MobilePhone() {
        //Inizialiazing an emty arrayList of "Contacts"
        this.myContacts = new ArrayList<Contacts>();
    }

    //we are passing a contact object whis is created outside of this object.
    public boolean addNewContact(Contacts contacts){
        if (findContact(contacts.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }else{
            myContacts.add(contacts);
            return true;
        }
    }
    //updateContact method
    public boolean updateContact(Contacts oldcontact,Contacts newContact){
        int foundPosition = findContact(oldcontact);
        if (foundPosition < 0){
            System.out.println(oldcontact.getName() + ", was not found");
            return false;
        }else if (findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update not successful.");
            return false;
        }else {
            //.set(the element we want to update, pass a new item which replaces old with new);
            this.myContacts.set(foundPosition, newContact);
            System.out.println(oldcontact.getName() + ", was replaced with " + newContact.getName());
            return true;
        }
    }

    public boolean removeContact(Contacts contacts){
        int foundPosition = findContact(contacts);
        if (foundPosition <= 0){
            System.out.println(contacts.getName() + ", was not found");
            return false;
        }else{
            //.set(the element we want to update, pass a new item which replaces old with new);
            this.myContacts.remove(foundPosition);
            System.out.println(contacts.getName() + ", was deleted with ");
            return true;
        }
    }

    //this will return a integer showing what the element position is in the array, for that object.
    private int findContact(Contacts contacts){
        return this.myContacts.indexOf(contacts);
    }
    //we loop throu all elements in the array list to check if there is the thats egual to whats been passed.
    //if it is we are going to return the position of it.
    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i++){
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    //if "findContact(Contacts contacts)" method return a number aka is on file, we return the contact name.
    public String queryContact(Contacts contacts){
        if (findContact(contacts) >= 0){
            return contacts.getName();
        }else {
            return null;
        }
    }
    public  Contacts queryContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }
    //implemented a contact function to go through the array elements and print them out.
    public void printContacts(){
        System.out.println("Contact List");
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() + " , "+
                    this.myContacts.get(i).getPhoneNumber() );
        }
    }
}
