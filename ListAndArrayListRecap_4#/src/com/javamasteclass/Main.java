package com.javamasteclass;

import java.util.Scanner;

public class Main {
    //Scanner for input. scanner is a filed.
    private static Scanner scanner = new Scanner(System.in);
    //calling the GroceryLISTcLASS, with its field groceryList;
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        //variables to quit and to choose options.
        boolean quit = false;
        int choiseOption = 0;
        printInstructions();

        while (!quit){

            //empty print for better readebilitty.
            System.out.println("");
            System.out.println("Enter option to choose from: ");
            choiseOption = scanner.nextInt();
            //we need next line here to put the next input correctly
            scanner.nextLine();

            switch (choiseOption){
                case 1:
                    printInstructions();
                    break;
                case 2:
                    addGroceryItem();
                    break;
                case 3:
                    modifyGroceryItem();
                    break;
                case 4:
                    removeGroceryItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    groceryList.printGroceryList();
                    break;
                case 7:
                    quit = true;
                    System.out.println("Exiting list ...");
            }
        }

    }

    //method to print the instructions with available options.
    public static void printInstructions() {
        System.out.println("1 - Available options menu: ");
        System.out.println("2 - add item to grocery list. ");
        System.out.println("3 - modify grocery list.");
        System.out.println("4 - remove item from grocery list.");
        System.out.println("5 - search grocery item from the list.");
        System.out.println("6 - print the grocery list.");
        System.out.println("7 - exit the list.");
    }

    public static void addGroceryItem(){
        System.out.println("Enter item you want to add to the list: ");
        //(String item) - we dont neew to use the item here, beacuse the .addGroceryItem method will acept that string paramter for us.
        //usese the input we give, and the method in that class to add.
        String item = scanner.nextLine();
        groceryList.addGroceryItem(item);
    }

    public static void modifyGroceryItem(){
        //First to print the message on same line.
        System.out.print("Enter item  you want to modify: ");
        String itemNumber = scanner.nextLine();
        //scanner.nextLine(); -didnt make anyy difference..
        System.out.print("Enter replacement item: ");
        // newItem - the item we going to enter.
        String newItem = scanner.nextLine();
        // -1 to get the right position as compuer starts reading from zero.Other wise will get outof bound exeption.
        groceryList.modifyGroceryItem(itemNumber ,newItem);
        System.out.println("Old item: " + itemNumber + " has been replaced with: " + newItem);
    }
    public static void removeGroceryItem(){
        System.out.println("Enter item  you want ro remove : ");
        //itemPosition - the items position number which we want to remove.
        String itemPosition = scanner.nextLine();
        groceryList.removeGroceryItem(itemPosition);
    }
    public static void searchItem(){
        System.out.println("Enter item you wnat to find: ");
        String item = scanner.nextLine();
        //checking if the item is ther if it is then print...
       groceryList.searchItem(item);
    }
}