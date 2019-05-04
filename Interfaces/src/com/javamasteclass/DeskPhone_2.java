package com.javamasteclass;

public class DeskPhone_2 implements ITelefone{
    private int myNumber;
    private boolean isRing;

    public DeskPhone_2(int myNumber) {
        this.myNumber = myNumber;
    }

    //Implements all methods from Itelephone interface(class).
    //overrides each of those functions in the Itelephone interface.
    @Override
    public void powerOn() {
        System.out.println("No action taken, deskphone does not have power button.");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone.");

    }

    @Override
    public void anserw() {
        if (isRing){
            System.out.println("anserwing the deskphone");
            // we set isringing to false cause we anserwed it.
            isRing = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            System.out.println("Ring ring");
            isRing = true;
        }else {
            isRing = false;
        }
        return isRing;
    }

    @Override
    public boolean isRinging() {
        return isRing;
    }
}
