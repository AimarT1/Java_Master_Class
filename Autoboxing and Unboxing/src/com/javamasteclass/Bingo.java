package com.javamasteclass;

import java.util.ArrayList;
import java.io.*;
import java.util.Random;

public class Bingo {

    static ArrayList<Integer> B = new ArrayList<>();
    static ArrayList<Integer> I = new ArrayList<>();
    static ArrayList<Integer> N = new ArrayList<>();
    static ArrayList<Integer> G = new ArrayList<>();
    static ArrayList<Integer> O = new ArrayList<>();
    static Random randomB = new Random();
    static Random randomI = new Random();
    static Random randomN = new Random();
    static Random randomG = new Random();
    static Random randomO = new Random();
    static Random randomNumber = new Random();
    int column;
    int row;
//    int randomNumber;


    public static void main(String[] args) throws IOException {
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);
        System.out.println("B | I | N | G | O |");

        int[][] board = new int[5][5];

        for (int b = 1; b <= 15; b++) {
//          int randomNumber = random.nextInt(max - min) + min;
            int randomb = randomB.nextInt(15 - 1) + 1;
            if (numCheck(B, randomb)) {
                B.add(randomb);
            }

        }
        for (int i = 16; i <= 30; i++) {
            int randomi = randomI.nextInt(30 - 16) + 16;
            if (numCheck(I, randomi)) {
                I.add(randomi);
            }
        }
        for (int n = 31; n <= 45; n++) {
            int randomn = randomN.nextInt(45 - 31) + 31;
            if (numCheck(N, randomn)) {
                N.add(randomn);
            }
        }
        for (int g = 46; g <= 60; g++) {
            int randomg = randomG.nextInt(60 - 46) + 46;
            if (numCheck(G, randomg)) {
                G.add(randomg);
            }
        }
        for (int o = 61; o <= 75; o++) {
            int randomo = randomO.nextInt(75 - 61) + 61;
            if (numCheck(O, randomo)) {
                O.add(randomo);
            }
        }
        boardDisplay(board);

        int randomNum = randomNumber.nextInt (75 - 1) + 1;
        System.out.print("" + randomNum);
    }

    public static void boardDisplay(int[][] board) {
        for (int i = 0; i < board.length; i++) {

            System.out.println("");
            System.out.print(B.get(i) + " | ");
            System.out.print(I.get(i) + " | ");
            System.out.print(N.get(i) + " | ");
            System.out.print(G.get(i) + " | ");
            System.out.print(O.get(i) + " | ");
        }
    }

    public static boolean numCheck(ArrayList<Integer> box, int n) {
        for (int i = 0; i < box.size(); i++) {
            if (box.get(i) == n) {
                return false;
            }
        }
        return true;
    }
}
