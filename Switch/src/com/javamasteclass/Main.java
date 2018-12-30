package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 4;
        //switch is a statement, like if is a statement
        //switch is good to use if you are testing the same variable and you wanna test different values to that variable.
        //swich can be used with 4 primitive types: byte,short,char and int.
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                //what "break" does, it terminates the encloseing swich statement, and control continues after the swich block.
                // if you forgett to put "break" it will continue till it find a break. DONT FORGETT BREAK.
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case  4: case 5:
                System.out.println("Was 3 or 4 or 5");
                System.out.println("Actually it was a " +switchValue);
                break;

                default:
                    System.out.println("Was not 1 or 2");
                    break;
        }
        //Challange
        //char required ' ' wouldnt acept "".
        char Letter = 'A';

        switch (Letter){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Was letter A,B,C,D or E." + " Input letter was: " + Letter);
                break;

                default:
                    System.out.println("letter not found");
        }
        //For upper or lower case letter use method "toLowerCase() or toUpperCase()" , fit it as you need it.
        // in case "january" it has to be in lower case!
        // If it is like this case "January" it will not find it, it take all in lower or all in upper -case!

        String month = "december";
        switch (month.toLowerCase()){
            case "January":
                System.out.println("Jan");
                break;

            case "February":
                System.out.println("Feb");
                break;

                case "December":
                    System.out.println("Dec");
                    break;

                    default:
                        System.out.println("Month not found");

        }
    }
}
