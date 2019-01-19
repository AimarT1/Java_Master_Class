package com.javamasteclass;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {

        //we created a linkedList and gave varible name places to visit.
        LinkedList<String> placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sidney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);
        System.out.println("*****");
        // adding an entry to element position 1, and the element in that position currently will be moved on to next position.
        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);
        System.out.println("*****");
        //removes the element in that position, and the element afther that (5) will move to its position and other to will move down.
        placesToVisit.remove(4);
        printList(placesToVisit);
    }
    //valu we accept as aprameter is LinkedList<String> with the paramter name linkedList.
    private static void printList(LinkedList<String> linkedList){
        //useing ITERATOR consept, equavalent to for loop.
        Iterator<String> i = linkedList.iterator();
        //while(=true) that element that is in this linked list is pointing to another entry/record.
        while (i.hasNext()){
            //.next moves to that next entry
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("==============");
    }
}
