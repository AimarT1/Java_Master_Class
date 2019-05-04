package com.javamasteclass;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your number: ");
        int x = scanner.nextInt();
        x(x);

    }
    public static void x(int x){
        for (int X = 0; X <= 12; X++){
            System.out.println(x * X );
        }
    }
}
/*
    public static void readInteger(int x){

        boolean quit = false;

        while (!quit){
            System.out.println("Enter your choise: 2 to enter int 0 to quit");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0 :
                    quit = true;
                    System.out.println("quit program");
                    break;
                case 2:
                    System.out.println("Enter your number: ");
                    scanner.nextInt(x);
                    x(x);
                    break;

            }
        }
    }*/

