package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
	MyLinkedList myLinkedList = new MyLinkedList(null);
	myLinkedList.traverse(myLinkedList.getRoot());

        //Create a string data array to avoid loads of addItem instructions:
        //Basiclly created a string variable called "stringData" and gave it a value.

        //String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "1 2 3 4 5 6 7 8 9 ";

        String[] data = stringData.split(" ");

        /*for (int i = 1; i <= data.length; i++){
            myLinkedList.addItem(new Node_Concrete(i));
        }*/ //equal to below, but the below one is more flexible.

        for (String i : data) {
            myLinkedList.addItem(new Node_Concrete(i));
        }
        myLinkedList.traverse(myLinkedList.getRoot());
        myLinkedList.removeIten(new Node_Concrete("9"));
        myLinkedList.traverse(myLinkedList.getRoot());
    }
}
