package com.javamasteclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.in - allows you to input into the console
        //Scanner - is Java build in Class, which allows us to read user input.
        //new - we use it to create an instanse of scanner aka we create a new object of type Scanner.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        //check if intput qualifays as int.
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            //method next.int allows to read a intiger
            int yearOfBirth = scanner.nextInt();
            //to handle next line character(enter key)[if you dont add it it will read enter key as input!]
            scanner.nextLine();

            System.out.println("Enter your name: ");
            //to read a line of input from the console.
            String name = scanner.nextLine();

            //to calculate age
            int age = 2018 - yearOfBirth;
            if (age > 0 && age < 100) {
                //To print out the input.
                System.out.println("Your name is: " + name + ", and you are " + age + " years old.");
            }else{
                System.out.println("Invalid year of birth.");
            }
        }else{
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}
