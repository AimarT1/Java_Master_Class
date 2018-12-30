package com.javamasteclass;
//Constructors
public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer() {
        this("Default",0,"deafault@emty.ee");
    }

    public VipCustomer(String name, String email) {
        this(name,1,email);
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
