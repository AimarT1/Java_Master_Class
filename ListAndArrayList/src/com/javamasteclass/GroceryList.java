package com.javamasteclass;

import java.util.ArrayList;

public class GroceryList {
    //exp regular array: private int[] myNumber = new int[50]; myNumber[5] = 4;

    //Array list can hold objects. we have to tell it what type of data is going into arrayList
    //You are creating an array list, between "< >" - you define wich type of list you are creating.
    //the arrayList is actually a class.
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGrocery(String item) {
        groceryList.add(item);
    }
    public void printGroceryList(){
        //size - will return items currently stored in the arrayList
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i< groceryList.size(); i++){
            //i + 1 - so our counting on the screen will start from number 1.
            //".get(i)" -this is going to put out all the elements in the array list
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        //.set() - will replace the item in that position
        groceryList.set(position,newItem);
        //we are using "(position + 1" - to count from 1
        System.out.println("Grocery item " + (position + 1) + " has been modifyed");

    }

    public void removeGroceryItem(int position){
        // to get the item we are removing and in what position it was.
        //String theItem = groceryList.get(position);
        //removes the item automaticly from that position
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
        //.contains() - return true if the list contains the specific element.
       // boolean exists = groceryList.contains(searchItem);
        //.indexOf - searches the arrayList for you  and it finds the item that you passed
        // and returns the index position of our array list for that item. return -1 if list doesnt contain the element.
        int position = groceryList.indexOf(searchItem);
        if (position >= 0){
            //we want to return the content in that arrayList entry
            return groceryList.get(position);
        }
        //if its less than 0.
        return null;
    }
}
