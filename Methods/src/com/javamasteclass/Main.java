package com.javamasteclass;
/*
public class Main {
    //til the last brackey this is a method! Main method.
    public static void main(String[] args) {
        calculateScore(true,800,5,100);

        calculateScore(true, 10000,8,200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // if you dont wanna retun any info, then you use keyword void.
        // apriviate code "if (gameOver == true)" same as "if (gameOver)", makes code smaller.
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
        //-1 is to indicate an error aka value not found.
    }
}
*/  //More readable version if not very comfortable with the latter.
public class Main {
    //til the last brackey this is a method! Main method.

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highscore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your high score was " + highscore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        highscore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your high score was " + highscore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Aimar ", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Shaw ", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Root ", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Fitch ", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Fasco ", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Elias ", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Machine ", highScorePosition);
    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " Managed to get into the position of " + position + " on the high score table");

    }
    public static int calculateHighScorePosition (int playerScore){

        if (playerScore >= 1000){
            return 1;
            //you can remove the second parts because first is true.
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore <500){
            return 3;
        } else {
            return  4;
       }
        // alternative solution belowe.
//        int position = 4; // assuming position 4 will be returnes
//        if (playerScore >= 1000) {
//            position = 1;
//        }else if(playerScore >= 500){
//        position =2;
//        } else if (playerScore >= 100) {
//            position = 3;
//        }
//        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // if you dont wanna retun any info, then you use keyword void.
        // apriviate code "if (gameOver == true)" same as "if (gameOver)", makes code smaller.

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}

