package com.javamasteclass;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

//StockList class to add the StockItems to a StockList
public class StockList {
    //Key value we pass a string, value is StockItem with its fields.
    private final Map<String,StockItem> stockList;

    //Constructor
    public StockList() {
        this.stockList = new LinkedHashMap<>();
    }

    //Getter for stockList
    public Map<String, StockItem> getStockList() {
        //retuns unchanged map aka readonly view.
        return Collections.unmodifiableMap(stockList);
    }

    //method to add items to stocklist
    public int addToStockList(StockItem item){
        //item has correct values
        if (item != null){
            //searces with maps key and value fields. Gets the item if it already exists or the one thats been passed.
            StockItem findStockItem = stockList.getOrDefault(item.getItemName(),item);
            //is the item already in our map and same ass passed and if there is already stock on this item.
            if (findStockItem != item){
                //adjust the object quantity if its already in the map
                //if it existed in the map prior to the call of add stock, then only update the items quantity.
                item.adjustStock(findStockItem.getItemQuantityInStock());
            }
            stockList.put(item.getItemName(),item);
            return item.getItemQuantityInStock();
        } else {
            System.out.println("Item to add not found, no such stock item available");
            return 0;
        }
    }

    public int sellStock(String itemName, int itemQuantity){
        //searceing if the item is instock = from the stocklist.
        StockItem isInStock = stockList.get(itemName);
        //if it found the item and quantity > 0
        if (isInStock != null && itemQuantity > 0){
            //return aka finalize the sale calling the finalise method in StockitemClass and pass the quantity to buy.
            return isInStock.finalizeResevedStock(itemQuantity);
        } else {
            return 0;
        }
    }

    public int reserveStock(String itemName,int itemQuantity){
        //searceing if the item is instock = from the stocklist.
        StockItem isInStock = stockList.get(itemName);
        //the reserveItem() method in the StockItem class deals withe the stockQuantity vs wanted quantity.
        if (isInStock != null && itemQuantity > 0){
            return isInStock.reserveItem(itemQuantity);
        } else {
            return 0;
        }
    }

    public int unreserveStock(String itemName,int itemQuantity){
        //searceing if the item is instock = from the stocklist.
        StockItem isInStock = stockList.get(itemName);
        //the reserveItem() method in the StockItem class deals withe the stockQuantity vs wanted quantity.
        if (isInStock != null && itemQuantity > 0){
            return isInStock.unreserveItem(itemQuantity);
        } else {
            return 0;
        }
    }

    //method to find the item to add to the basket, by name.
    public StockItem findItem(String itemKey){
        //return the name/key value we want to add.
        return stockList.get(itemKey);
    }


    //To string to return us the product name, price, quantity and total value of items collection.
    //and total value of all the stock we have.
    @Override
    public String toString() {
        String print = "\nStock List:\n";
        double TotalCost = 0.0;
        //iterating throgh the entire StocklistMap
        /*A map entry (key-value pair).  The {@code Map.entrySet} method returns
         * a collection-view of the map, whose elements are of this class.  The
         * <i>only</i> way to obtain a reference to a map entry is from the
         * iterator of this collection-view. */
        for (Map.Entry<String,StockItem> items : stockList.entrySet()){
            /*Replaces the value corresponding to this entry with the specified
             * value(Writes through to the map.)*/
            // items.getValue(); - return the toString method value from the StockItem class. also all the other values of objects.
            StockItem stockItems = items.getValue();
            //retuns the prise of the item multiplied by its quantity aka value of all thos item collecively.
            double itemValue = stockItems.getItemPrice() * stockItems.getItemQuantityInStock();

            //Since the print is inside the loop we need to assinge print to print,TO print all the elements in loop.
            print = print + stockItems + " Total quanity in stock: " + stockItems.getItemQuantityInStock()
                    //every time it loops throgh we need a new line to ptint on ""\n""
                    + " Total value of items: " + String.format("%.2f", itemValue) + "€." + "\n";
            TotalCost = TotalCost + itemValue;

        }
        //returns all the print loops after that return the  last part once.
        return print + "Total Stocke value: " + TotalCost +"€";
    }
}
