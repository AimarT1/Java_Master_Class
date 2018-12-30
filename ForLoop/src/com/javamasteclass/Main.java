package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10_000,2));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10_000,3));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10_000,4));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10_000,5));

        // This is basic format of the "for" statement : for( inizialaze; termination; increment){}
        // "init " = inizialize once at the start of the loop,
        /*"termination" = how we wanna exit, in what point do we excit,
            it has tu evaluate to false, once it valuates to false the loop will exit and wiil come down and proses on the next line. */
        //"increment" is invoced after each itaration times loop goes round.
        // "i" : we are inisalatizing a special variable just for this loop, once it exits/finishes  the variable wount exist.

        // once loop reaces 5 it will exit, and final output is 4-, case 4 is less then 5 but 5 is not!
        // since the "i=0" is set for 0, it starts printing form 0;
        for (int i=0; i<5; i++){
            System.out.println("Loop " + i + " hello!");
        }
        //challange
        for (int i=2; i<9;i++ ){
            System.out.println("10,000 at " + i + " interest = " + calculateInterest(10_000,i));
            // useing " String.format("%.2f") " to print out 2 decimal points;
            System.out.println("10,000 at " + i + " interest = " + String.format("%.2f",calculateInterest(10_000,i)));

        }

        for (int i=8; i>1; i--){
            System.out.println("10,000 at " + i + " interest = " + String.format("%.2f",calculateInterest(10_000,i)));
        }
        //PrimeNumberChallangeStrt
        //Teen muutuja "count" , count ++ ehk kasvata loendit
        int count = 0;
        for (int x = 2; x < 100; x++){
            if (isPrimeNr(x)){
                count ++;
                //count ++ ehk kasvata loendit

                System.out.println(x +  " Is a prime number!");
                //Kui "count == 3" ehk on leidnud kolm prime arvu siis lõpeta. Millejaoks kasutan breaki ehk kui cont on täis siis lõpeta.
                if (count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }

            }
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate / 100));

    }

    public static boolean isPrimeNr (int n){

        //vaatab kas arv võrde 1-ga kui siis annab vale, ehk pole täis number.
        if (n == 1) {
            return false;
        }
        // starts from 2. [n/2] used as a short cut, we are looking for numbers that divide into n.
        // no numnber that is greater than n / 2 is going to divide into n. [n/2] is optimazation tehnique, to prosess only number we need to process.
        // teine variant : for (int i=2; i <= (long) Math.sqrt(n); i++)
        for (int i=2; i <= n/2; i++) {
            //kui jääki ei jää siis arev ei ole prime number ja tagastab false.
            if (n % i == 0 ){
            return false;
        }
        }
        return true;

    }
    //PrimeNumberChallangeEnd.
}
