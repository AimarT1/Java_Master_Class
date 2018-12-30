package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
	String numberAsString = "2018";
	//interperted as text not as number value!
        System.out.println("numberAsString = " + numberAsString);

        //We are useing class called  "Integer". Method "parseInt" will try to convert stringvalue we are passing into an integer.
        //If not successful well get an error.
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString); // value is concatanated(liidetud otsa) to the string
        System.out.println(number);

        String numberAsString2 = "2018.125";
        System.out.println("numberAsString2 = " + numberAsString2);
        //the assosiated class name must be used before calling, type double then Double and so on.
        double number2 = Double.parseDouble(numberAsString2);
        System.out.println(number2);

    }
}
