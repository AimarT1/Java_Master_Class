package com.javamasteclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner - java class, scanner - java method, System.in - loeb sisestust/inputi.
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        System.out.println("Enter number " + count + ": ");

        //kasutan hasNetInt meetotid scanner java classist kas sisestatud on number väärtus.
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){

            int number = scanner.nextInt();
            scanner.nextLine();

            while (count != 10){
                count++;
                continue;
            }





        }else {
            System.out.println("Invalid number");
        }
        scanner.close();
    }
}
