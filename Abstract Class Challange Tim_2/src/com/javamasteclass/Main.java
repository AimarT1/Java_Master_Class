package com.javamasteclass;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.tranverse(list.getRoot());

        String Stringdata = "Nigga Percy WhiteBoy Chocolate YellowBone BigChuck Chicken Sause Stub Dopamine Crypto";

        String[] data = Stringdata.split(" ");
        for (String i : data){
            //System.out.println(i);
            list.addItem(new Node(i));
        }
        //outside the loop !
        list.tranverse(list.getRoot());
        System.out.println("********");
        list.removeItem(new Node("Nigga"));
        list.tranverse(list.getRoot());


        //searchtree
        SearchTree searchTree = new SearchTree(null);
        searchTree.tranverse(searchTree.getRoot());
        String dataS = "1 2 3 4 5 6 7 8 9";
        String[] dataT = dataS.split(" ");
        for (String t : dataT){
            //System.out.println(i);
            searchTree.addItem(new Node(t));
        }
        searchTree.tranverse(searchTree.getRoot());
        searchTree.removeItem(new Node(3));
        searchTree.tranverse(searchTree.getRoot());
    }
}
