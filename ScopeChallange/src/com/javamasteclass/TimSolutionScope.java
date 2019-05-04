package com.javamasteclass;

import java.util.Scanner;

public class TimSolutionScope {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter number: ");
        //new instance of x class. passing the scanner.nextInt as an input pramater
        X x = new X(scanner.nextInt());
        //accessing the new instane and the x() method in that class.
        x.x();



    }
}
