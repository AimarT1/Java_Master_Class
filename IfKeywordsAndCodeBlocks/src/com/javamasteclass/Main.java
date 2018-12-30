package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 400;
        int levelCompleted = 5;
        int bonus = 100;

        //use codeblocs to make code clarer and easyer to read.
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less then  5000 but greater then 1000");
//            System.out.println("This was executed");
//        } else if (score < 1000) {
//            System.out.println("Your score was less then 1000");
//
//        } else {
//            System.out.println("Go here!");
//        }
        // apriviate code "if (gameOver == true)" same as "if (gameOver)", makes code smaller.
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        // wariables created inside a codeblock cant be accest outside of the codeblock, But variables outside a code block can be acessed inside acodeblock.

        //challange.
        //my salotion
        int score2 = 1000;
        int levelCompleted2 = 8;
        int bonus2 = 200;

        if (gameOver) {
            int secondScore =score2 + (levelCompleted2 * bonus2);
            System.out.println("Your second score was " + secondScore);
        }

        //Tims variant
        //Disatvantage of code dublication you have to change code in all the places where code is duplicated.

//        score = 1000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted* bonus);
//            System.out.println("Your second score was " + finalScore);
//        }

    }
}
