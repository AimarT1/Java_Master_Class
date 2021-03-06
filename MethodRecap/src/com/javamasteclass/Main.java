package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

       int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Finsh",calculateHighScorePosition(1500));
        displayHighScorePosition("Fasco", calculateHighScorePosition(900));
        displayHighScorePosition("Reese",calculateHighScorePosition(400));
        displayHighScorePosition("Smaratin",calculateHighScorePosition(50));
        displayHighScorePosition("Shaw",calculateHighScorePosition(1000));
        displayHighScorePosition("Root",calculateHighScorePosition(500));


    }

    public  static void displayHighScorePosition (String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the highscore table");

    }

    public  static  int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        } else if(playerScore >= 500 && playerScore < 1000){
            return  2;
        }else if (playerScore >= 100 && playerScore < 500){
            return  3;
        }else{
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score,int levelCompleted,int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

}
