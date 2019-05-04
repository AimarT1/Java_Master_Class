package com.javamasteclass;

//contains the items for sale and the quanty of stock.
// /**Using the public interface class Comparable to compare objects.
//     * Compares this object with the specified object for order.  Returns a
//     * negative integer, zero, or a positive integer as this object is less
//     * than, equal to, or greater than the specified object.
public class StockItem implements Comparable<StockItem>{
    //fields
    private final String itemName;
    private double itemPrice;
    private int itemQuantityInStock;
    private int reserved;

    //constructor
    public StockItem(String itemName, double itemPrice, int itemQuantityInStock) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantityInStock = itemQuantityInStock;
        this.reserved = 0;
    }

    //Getters
    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantityInStock() {
        return itemQuantityInStock - reserved;
    }

    public int adjustStock(int quantity){
        //olemas olve +/- listav vähendatav
        int newQuantity = this.itemQuantityInStock + quantity;
        if (newQuantity >= 0){
            return this.itemQuantityInStock = newQuantity;
        } else {
            return 0;
        }
    }

    public int reserveItem(int quantity){
        //the amount you want to reserve
        if (quantity <= getItemQuantityInStock()){
            reserved = reserved + quantity;
            //return number of items reserved
            return quantity;
        } else {
            System.out.println("Cant reserve not enough in stock");
            return 0;
        }
    }

    public int unreserveItem(int quantity){
        //how many item to unreserve
        if (quantity <= reserved){
            reserved = reserved - quantity;
            //retun quantity still reserved
            return quantity;
        } else {
            return 0;
        }
    }

    public int finalizeResevedStock(int quantity){
        if (quantity <= reserved){
            reserved = reserved - quantity;
            //to set the stockQuantity correct afrer reserve complete.
            itemQuantityInStock = itemQuantityInStock - quantity;
            return quantity;
        } else {
            return 0;
        }
    }

    @Override
    public int compareTo(StockItem itemObj) {
       if (this == itemObj){
           return 0;
       }
       if (itemObj != null){
           return this.itemName.compareTo(itemObj.getItemName());
       }
       //if no object found return -1
       return -1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        //our equals is going to use the name filed object to compare.
        //First it accessis the StockItem class,
        // obj accesses the objects of that class,and we do the comparasion on the .getName() object.
        String objName = ((StockItem) obj).getItemName();
        return this.itemName.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.itemName.hashCode();
    }

    @Override
    public String toString() {
        return this.itemName + ", price: " + this.itemPrice + "€, reserved " + this.reserved + ".";
    }
}
