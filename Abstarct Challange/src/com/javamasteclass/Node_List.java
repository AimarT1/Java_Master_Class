package com.javamasteclass;

public interface Node_List {

    //methods for implementation
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeIten(ListItem item);
    void traverse(ListItem root);

}
