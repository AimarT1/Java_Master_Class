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
    //pt3 we eliminate users capapilty to insert number, but to use item names only aka string type.
    //IN other word we hide the inner workings!
    //method overloadin. we are going to find and pass the number to the method which will do the set for us.
    public void modifyGroceryItem(String currentItem,String newItem){
        int position = searchItem(currentItem);
        //if the current item exists we wanto pass the new item and save that.
        if (position >= 0){
            //we call the first method with 2 paramiters to do the work.
            modifyGroceryItem(position,newItem);
        }
    }
    // method to change the item, we create an variable position to give the position of the element we want to modify.
    //and variable type String called "newItem"- wich we want to input as the new item and it replaces the old element in that position.
    private void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);
        //(position +1) - cause we started count from 1.
        System.out.println("Grocery item " + (position +1) + " has been replaced with: " + newItem);
    }
    //method overloadin. we are going to find and pass the number to the method which will do the rest for us.
    public void removeGroceryItem(String item){
        int position = searchItem(item);
        if (position >= 0){
            //we call the first method with int the paramiter to do the work.
            removeGroceryItem(position);
            System.out.println("Item has beem removed.");
        }
    }
    //method to remove the item. "int position as what item in wich position we want to remove"
    private void removeGroceryItem(int position){
        //.remove . removes the element from that position.
        groceryList.remove(position);
    }
    //method to search an item.
    private int searchItem(String searchItems){
        //will return number greater than 0 if it is there.
    return groceryList.indexOf(searchItems);
    }

    public boolean onFile(String searchItems){
        //calling the searchItem method to search, if it is return true.
        int position = searchItem(searchItems);
        if (position >= 0){
            return true;
        }
        return false;
    }

    //pt3 we eliminate users capapilty to insert number, but to use item names only aka string type.
    //IN other word we hide the inner workings!
}

