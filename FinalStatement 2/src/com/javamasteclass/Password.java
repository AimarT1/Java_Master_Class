package com.javamasteclass;

public class Password {
    private static final int key = 123456789;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecript(password);
    }
    private int encryptDecript(int password){
        return password ^ key;
        // ^ -xOR symbol
        //encription is a very basic  " ^ " Xor, wich just checks the bits in the two values and returns a one in any position.
    }
    public final void storePassword(){
        //returns the "encryptDecript" handshake value
        System.out.println("Saving Password as " + this.encryptedPassword);
    }
    public boolean letMeIn(int password){
        //your Password vs the handshake result
        if (encryptDecript(password) == this.encryptedPassword){
            System.out.println("Welcome!");
            return true;
        }else {
            System.out.println("Nope, you cant get in!");
            return false;
        }
    }
}
