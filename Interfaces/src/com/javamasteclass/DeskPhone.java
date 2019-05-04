package com.javamasteclass;

public class DeskPhone implements ITelefone{
    private int myNumber;
    private boolean isRinging;

    //constructor
    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }
//implements methods in interface class.
    @Override
    public void powerOn() {
        System.out.println("No action taken, does not have power button;");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void anserw() {
        if (isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
        }else {
            isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
