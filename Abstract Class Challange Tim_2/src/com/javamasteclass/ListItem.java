package com.javamasteclass;

//base listItem class
public abstract class ListItem {

    //Creating instances of the same class with in the same class.
    // 2variables that hold referenses to type object ListItem.
    //to acesss them from our concrete sub class.
    protected ListItem rightLink;
    protected ListItem leftlink;

    protected Object value;

    //constructor. Every concrete class from this class needs a constructor that sets the value.
    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

