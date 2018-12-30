package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
	int result = 1 +2;
        System.out.println("1 + 2 = " +  result);

        int previousResult = result;

        result = result -1 ;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult =result;
        result = result/ 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result now is " + result);

        result *= 10;
        System.out.println("Result now is " + result);

        result -= 10;
        System.out.println("Result now is " + result);

        result /= 10;
        System.out.println("Result now is " + result);

        boolean isAlien = false;
        //assingment operator aka set value to false.
        if (isAlien == true)
            //if the content of variable "IsAlien" is false, then print result.
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore <=100)
            System.out.println("You got the high score!");

        int secondTop = 95;
        // doublebrackets (()) to make code clearer to read.
        if ((topScore > secondTop) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        if ((topScore > 90) || (secondTop <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true!");

        boolean isCar = false;
        if (isCar == true)
            //if there is one = sign then it assings  new valu to it !
            System.out.println("This is not supposed to happen");

        //turnryOperator !
        //Give a value based on 2 conditions.
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(isCar)
            System.out.println("wasCar is true");

        //Challange

        double number1 = 20;
        double number2 = 80;
        double addSum = (number1 + number2) *25;
        System.out.println(addSum);
        double result1 = addSum % 40;
        System.out.println(result1);
        if (result1 <= 20 )
            System.out.println("Total was over the limit");


    }
}
