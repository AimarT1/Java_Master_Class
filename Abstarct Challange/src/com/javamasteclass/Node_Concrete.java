package com.javamasteclass;

public class Node_Concrete extends ListItem {
    //constructor
    public Node_Concrete(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compare(ListItem item) {
        if (item != null){
            return super.getValue().toString().compareTo(item.getValue().toString());
        }else {
            return -1;
        }
    }
}
