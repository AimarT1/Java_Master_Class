package com.javamasteclass;

//Veriant of HashMpa and HashSet classes called, LinkedHashSet, LinkedHashMap. Collections Treemap and treeSet.
//LinkedHashSet, LinkedHashMap has order in it.

import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        //creating new instances of Stockitems.
        StockItem item = new StockItem("Bread",0.86,100);
        //adding the created items to The StockList
        stockList.addToStockList(item);

        item = new StockItem("Cake",1.0,7);
        stockList.addToStockList(item);

        item = new StockItem("Car-mini", 12.50, 2);
        stockList.addToStockList(item);

        item = new StockItem("Chair", 62.0, 10);
        stockList.addToStockList(item);

        item = new StockItem("Cup", 0.50, 200);
        stockList.addToStockList(item);

        //added extra cup
        item = new StockItem("Cup", 0.45, 7);
        stockList.addToStockList(item);
        //with different price

        item = new StockItem("Door", 72.95, 4);
        stockList.addToStockList(item);

        item = new StockItem("Juice", 2.50, 36);
        stockList.addToStockList(item);

        item = new StockItem("Phone", 96.99, 35);
        stockList.addToStockList(item);

        item = new StockItem("Towel", 2.40, 80);
        stockList.addToStockList(item);

        item = new StockItem("Vase", 8.76, 40);
        stockList.addToStockList(item);

        System.out.println(stockList);

        //loop to print items.
        for (String s : stockList.Items().keySet()){
            System.out.println(s);
        }
        //Creating a basket.
        Basket basket = new Basket("Aimar");
        sellItem(basket,"Towel",2);
        System.out.println(basket);

        sellItem(basket,"Phone",1);
        sellItem(basket,"Juice",2);
        sellItem(basket,"Cup",2);
        sellItem(basket,"Bread",2);
        sellItem(basket,"Cake",1);
        sellItem(basket,"Snus",10);
        System.out.println(basket);
        System.out.println(stockList);

    }

    public static int sellItem(Basket basket,String item,int quantity){
        //retrive the item from stockList, remember String is the key value to check.
        StockItem stockItem = stockList.get(item);
        if (stockItem == null){
            System.out.println("We dont sell: " + item);
            return 0;
        }
        //if not null add to basket, stockItem the item we searced, and how many we want.
        if (stockList.sellStock(item,quantity) != 0){
            basket.addToBasket(stockItem,quantity);
            //aka items sold
            return quantity;
        }
        //no stock to sell
        return 0;
    }
}
