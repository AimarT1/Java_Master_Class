package com.javamasteclass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        // ArrayList inherits from List(interface) aka abstractList.
        //ArrayList - its a reziseble array, it handles the rezizing automaticly.

        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
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
                    processArrayList();
                case 7:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstruction(){
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list .");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for item in the list.");
        System.out.println("\t 6 - To process the ArrayList.");
        System.out.println("\t 7 - To quit the application.");

    }

    public static void addItem (){
        System.out.println("Please enter the grocery item: ");
        //allows us to return anything until return is pressed, it will take that whats typed in,
        // and add it to the grosery class useing the add item, and that will add that to our arrayList.
        groceryList.addGrocery(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Current item name: ");
        String itemNumber = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        //useing -1 beacuse compuer starts counting from 0.
        //or could not use +1 in our grocery class methods.
        groceryList.modifyGroceryItem(itemNumber,newItem);
    }

    public static void  removeItem(){
        System.out.print("Enter item name: ");
        String itemNumber = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber);
    }

    public static void searchItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list");
        }else{
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
    //addition..
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        //"groceryList.getGroceryList()" - it is returng our GroceryList Classes arrayList.Saves entire array.
        newArray.addAll(groceryList.getGroceryList());
        //teine variant ja lühem kood.
        ArrayList<String> nextArrayList = new ArrayList<String>(groceryList.getGroceryList());
        //kolmas variant to copy arrayList
        String[] array = new String[groceryList.getGroceryList().size()];
        array = groceryList.getGroceryList().toArray(array);
    }
}
