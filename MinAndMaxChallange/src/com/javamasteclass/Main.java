package com.javamasteclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //highest value int can hold
        int min = Integer.MAX_VALUE;
        //lowest value int can hold
        int max = Integer.MIN_VALUE;
        //boolen first = true; teine võimalus

        //endless loop
        while (true) {

            System.out.println("Enter number: ");
            //loon muutuja isAnInt mis kontrollib kas sisestatud väärtus oli int tüüpi
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                /* teine võimalus
                if (first){
                    first = false;
                    min = number;
                    max = number;
                }*/

                if (number > max) {
                    max = number;
                } if (number < min) {
                    min = number;
                }

            } else {
                break;
            }

            scanner.nextLine(); //handle input
        }
        System.out.println("min = " + min + " max = " + max);

        scanner.close();

    }
}
