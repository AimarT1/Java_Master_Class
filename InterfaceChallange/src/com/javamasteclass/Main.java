package com.javamasteclass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Mazda mazda = new Mazda("6","2.0 D","Violet Black",121,6);
        //prints out the toString method with our given values.
        System.out.println(mazda);
        //massing new instance of mazda object to method save object, wich is going to save the values to storage aka arraylist.
        saveObject(mazda);
        System.out.println("******");

        ISavable ferrari = new Ferrari();
        System.out.println(ferrari);
        saveObject(ferrari);
        loadObject(ferrari);
        //calling the save method to save the new input values.
        saveObject(ferrari);

    }
    //method to saveObject values to "Storage"
    public static void saveObject(ISavable objectToSave){
//passing the objectToSave parameter then the writemethod from Isavable interface and the .size to get the values saved into arraylist.
        for (int i = 0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    //method to load the values of the readValues Method, where we inputed the values-
    public static void loadObject(ISavable objectToLoad){
        //ArralList<Sring> called values = the method where we read them from readValues();
        ArrayList<String> values = readValues();
        //ISavable objectToLoad - ISavable - is the Inteface with method, we acess the read mehod from that class and pass our paramter.
        objectToLoad.read(values);
    }

    //method to readInput values [to simulate getting values from a file and return an arraylist]
    public static ArrayList<String> readValues(){
        //Greating a new ArrayLIST instance called values. aka the values you input
        ArrayList<String> values = new ArrayList<String>();
        //scanner for input
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        //index - for index posiion of values to save aka read/write
        int index = 0;
        System.out.println("Choose option: ");
        System.out.println("0 - quit");
        System.out.println("1 - Enter a string for new ObjectInstance");

        while (!quit){
            System.out.println("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("1 - Enter a string for new ObjectInstance[index0-4]");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    //index ++ - increacases untill all value indexis are met.
                    index++;
                    break;
            }
        }
        return values;
    }
}
