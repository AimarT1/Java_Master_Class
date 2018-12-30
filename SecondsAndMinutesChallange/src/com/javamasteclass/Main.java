package com.javamasteclass;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        getDurationString(189, 11);
        getDurationString(250);
        getDurationString(61, 0);

        getDurationString(65,45);
        getDurationString(3945);
    }

    public static int getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            System.out.println("Invalid value");
            return -1;
        }
        // arvutan tunnid
        int hours = minutes / 60;
        // arvutan järelejäänud minutid
        int remaingMinutes = minutes % 60;
        System.out.println(hours + "h " + remaingMinutes + "m " + seconds + " s");
        return hours;
    }

    public static int getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
            return -1;
        }
        int minutes = seconds / 60;
        int remaingSeconds = seconds % 60;
        System.out.println(minutes + " m " + remaingSeconds + " s");
        return getDurationString(minutes, remaingSeconds);
    }
}

/*
Tims solution;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));

    }
// kasutab "Sting" tüüpi, seega saab "return"-is kasutada otse Stringe ilma printimata, tagastuseks.
    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return "Invalid value";
        }

        long hours = minutes / 60;
        long remaingMinutes = minutes % 60;
        return hours + "h " + remaingMinutes + "m " + seconds + " s";
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        long minutes = seconds / 60;
        long remaingSeconds = seconds % 60;

        return getDurationString(minutes, remaingSeonds);
    }
}


 */
