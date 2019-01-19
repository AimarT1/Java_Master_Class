package com.javamasteclass;

public class Contacts {

    //fields/object for contact class
    private String name;
    private String phoneNumber;

    //constuctor
    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
//This is calle factory method.
//method to create contacts.
//Static- so we dont have to create a new instance for this contacts class
   /* public static Contacts createContact(String name, String phoneNumber){
        //calling the constuctor to create an new contact record
        return new Contacts(name,phoneNumber);
    }*/
