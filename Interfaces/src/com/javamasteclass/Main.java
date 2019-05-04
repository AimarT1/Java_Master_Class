package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
	// Interface in java terms, specifies methods that are particular class that implements the interface, must implement.
        //Interface it self is abstarct - no code for methods. You applay the method names and the parameters,
        // the code itself cose to the actual class you are creating.

        //we are defing the interface, but the actual implementaion is the specific functionality for a certain type of telephone.
        //using the class that implements the Interface Itelefone, in this case "DeskPhone" class.
        ITelefone myPhone = new DeskPhone(01010101010);
        myPhone.powerOn();
        myPhone.callPhone(01010101010);
        myPhone.anserw();

        myPhone = new MobilePhone(696969696);
        myPhone.powerOn();
        myPhone.callPhone(696969696);
        myPhone.anserw();
        System.out.println("*****");

        // Interface recap

        ITelefone aimarPhone = new DeskPhone_2(123456);
        aimarPhone.powerOn();
        aimarPhone.powerOn();
        aimarPhone.callPhone(123456);
        aimarPhone.anserw();

        aimarPhone = new MobilePhone_2(98765);
        aimarPhone.callPhone(98765);
        aimarPhone.anserw();

    }
}
