package com.javamasteclass;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private String name;
    //Key is the stockItem, Value is the Quantity
    private final Map<StockItem,Integer> basketList;

    //constructor
    public Basket(String name) {
        this.name = name;
        this.basketList = new HashMap<>();
    }

    //methods to additems, remove, and clear
    public int addToBasket(StockItem item, int quantity){
        if (item != null && quantity > 0){
            //check if we have the item already in the basket.Value is 0 if there is no previous
            int inBasket = basketList.getOrDefault(item,0);
            //adding the item, "inBasket" will default ot 0 if no previous entry.'
            // Adding + quantity if previous exist and we add more of the same items.
            basketList.put(item,inBasket + quantity);
            return inBasket;
        } else {
            return 0;
        }
    }

    //method to remove item form basket after initiali adding
    public int removeFromBasket(StockItem item, int quantity){
        if (item != null && quantity > 0){
            int inBasket = basketList.getOrDefault(item,0);
            int newQuantity = inBasket - quantity;
            //if newQuantity is > 0 then stays at the basket.
           if (newQuantity > 0){
               basketList.put(item,newQuantity);
               return newQuantity;
           } else if (newQuantity == 0){
               basketList.remove(item);
               System.out.println(item.getItemName() + " removed from basket.");
               return 0;
           }
        }
        return 0;
    }

    //method to clear the basket after checkout
    public void clearBasket() {
        basketList.clear();
    }

    //getter for the basketList
    public Map<StockItem, Integer> getBasketList() {
        return Collections.unmodifiableMap(basketList);
    }

    @Override
    public String toString() {
        String print = "\nBasket Contains: " + basketList.size() + " items. As follows: \n";
        double TotalCost = 0.0;
        //Key is the stockItem, Value is the Quantity as decleard on the field
        for (Map.Entry<StockItem,Integer> itemsInBasket : basketList.entrySet()){
            //to print all the items in the list on new line.
            print = print + itemsInBasket.getKey().getItemName() + " " + itemsInBasket.getKey().getItemPrice()+ "€ "
                    //getValue -  return the amount of items added to basket.
                    + itemsInBasket.getValue() + " is the quantity selected.\n";

            TotalCost = TotalCost + itemsInBasket.getKey().getItemPrice() * itemsInBasket.getValue();
        }
        return print + "Total cost of your basket: " + TotalCost + "€.";
    }
}
