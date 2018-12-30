package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Aimar",500);
        System.out.println("New score is " + newScore);
        //Thats how you use a walue you have calculated and return it to calculations.

        calculateScore(75);
        calculateScore();
//Challange
        calcFeetAndInchesToCentimeters(12,52);
        calcFeetAndInchesToCentimeters(12);

        calcFeetAndInchesToCentimetersTims(12,52);
        calcFeetAndInchesToCentimetersTims(6,0);

        //totest in code
        double centimeters = calcFeetAndInchesToCentimetersTims(6,0);
        if(centimeters < 0.0){
            System.out.println("Invalid parameter");
        }

        calcFeetAndInchesToCentimetersTims(100);



    }
    // unique method signature, in this case the method name:"calculate score"

// Method overloading: using same method name, but a differtn number parameiters in variable.
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    //new method with same name, but with one paramiter.
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    //new method with same name, but no paramiters.
    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;

}
//Challange My Result
    public static int calcFeetAndInchesToCentimeters (double feet, double inches) {
        if ( (feet >= 0) || ((inches >= 0) && (inches <= 12))  ){
            System.out.println("Feet = " + feet + " and Inches = " + inches);
    }else{
            return  -1;
        }
    return -1;
    }
    public  static int calcFeetAndInchesToCentimeters (double inches){
        double inchesToFeet = inches / 12;
        if (inches >= 0){
            System.out.println(inches + " Inches = " + inchesToFeet + " Feet");
        }
        //tegin ilma elsita kuna tulemus tuleb samma.
        return  -1;
    }
    // Tims;
    public  static double calcFeetAndInchesToCentimetersTims(double feet,double inches){
        if ( (feet < 0) || ((inches < 0) || (inches >12))){
            //testimiseks, kuna negative 1- i puhul ei l´kuvata midagi mis tähendab viga.
            System.out.println("Invalid feet or inches parameters");
            return  -1;
        }
        //"feet "result in centimeters
        double centimeters = (feet * 12) * 2.54;
        // now uses the already calculated feet result in centimiters output to calculate inches input to centimets and then add rhem togeter.
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " +centimeters + " cm");
        return centimeters;
    }
    public  static double calcFeetAndInchesToCentimetersTims(double inches){
        if (inches < 0){
            return -1;
        }
        // arvutab footid
        //(int) to show you the error with rounding. And a way to discard decimal places. In this case you dont have to use it.
        double feet = (int) inches / 12;
        // arvutab inch jäägi
        double remaingInces = (int) inches % 12;
        System.out.println(inches + " inches is equal to " +feet + " feet and " +remaingInces + "inches");
        //Kutsun esimese "calcFeetAndInchesToCentimetersTims" meetodi ja annab talle parameetrid : feet ja remaingInces(teise meetodi muutuja, mis on jäägi arvutamiseks) -- idena.
        //Teeb kaks ühes: tagastab tulemuse ja kutsub meetodi. returniks on calkulatsioon esimeses meetodis.
        return calcFeetAndInchesToCentimetersTims(feet,remaingInces);
    }
}


/*
kellegi esimese lahendus võrdluseks omale:
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {

            double centimeters = (feet * 12) * 2.54;

            System.out.println(feet + " foot " + inches + " = " + centimeters + "cms");

            return centimeters+= (inches*2.54);

        } else {
            System.out.println("Wrong feet or inches");
            return -1;
        }
 */
