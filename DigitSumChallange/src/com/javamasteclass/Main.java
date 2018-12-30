package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of digits in number is " + sumDigits(125));
        System.out.println("Sum of digits in number is " + sumDigits(1));
        System.out.println("Sum of digits in number is " + sumDigits(398));


    }

    public static int sumDigits(int number) {
        if (number <= 9) {
            return -1;
        }
        int sum = 0;
        //125 -> 125/10 = 12 -> 12 *10 = 120 -> 125-120 = 5 kuna ta on int siis jääk kaob peale jagamist ära.
        //number > 0 = i want to keep looping until number = 0.
        while (number > 0){

            // First adding last digit to sum variable
            //extract the least signifigant digit
            int digit = number % 10;
            sum += digit;

            // Second removing the last digit from number variable
            //drop least signifigant digit
            number = number/10; // same as number /= 10
           // for testing
            System.out.println(digit); // for testing

        }
        return sum;
    }
}


/*
NB! Kõigepealt cütab sisend väärtuse, selle jäägi lisaab lõppsummase,
    siis sisend = sisend jagatud/10 ja eemaldab viimase numbri,
    selle jäägi aka järelejäänud arvu annab uuesti sisendiks ja kordab protsessi kiniks väärus on 0;

    //ilusam varjant koodist.

    public static int sumDigits (int number) {

       if (number < 10) {
           return -1;
       }

       int sum = 0;
            while (number > 0) {
                // First adding last digit to sum variable
                sum += number % 10;
                // Second removing the last digit from number variable
                number = number / 10;
            }
       return sum;
    }
 */