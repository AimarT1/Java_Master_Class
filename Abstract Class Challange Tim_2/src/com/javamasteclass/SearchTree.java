package com.javamasteclass;

public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (root == null){
            //three was empty
            this.root = item;
            return true;
        }
        //otherwise start comaring fro the head of the three
        ListItem currentItem = this.root;
        while (currentItem != null){
            int compare = currentItem.compareTo(item);
            //new item is greater move right if possible
            if (compare < 0){
                if (currentItem.next() != null){
                currentItem = currentItem.next();
            } else {
                //theres no node to the right sa add at this point
                currentItem.setNext(item);
                return true;
            }
        } else if (compare > 0) {
                if (currentItem.previous() != null){
                    currentItem = currentItem.previous();
                }else {
                    //theres no node to the left so add at this point
                    currentItem.setPrevious(item);
                    return true;
                }
            }else {
                //equal
                System.out.println(item.getValue() + " no dublicates!");
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null){
            System.out.println("Deleting: " + item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null){
            int compare = (currentItem.compareTo(item));
            if (compare < 0 ){
                parentItem = currentItem;
                currentItem = currentItem.next();
            }else if (compare > 0){
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }else {
                //equal we found the item so remove it
                preformeRemoval(currentItem,parentItem);
                return true;
            }
        }
        return false;
    }

    private void preformeRemoval(ListItem item,ListItem parent){

        // remove item from the tree
        if (item.next() == null) {
            // no right tree, so make parent point to left tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.previous());
            } else {
                // parent must be item, which means we were looking at the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            // no left tree, so make parent point to right tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.next());
            } else {
                // again, we are deleting the root
                this.root = item.next();
            }
        } else {
            // neither left nor right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value (i.e., the leftmost).
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            // Now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            // and delete the smallest
            if (leftmostParent == item) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                item.setNext(current.next());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null).
                leftmostParent.setPrevious(current.next());
            }
        }
    }


    @Override
    public void tranverse(ListItem root) {
        //recrusive
        if (root != null){
            tranverse(root.previous());
            System.out.println(root.getValue());
            tranverse(root.next());
        }
    }
}
