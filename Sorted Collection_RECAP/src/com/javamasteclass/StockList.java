package com.javamasteclass;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//StockList class to add the StockItems to a StockList
public class StockList {
    //Key value we pass a string, value is StockItem with its fields.
    private final Map<String, StockItem> stockList;

    public StockList() {
        //we set the stoclist Map<K,V> equal to a new HashMap.
        //Changed to linkedhashmap to have in alfabetical order.
        this.stockList = new LinkedHashMap<>();
    }

    //addStock adds the StockItems we create to the stockList.
    public int addToStockList(StockItem item) {
        if (item != null) {
            //Creaded an object instock = stockList.getOrDefault(item.getName(),item) - checks if its there already.
            StockItem inStock = stockList.getOrDefault(item.getName(), item);
            //Check if we have quantities of that item, if so adjust.
            if (inStock != item) {
                item.adjustStock(inStock.getQuantity());
            }
            // if it is equal to sarched item, adds the item to the stocklist
            stockList.put(item.getName(), item);
            return item.getQuantity();
        }
        //no stock movement.
        return 0;
    }

    public int sellStock(String item, int quantity) {
        //check stock - gets by name and set value to null if it does not exist.
        StockItem inStock = stockList.getOrDefault(item, null);
        //the item is there, inStockQuantity > 0  and passed quantity(how much we buy) > 0
        if ((inStock != null) && (inStock.getQuantity() >= 0) && (quantity > 0)) {
            //addjusts the current stock after we bought.
            inStock.adjustStock(-quantity);
            //return amount bought
            return quantity;
        }
        // stock unchaned nothing bought
        return 0;
    }

    public StockItem get(String key) {
        //retuns null if key not founds. key = String key field of object aka name paramater.
        return stockList.get(key);
    }

    public Map<String, StockItem> Items() {
        //retuns unchanged map aka readonly view.
        return Collections.unmodifiableMap(stockList);
    }

    //ToSting to return complete stockList.
    @Override
    public String toString() {
        String s = "\nStock List:\n";
        double totalCost = 0.0;
        //iterating throgh the entire StocklistMap
        for (Map.Entry<String, StockItem> item : stockList.entrySet()) {
            //return single item value in StockItem.
            StockItem stockItem = item.getValue();
            //retuns the prise of thet item multiplied by its quantity aka value of all thos item collecively.
            double itemValue = stockItem.getPrice() * stockItem.getQuantity();
           //prints the item + quantity + total value.
            s = s + stockItem + ". There are " + stockItem.getQuantity() + " in stock. Value of items: ";
            s = s + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;

        }
        //retuns total value of all the items in the stock.
        return s + "Total stock value: " + totalCost;
    }
}
