package com.javamasteclass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player aimar = new Player("Aimar",10,15);
        System.out.println(aimar.toString());
        saveObject(aimar);

        aimar.setHitpoints(18);
        System.out.println(aimar);
        aimar.setWeapon("Bazuka");
        saveObject(aimar);
        //loadObject(aimar);
        System.out.println(aimar);

        //Isavble - to acess the metods in the interface.
        ISavable wolf = new Monster("Wolf",20,40);
        System.out.println(wolf);
        saveObject(wolf);
        System.out.println("Strenght = " + ((Monster) wolf).getStrenght());
    }

    //method to read values from the console
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose: ");
        System.out.println("1 - to enter a string.");
        System.out.println("0 - to quit");

        while (!quit){
            System.out.println("Choose an option: ");
            int choise = scanner.nextInt();
            scanner.nextLine();
            switch (choise){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    //creatin a method to save the objects. WE pass ISavable as pramater and call it objectToSave.
    //accessing the .write from the Interface class
    public static void saveObject(ISavable objectToSave){
        //we are cicling through all the entries useing .write-(one entry in arraylist for each item).size to see if there is any.
        for (int i = 0; i < objectToSave.write().size(); i++){
            //objectToSave.write().get(i) - shows the list of object saved in to the list.
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void  loadObject(ISavable objectToLoad){
        ArrayList<String> values = readValues();
        //we pass the read method from Interface to read the data saved values methdod.
        objectToLoad.read(values);
    }
}
