package com.javamasteclass;

import java.util.ArrayList;

public class GroceryList {

    //we need to define the type and the variable name.
    //ArrayList can hold objects aka what type of data is going to the array list.
    //ArrayList is a class.It inherits from abstact list.Its a rezisable array, handles the sizing automaticly.
    private ArrayList<String> groceryList = new ArrayList<String>();

    //method to add groceris and save them into the list.
    public void addGroceryItem(String item) {
        //calling the variable/field groceryList and use .add(item) to add an item to the "new ArrayList<String>" instance.
        groceryList.add(item);
    }

    public void printGroceryList() {
        //size will return how many elements are currently stored in the arrayList.
        System.out.println("You have: " + groceryList.size() + " items in your Grocery list.");
        //we loop the list to see how many element are there and then print them out
        //used the size to return the number of elements in the list.
        //in case of regular array it would be "arry.lenght"
        for (int i = 0; i < groceryList.size(); i++) {
            //(i+1) to start the counting from number 1. .get(i) to print elements in the position.
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    //pt3 we eliminate users capapilty to insert number, but to use item names only aka string type.
    //IN other word we hide the inner workings!
    //method overloadin. we are going to find and pass the number to the method which will do the set for us.
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findiSearchItem(currentItem);
        //if the current item exists we wanto pass the new item and save that.
        if (position >= 0) {
            //we call the first method with 2 paramiters to do the work.
            modifyGroceryItem(position, newItem);
        }
    }

    // method to change the item, we create an variable position to give the position of the element we want to modify.
// and variable type String called "newItem"- wich we want to input as the new item and it replaces the old element in that position.
    private void modifyGroceryItem(int position, String newItem) {
        //groceryList.set - replaces the item in that position with the "newItem"
        groceryList.set(position, newItem);
        //(position +1) - cause we started count from 1.
        System.out.println("Grocery item " + (position + 1) + " has been updated");
    }

    //method overloadin. we are going to find and pass the number to the method which will do the rest for us.
    public void removeGroceryItem(String item) {
        int position = findiSearchItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
            System.out.println("Item has been removed");
        }else{
            System.out.println("Entered item is not in the list, cant remove ! ");
        }
    }
    //method to remove the item. "int position as what item in wich position we want to remove"
    private void removeGroceryItem(int position) {
        //return as a string item(name) we want to move and gets the position it is placed.
        //we create a variable item = to store the "groceryList.get(position);" aka item in that position.
        String item = groceryList.get(position);
        //.remove . removes the element from that position.
        groceryList.remove(position);
    }

    //method to search an item.
    public String searchItem(String searchItems) {
        //to seravh the item we use .indexOf(searchItems); and we pass the searchItems as parameter to search for.
        //will return a number for that searced item
        int position = findiSearchItem(searchItems);
        if (position >= 0) {
            //retun contents in that position.
            System.out.println("Found item: " + searchItems + " in the Grocery list.");
            return groceryList.get(position);
        } else {
            System.out.println("Item not found!");
            return null;
        }
    }

    private int findiSearchItem(String item) {
        return groceryList.indexOf(item);
    }
}
