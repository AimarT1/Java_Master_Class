package com.javamasteclass;

//contains the items for sale and the quanty of stock.
// /**Using the public interface class Comparable to compare objects.
//     * Compares this object with the specified object for order.  Returns a
//     * negative integer, zero, or a positive integer as this object is less
//     * than, equal to, or greater than the specified object.
public class StockItem implements Comparable<StockItem>{
    //fields
    private final String name;
    private double price;
    private int quantity;

    //Constructors
    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    //Overloaded constructor. (useful is list is passed on to the warehouse..)
    public StockItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Getters and setters

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //if its less it doesnt accept it.
    public void setPrice(double price) {
        if (price > 0.0){
            this.price = price;
        }
    }

    //method to adjust aka setQuantity
    public void adjustStock(int quantity) {
        //variable newQuantity = olemas olev + (added or decreased)
        int newQuantity = this.quantity + quantity;
        if (newQuantity >= 0){
            this.quantity = newQuantity;
        }
        //if its less, cant addjust it.
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering stockItem.equals");
        //same instance of the object.
        if (this == obj){
            return true;
        }
        //comparing that object is there and not null. They have to be in equal class instance.
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        //our equals is going to use the name filed object to compare.
//First it accessis the StockItem class, obj accesses the objects of that class,and we do the comparasion on the .getName() object.
        String objName = ((StockItem) obj).getName();
        //we return this.name.equals(objName)
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        //added a random number to hash ceck.
        return this.name.hashCode() + 32;
    }

    @Override
    public int compareTo(StockItem obj) {
        System.out.println("Entering stockItem.compareTo");
        //same instance of the object in memory.
        if (this == obj){
            return 0;
        }
        //we have to check for null
        if (obj != null){
            //stockItemName. the name that has been passed to this method. returns (-1,0,1).
            return this.name.compareTo(obj.getName());
        }
        /* Thrown when an application attempts to use {@code null} in a
         * case where an object is required.*/// aka not comparing something that is null.
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + ": price " + this.price;
    }
}
