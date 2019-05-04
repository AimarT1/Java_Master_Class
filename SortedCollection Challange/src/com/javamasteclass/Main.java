package com.javamasteclass;

//Veriant of HashMpa and HashSet classes called, LinkedHashSet, LinkedHashMap. Collections Treemap and treeSet.
//LinkedHashSet, LinkedHashMap has order in it.

import java.util.Map;

public class Main {

    //Creating a stockList instance
    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        //Creating a stockItem instance
        StockItem item = new StockItem("Snus",5,100);
        stockList.addToStockList(item);

        item = new StockItem("Coca-Cola",0.90,100);
        stockList.addToStockList(item);

        item = new StockItem("Bread",0.79,50);
        stockList.addToStockList(item);

        item = new StockItem("Cheese", 2.49,35);
        stockList.addToStockList(item);

        item = new StockItem("Chips",1.24,200);
        stockList.addToStockList(item);

        item = new StockItem("Nuggets",1.68,40);
        stockList.addToStockList(item);

        item = new StockItem("Juice",1.49,300);
        stockList.addToStockList(item);

        item = new StockItem("Chocolate",1.09,500);
        stockList.addToStockList(item);

        item = new StockItem("MeatBalls",2.39,40);
        stockList.addToStockList(item);

        item = new StockItem("Joghurt",1.25,50);
        stockList.addToStockList(item);

        item = new StockItem("Salad",0.69,120);
        stockList.addToStockList(item);

        //To print items in StockList
        for (String s : stockList.getStockList().keySet()){
            System.out.println(s);
        }
        System.out.println("=====================");

        //to print all valeus of items in stocklList
        System.out.println(stockList);

        //To check if it updates the same item corectly, price can be overwritten
        item = new StockItem("MeatBalls",2.39,20);
        stockList.addToStockList(item);
        System.out.println(stockList);

        //Creating a new instance of Basket
        Basket basket = new Basket("My regular foods");
        addItemToBasket(basket,"Snus",20);
        addItemToBasket(basket,"Bread",2);
        addItemToBasket(basket,"Cheese",1);
        addItemToBasket(basket,"Chips",2);
        addItemToBasket(basket,"Juice",3);
        addItemToBasket(basket,"Nuggets",2);
        addItemToBasket(basket,"Chocolate",2);
        addItemToBasket(basket,"Salad",5);
        System.out.println(basket);
        //stocklist before checkout
        System.out.println(stockList);
        checkOut(basket);
        //stocklist after checkout
        System.out.println(stockList);
        System.out.println("========================");

        //New basket to check remove method
        Basket basketR = new Basket("My regular foods");
        addItemToBasket(basketR,"Snus",20);
        addItemToBasket(basketR,"Coca-Cola",2);
        System.out.println(basketR);
        System.out.println(stockList);
        //check for unnadded items
        addItemToBasket(basketR,"Lays",2);
        removeItemFromBasket(basketR,"Milk",1);

        removeItemFromBasket(basketR,"Snus",20);
        System.out.println(basketR);
        System.out.println(stockList);
        checkOut(basketR);
        System.out.println(stockList);

    }

    public static int addItemToBasket(Basket basket,String item, int quantity){
        //searcing for item we want to add
        StockItem itemToAdd = stockList.findItem(item);
        if (itemToAdd == null){
            System.out.println("Item: "+ item + " is not in the StockList of items.");
            return 0;
        }
        //if not null add to basket, stockItem the item we searced, and how many we want.
        if (stockList.reserveStock(item,quantity) != 0){
            return basket.addToBasket(itemToAdd,quantity);
        }
        //no stock to sell
        return 0;
    }
    //method to checkout the basket.
    public static void checkOut(Basket basket){
        for (Map.Entry<StockItem,Integer> items : basket.getBasketList().entrySet()){
            stockList.sellStock(items.getKey().getItemName(),items.getValue());
        }
        basket.clearBasket();
    }

    //method to remove item or items quantities
    public static int removeItemFromBasket(Basket basket,String item,int quantity){
        StockItem itemToRemove = stockList.findItem(item);
        if (itemToRemove == null){
            System.out.println("Item with the name: " + item + " is not, in your basket! ");
            return 0;
        }
        if (stockList.unreserveStock(item,quantity) != 0){
            return basket.removeFromBasket(itemToRemove,quantity);
        }
        return 0;
    }
}
