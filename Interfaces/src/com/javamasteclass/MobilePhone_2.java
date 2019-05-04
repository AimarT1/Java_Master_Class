package com.javamasteclass;

public class MobilePhone_2 implements ITelefone {
    private int myNumber;
    private boolean isRing;
    private boolean isOn = false;

    public MobilePhone_2(int myNumber) {
        this.myNumber = myNumber;
    }

    //Implements all methods from Itelephone interface(class).
    //overrides each of those functions in the Itelephone interface.
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobilephone powerd up.");

    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn){
            System.out.println("Now ringing " + phoneNumber + " on mobilephone.");
        }else{
            System.out.println("Phone is not turned on!");
        }
    }

    @Override
    public void anserw() {
        if (isRing){
            System.out.println("anserwing the mobilephone");
            // we set isringing to false cause we anserwed it.
            isRing = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn){
            isRing = true;
            System.out.println("Melodi ringing.");
        }else {
            isRing = false;
            System.out.println("Mobilephone not on or number incorrect");
        }
        return isRing;
    }

    @Override
    public boolean isRinging() {
        return isRing;
    }
}

