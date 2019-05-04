package com.javamasteclass;

public  abstract class ListItem {
    //fields
    //to move forvard and bacwards.
    //A protected member (k) is accessible within all classes in the same package and within subclasses in other packages.
    protected ListItem leftLink;
    protected ListItem rightLink;
/**
 * Class {@code Object} is the root of the class hierarchy.
 * Every class has {@code Object} as a superclass. All objects,
 * including arrays, implement the methods of this class.
 * */
    protected Object value;

    //constructor.
    public ListItem(Object value) {
        this.value = value;
    }

    //methods to move and set.
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    //method for comparison
    abstract int compare(ListItem item);

    //Getters and setters
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
