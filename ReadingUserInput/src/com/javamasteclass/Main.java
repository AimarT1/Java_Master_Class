package com.javamasteclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner is one of java input classes and it alows as to read user input.
        //We can parse primitive types and string useing method from the scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        //kui input on false siis lõpetab koodi ja annab teate.
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            // you have to put "scanner.nextLine();" after the first input, otherwise it will skipp it!
            scanner.nextLine(); //handle next line character (enter key)

            System.out.println("Eneter your name: ");
            //We are useing var scanner(Scanner scanner = new Scanner(System.in);) we are calling the method "scanner.nextLine();"
            //to read the line of input from the console.
            String name = scanner.nextLine();
            // muutuja age et lahutada sisestatud sünniaasta praegusest aastast ja saada vanus.
            int age = 2018 - yearOfBirth;

            if (age < 0 || age > 100) {
                System.out.println("Error! Your age is not in range! ");
            } else {

                System.out.println("Your name is " + name + ", and you are " + age + " years old");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();

    }
}
