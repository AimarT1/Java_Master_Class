package com.javamasteclass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> shoppingList = new LinkedList<String>();

        addItem(shoppingList, "Bag");
        addItem(shoppingList, "Shirt");
        addItem(shoppingList, "Boots");
        addItem(shoppingList, "Gun");
        addItem(shoppingList, "Gumm");
        addItem(shoppingList, "Condoms");
        addItem(shoppingList, "Cheese");
        addItem(shoppingList, "Car");
        addItem(shoppingList, "Snus");
        addItem(shoppingList, "Milk");
        addItem(shoppingList, "Java knowlage");
        printList(shoppingList);
        shop(shoppingList);


    }

    public static void printList(LinkedList<String> shopingList) {

        Iterator<String> i = shopingList.iterator();

        while (i.hasNext()) {
            System.out.println("Item: " + i.next());
        }
        System.out.println("=================");
    }

    public static void printMenu() {
        System.out.println("0 - Shopping over.Quit.");
        System.out.println("1 - Next item.");
        System.out.println("2 - Previous item.");
        System.out.println("3 - Remove item.");
        System.out.println("4 - Print menu.");
        System.out.println("5 - Print shoppingList");
    }

    //it has to return some type of value, so use boolen othetwise an infinte loop
    public static boolean addItem(LinkedList<String> shoppingList, String newItem) {

        ListIterator<String> shoppingListListIterator = shoppingList.listIterator();

        while (shoppingListListIterator.hasNext()) {

            int coparison = shoppingListListIterator.next().compareTo(newItem);
            if (coparison == 0) {
                System.out.println(newItem + " item is already in the list");
                return false;
            } else {
                if (coparison > 0) {
                    shoppingListListIterator.previous();
                    shoppingListListIterator.add(newItem);
                    return true;
                } else if (coparison < 0) {
                    //move on to next item
                }
            }
        }
        shoppingListListIterator.add(newItem);
        return true;
    }

    private static void shop(LinkedList<String> shopingList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<String> listIterator = shopingList.listIterator();

        if (shopingList.isEmpty()) {
            System.out.println("No items in shopping list.");
            return;
        } else {
            System.out.println("Now seeing item: " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Current item: " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of shopping list");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Previous item: " + listIterator.previous());
                    } else {
                        System.out.println("Your at the start of the shopping list");
                        forward = true;
                    }
                    break;
                case 3:
                    if (shopingList.size() != 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Current item: " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Previous item: " + listIterator.previous());
                        }
                    } else {
                        System.out.println("ShoppingList is empty!");
                    }
                    break;
                case 4:
                    printMenu();
                    break;

                case 5:
                    printList(shopingList);
            }
        }
    }
}