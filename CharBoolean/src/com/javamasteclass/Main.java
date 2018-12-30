package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        //width of 16 (2bytes)
        // https://unicode-table.com/en/
	char myChar ='S';
	char myChar2 = '\u09E7';
	System.out.println("Unicode output was: " + myChar2);

	boolean myBoo = true;
	boolean myNewBoo = true;

	//Challange

        char Char = '\u00AE';
        System.out.println(Char);
    }
}
