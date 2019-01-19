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
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    groceryList.printGroceryList();
                    break;
                case 7:
                    quit = true;
                    System.out.println("Exiting the Grocery list.");
                    break;
            }
        }
    }
    //method to print the instructions with available options.
    public static void printInstructions(){
        System.out.println("1 - Available options menu: ");
        System.out.println("2 - add item to grocery list. ");
        System.out.println("3 - modify grocery list.");
        System.out.println("4 - remove item from grocery list.");
        System.out.println("5 - search grocery item from the list.");
        System.out.println("6 - print the grocery list.");
        System.out.println("7 - exit the list.");
    }

    public static void addItem (){
        System.out.println("Enter item: ");
        //(String item) - we dont neew to use the item here, beacuse the .addGroceryItem method will acept that string paramter for us.
        //usese the input we give, and the method in that class to add.
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        //First to print the message on same line.
        System.out.print("Enter current item name: ");
        String itemPosition = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        // newItem - the item we going to enter.
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemPosition,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter the item you want to remove: ");
        //itemPosition - the items position number which we want to remove.
        String position = scanner.nextLine();
        //scanner.nextLine(); -didnt make anyy difference...
        groceryList.removeGroceryItem(position);
    }
    public static void searchItem(){
        System.out.println("Enter the item you want to search: ");
        String item = scanner.nextLine();
        if (groceryList.onFile(item)){
            System.out.println("Searched item: " + item + ", is on the list." );
        }else{
            System.out.println("Searched item: " + item +" is not in the list, try adding it first!");
        }
    }
}
