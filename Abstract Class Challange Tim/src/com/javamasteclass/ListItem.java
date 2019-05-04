package com.javamasteclass;

public abstract class ListItem {

    //Fields

    //protected - cause we need to acsess it outside the concrete sub class
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    //constructor
    public ListItem(Object value) {
        this.value = value;
    }

    //abstract methods

    //next() -return a reference item to the next item in the list
    abstract ListItem next();
    //setNext(ListItem item)) - sets the reference to the next item to refer to, in the pramater.
    abstract ListItem setNext(ListItem item);
    //previous() - sets the refference to the previous item in the list
    abstract ListItem previous();
    //setPrevious(ListItem item); - sets the reference to the previous item to refer to, in the pramater.
    abstract ListItem setPrevious(ListItem item);

    //compares the object to the item what ever is passed to the parameter
    abstract int compareTo(ListItem item);

    //getters and setters
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
