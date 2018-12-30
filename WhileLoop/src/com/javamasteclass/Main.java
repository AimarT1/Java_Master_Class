package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(85));
        System.out.println(isEvenNumber(20));

        // challange code pt2.
        int number = 4;
        int finishNumber = 20;

        //we are testing the value at the top, un like do while where we test it at the bottom.
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }
        //challange pt3 modyfi the code above(i remaind the above intackt and will di it in the bottom)
        int number1 = 4;
        int finishNumber1 = 20;
        int count1 = 0;

        while (number1 <= finishNumber1) {
            number1++;

            if (!isEvenNumber(number1)) {
                continue;
            }
            System.out.println("Even number " + number1);

            count1++;
            if (count1 == 5) {
                break;
            }
        }
        System.out.println(count1 + " even numbers found");
//pt3 end

        int count = 1;
        while (count != 6) {
            System.out.println("Count value is: " + count);
            //whithout count++ it will be an infinate loop!
            count++;
        }
        //This how you do same thing but with for loop
        // you could do it with count also instead of i :for (count =1; count < 6; count++
        for (int i = 1; i < 6; i++) {
            System.out.println("Count value is: " + i);
        }
        /*Differnse with first while loop : if we get to the number == 6, then break.
        in first while we set it not equal to six if it, if it gets to that then break.
        in both cases you have to have count++ aka have the variable incremented. it will be a endless loop.
        */
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is: " + count);
            count++;
        }
        //third choise is do{}while(); loop
        //it is always going to be executed atleast once.
        count = 1;
        do {
            System.out.println("Count value is: " + count);
            count++;
        } while (count != 6);


    }

    //code challange pt1
    public static boolean isEvenNumber(int number) {
        while (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
