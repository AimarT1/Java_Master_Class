package com.javamasteclass;

public class MyLinkedList implements Node_List {
    //main element of list. the head.
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        //return the root value.
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (root == null) {
            //the list was empty so this becomes the head of the list
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int coparision = (currentItem.compare(newItem));
            if (coparision < 0){
                //newItem is greater, move right if possible
                if (currentItem.next() != null){
                    currentItem = currentItem.next();
                }else {
                //there is no next, so insert at the end of list
                currentItem.setNext(newItem).setPrevious(currentItem);
                return true;
            }
                //new item is less, inser before
            }else if (coparision > 0){
                if (currentItem.previous() != null){
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                }else{
                    //the node with previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }
            else {
                //equal
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }
    @Override
    public boolean removeIten(ListItem item) {
        if (item != null){
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int compare = currentItem.compare(item);
            if (compare == 0){
                if (currentItem == this.root){
                    this.root = currentItem.next();
                }else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null){
                        currentItem.setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if (compare < 0){
                currentItem = currentItem.next();
            }else {
                return false;
            }
        }
        //we reached the end of the list withput finding the item to delete.
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null){
            System.out.println("The list is empty");
        }else {
            while (root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
