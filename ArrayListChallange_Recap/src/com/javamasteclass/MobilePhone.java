package com.javamasteclass;

import java.util.ArrayList;

public class MobilePhone {
    //<Contacts> Accepts the contacs cöass import and name the field.
    private ArrayList<Contacts> myContacts;

    //constuctor
    public MobilePhone() {
        //inizializing the constuctor with empty list.
        this.myContacts = new ArrayList<Contacts>();
    }
    //wheater it was successful or not, we are cheching is it there or not thats why boolean.
    //we are sending a contact record/object wich we created outside of this method.
    public boolean addNewContact(Contacts contacts){
        if (findContact(contacts.getName()) >= 0){
            System.out.println("Contact is allready on file.");
            return false;
        }else{
            //wea are going to add that to the contact record
            myContacts.add(contacts);
            return true;
        }
    }
    //method
    //it will return the integer showing what the element position is in the array.
    private int findContact(Contacts contacts){
        return this.myContacts.indexOf(contacts);
    }
    //method overloading
    private int findContact(String contactName){
        for (int i = 0; i< this.myContacts.size(); i++){
            //creating a new object
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contactName)){
                //we return i aka the element in that position
                return i;
            }
        }
        //if not found
        return -1;
    }
    //method to update the contact
    public boolean updateContact(Contacts oldContact,Contacts newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }else if (findContact(newContact.getName())!= -1){
            System.out.println("Contacts with name: " + newContact.getName() + " , allready exists. Update not successful");
            return false;
        }
            this.myContacts.set(foundPosition,newContact);
            System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
            return true;
    }
    //method to remove contacts
    public boolean removeContact(Contacts contacts){
        int foundPosition = findContact(contacts);
        if (foundPosition < 0){
            System.out.println(contacts.getName() + ", was not found.");
            return false;
        }else{
            this.myContacts.remove(foundPosition);
            System.out.println(contacts.getName() + ", was deleted ");
            return true;
        }
    }
    //method to search contacts
    public String searchContact(Contacts contacts){
        if (findContact(contacts) >= 0){
            return contacts.getName();
        }
        return null;
    }
    public Contacts searchContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }else {
            return null;
        }
    }
    //method to print contacts name and number
    public void printContacts(){
        System.out.println("Contact list.");
        for (int i = 0; i < this.myContacts.size(); i++){
            System.out.println((i+1) + "." + this.myContacts.get(i).getName() + " , " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}

