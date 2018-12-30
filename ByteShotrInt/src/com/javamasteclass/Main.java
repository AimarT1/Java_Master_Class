package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;
	int myMinValue = -2_147_483_648;
	int myMaxValue =  2_147_483_647;
	int myTotal = (myMinValue/2);
	//use underscores to make it more readable
        //int has width of 32

        byte myByte = -128 ;
        byte myNewByteValue =(byte)(myByte/2);
                          // casting: i want java to treat that as a byte(otherwhise it gives you an error, cause it takse it as int )
        //byte has a width of 8
        //Byte takes less space than integrer

        short myshort = 32767;
        short myNewShortValue = (short) (myshort/2);
        //short has a width of 16
        // short is allocated twise the amount byte is and half the amount of integrer is.

        //long has width of 64
        long myLong = 100L;

        System.out.println("My Total = " + myTotal);
        System.out.println("My New Byte Value = " + myNewByteValue);
        System.out.println("My Short = " + myNewShortValue);

// Coding exerise
        byte myBite = 112;
        short myShort =460;
        int myInt =1024;
        //my version - long myLongValue = 50_000 + (myBite*10) + myShort + myInt;
        long myLongValue = 50_000L + 10L*(myBite + myShort + myInt);
        short shortTotal = (short) (1000 + 10*(myByte + myShort + myInt));
        System.out.println("My long Total sum = " + myLongValue);
        System.out.println("My short sum = " + shortTotal);


    }

}

