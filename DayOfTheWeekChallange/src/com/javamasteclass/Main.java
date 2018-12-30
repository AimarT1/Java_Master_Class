package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

        printDayOfTheWeek_2(1);
        printDayOfTheWeek_2(2);
        printDayOfTheWeek_2(3);
        printDayOfTheWeek_2(4);
        printDayOfTheWeek_2(5);
        printDayOfTheWeek_2(6);
        printDayOfTheWeek_2(7);
        printDayOfTheWeek_2(-1);

    }
    public static void printDayOfTheWeek(int day){

//solution in swich
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thuesday");
                break;
            case 3:
                System.out.println("Wendsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

                default:
                    System.out.println("Invalid day");
                    break;
        }
    }

    //solution in if
    public static void printDayOfTheWeek_2(int day){
        if (day == 1){
            System.out.println("Monday");
        }else if (day == 2){
            System.out.println("Thuesday");
        }else if (day == 3){
            System.out.println("Wendsday");
        }else if (day == 4){
            System.out.println("Thursday");
        }else if (day == 5){
            System.out.println("Friday");
        }else if (day == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid day");
        }
    }
}
