package com.javamasteclass;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


       int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Aimar",position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Root",position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Shaw",position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Finch",position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Reese",position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Fasco",position);
    }
    //Challange
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " Managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if ((playerScore >= 500) && (playerScore < 1000)) {
            return 2;
        } else if ((playerScore >= 100) && (playerScore < 500)) {
            return 3;
        } else {
            return 4;
        }


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}



/*
public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true,800,5,100);

        calculateScore(true,10000,8,200);

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
 */
