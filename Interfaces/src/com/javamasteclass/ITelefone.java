package com.javamasteclass;

public interface ITelefone {
    //we are defining methods that form this interface.
    //You dont write code in the interface.
    //we dont actually need acsess modifiers "public".
    public void powerOn();
    public void dial(int phoneNumber);
    public void  anserw();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
