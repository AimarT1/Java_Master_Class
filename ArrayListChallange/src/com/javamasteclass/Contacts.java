package com.javamasteclass;

public class Contacts {
    //creating fieelds
    private String name;
    private String phoneNumber;

    //Constructors
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
    // method for creatingContacts //Static to create a new contact record.
    public static Contacts createContacts (String name,String phoneNumber){
        //Calling the constructor to create new contact record.
        return new Contacts(name,phoneNumber);
    }
}
