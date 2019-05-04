package com.javamasteclass;

public class MobilePhone implements ITelefone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    //constructor
    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }
    //implements methods in interface class.
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powerd up");

    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn){
           System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
        }else{
            System.out.println("Phone is turned off.");
        }
    }

    @Override
    public void anserw() {
        if (isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody ring");
        }else {
            isRinging = false;
            System.out.println("Mobile phone not on or number is different !");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

