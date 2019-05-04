package com.javamasteclass;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    //buyers name
    private final String name;
    //Key is the stockItem, Value is the Quantity
    private final Map<StockItem,Integer> basketList;

    //Constructor

    public Basket(String name) {
        this.name = name;
        this.basketList = new HashMap<>();
    }

    public int addToBasket(StockItem item, int quantity){
        if ((item != null) && (quantity > 0)){
            //checking if the item is in the basket already. 0 if there vasent any item.
            int inBasket = basketList.getOrDefault(item,0);
            //adding the item + if its there we addit and additional quantity.
            basketList.put(item,inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    //Key is the stockItem, Value is the Quantity
    public  Map<StockItem,Integer> Items(){
        //retuns unchanged map aka readonly view. Of item in our basket.
        return Collections.unmodifiableMap(basketList);
    }

    @Override
    public String toString() {   //((basketList.size() == 1) ? " item" : " items."+"\n") added to check if many
        String s = "\nShopping basket " + name + " contains: " + basketList.size()+  ((basketList.size() == 1) ? " item" + "\n" : " items."+"\n");
        double totalCost = 0.0;
        //allthe entrys in shopping basket
        for (Map.Entry<StockItem,Integer> item: basketList.entrySet()){
            s = s + item.getKey().getName()+ " " + item.getKey().getPrice() + "€, " + item.getValue() + " is the quantity purchased.\n";
            //comeng from the stockitem
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost: " + totalCost + "€";
    }
}
