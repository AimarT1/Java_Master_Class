package com.javamasteclass;

public class Main {

    public static void main(String[] args) {


        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        //Create a string data array to avoid loads of addItem instructions:
        //Basiclly created a string variable called "stringData" and gave it a value.

        //String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "5 3 2 4 7 0 8";

        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        list.removeItem(new Node("0"));
        list.traverse(list.getRoot());

        //Searchtree
        SearchTree tree = new SearchTree(null);


        String stringDataT = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] dataT = stringDataT.split(" ");
        for (String T : dataT) {
            tree.addItem(new Node(T));
        }
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("Darwin"));
        tree.traverse(tree.getRoot());
    }
}
