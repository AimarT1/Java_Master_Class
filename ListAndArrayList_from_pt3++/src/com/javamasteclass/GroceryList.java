package com.javamasteclass;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGrocery(String item) {
        groceryList.add(item);
    }

    //added getter
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        //size - will return items currently stored in the arrayList
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            //i + 1 - so our counting on the screen will start from number 1.
            //".get(i)" -this is going to put out all the elements in the array list
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    //created in part3
    public void modifyGroceryItem(String cuttentItem,String newItem) {
        //we are checking if current item is in file, and if it is we pass a new item
        int position = findItem(cuttentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        //.set() - will replace the item in that position
        groceryList.set(position, newItem);
        //we are using "(position + 1" - to count from 1
        System.out.println("Grocery item " + (position + 1) + " has been modifyed");
    }

    //created in part3
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        //to get the item we are removing and in what position it was.
        //String theItem = groceryList.get(position); // removed in part3
        //removes the item automaticly from that position
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        //.indexOf - searches the arrayList for you  and it finds the item that you passed
        // and returns the index position of our array list for that item. return -1 if list doesnt contain the element.
        return groceryList.indexOf(searchItem);
    }
    //created in part3
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }
}

