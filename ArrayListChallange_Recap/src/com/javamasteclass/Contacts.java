package com.javamasteclass;

public class Contacts {
    //field
    private String name;
    private String phoneNumber;

    //constructors
    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //metod for creating contacts, to acess function in mobile phone
    //Static- so we dont have to create a new instance for this contacts class
    public static Contacts createContacts(String name,String phoneNumber){
        //it calling the constuctor to create an new contact record
        return  new Contacts(name,phoneNumber);

    }
}
