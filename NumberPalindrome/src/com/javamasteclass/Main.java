package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(7));

    }

    public static boolean isPalindrome(int number) {


        //for storing the reverse on number
        int reverse = 0;
        //for coparing the original input to the reverse output.
        int originalNumber = number;

        //that means number can be both negative and positive but not zero;
        while (number != 0) {
            //for extracting and saveing the last digit
            int lastDigit = number % 10;
            //for increasin the place value of reverse
            reverse = lastDigit + (reverse * 10);
            //for  removing the last digit
            number = number / 10;
        }
        if (originalNumber == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
