package com.javamasteclass;

import java.util.ArrayList;

public class GroceryList {
    //Creating an array list with type string.
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        //will return how many elements you have in arrayList
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size();i++){
            //i + 1 to start count from 1. groceryList.get(i) - tagastab elemendi väärtuse.
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position >= 0){
            modifyGroceryItem(position,newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position +1 ) + " has been modified.");
    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    private int findItem(String searchItem){
        //return the position of the item and the position of it.
        return groceryList.indexOf(searchItem);
    }
    public boolean onFile(String serachItem){
        int position = findItem(serachItem);
        if (position >= 0){
            return true;
        }else{
            return false;
        }
    }
}
