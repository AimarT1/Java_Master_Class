package com.javamasteclass;

public class Node extends ListItem {

    //constructor

    public Node(Object value) {
        super(value);
    }

    //overide methods

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftlink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftlink = item;
        return this.leftlink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null){
            return super.getValue().toString().compareTo(item.getValue().toString());
        } else {
            return -1;
        }
    }
}
