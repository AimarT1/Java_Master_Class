package com.javamasteclass;

import java.util.ArrayList;

public class GroceryList {
    //we need to define the type and the variable name.
    //ArrayList can hold objects aka what type of data is going to the array list.
    //ArrayList is a class.
    private ArrayList<String> groceryList = new ArrayList<String>();

    //method to add groceris and save them into the list.
    public void addGroceryItem(String item){
       //we are callint the method that is part of the arrayList class aka groceryList we created.
        //it automaticly adds the item to the arrayList.
       groceryList.add(item);
    }

    public void printGroceryList(){
        //size will return how many elements are currently in the arrayList.
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        //we loop the list to see how element are there and then print them out
        //used the size to return the number of elements in the list.
        for (int i = 0; i < groceryList.size(); i ++){
            //(i+1) to start rhe counting from number 1. .get(i) to print elements in the position.
            System.out.println((i+1) + ". " + groceryList.get(i));

        }
    }
    // method to change the item, we create an variable position to give the position of the element we want to modify.
    //and variable type String called "newItem"- wich we want to input as the new item and it replaces the old element in that position.
    public void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);
        //(position +1) - cause we started count from 1.
        System.out.println("Grocery item " + (position +1) + " has been replaced with: " + newItem);
    }
    //method to remove the item. "int position as what item in wich position we want to remove"
    public void removeGroceryItem(int position){
        //return as a string item(name) we want to move and gets the position it is placed.
        String item = groceryList.get(position);
        //.remove . removes the element from that position.
        groceryList.remove(position);
    }
    //method to search an item.
    public void searchItem(String searchItems){
        //to seravh the item we use .indexOf(searchItems); and we pass the searchItems as parameter to search for.
        //will return a number for that searced item
        int position = groceryList.indexOf(searchItems);
        if (position >= 0){
            System.out.println("Searched item: " + searchItems + " ." + groceryList.get(position) + "is on the list." );
        }else{
            System.out.println("Searched item, is not in the list, try adding it first!");
        }
    }
}
