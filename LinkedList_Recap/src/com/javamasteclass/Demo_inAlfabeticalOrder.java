package com.javamasteclass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo_inAlfabeticalOrder {
    public static void main(String[] args) {

        //we created a linkedList and gave varible name places to visit.
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit,"Sidney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        System.out.println("*****");
        // adding an entry to element position 1, and the element in that position currently will be moved on to next position.
        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        System.out.println("*****");
        //removes the element in that position, and the element afther that (5) will move to its position and other to will move down.
        placesToVisit.remove(4);
        printList(placesToVisit);

        //calling the visit method, passing the pramater LinkedList placesc to visit,
        visit(placesToVisit);
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

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        //listIterator gives more flexibilty then regulat iterator.
        //will go to the first entry in the linkedlist
        ListIterator<String> stringListIterator = linkedList.listIterator();
        //with while we are going throgh all entris in this stringListIterator.
        while (stringListIterator.hasNext()){
            //it gives us a number int value, if they match we dont want to add it again.
            int comparason = stringListIterator.next().compareTo(newCity);
            if (comparason == 0){
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else {
                //new city sould appera before this
                //Brisbane -> Adelaide
                if (comparason > 0){
                    //if Brisbane is before addelaide than, .previos will go back to Brisbane and will add Adelaide to its place,
                    stringListIterator.previous();
                    //useing .add to add with prameter (newCity)
                    //listIterator enables us to do it !!!
                    stringListIterator.add(newCity);
                    return true;
                } else if (comparason < 0){
                    //move on to next city
                }
            }
        }
        //after while loop ends.
        stringListIterator.add(newCity);
        return true;
    }
    //method with menu to visti.
    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        //listIterator gives more flexibilty then regulat iterator.
        //will go to the first entry in the linkedlist
        ListIterator<String> listIterator = cities.listIterator();
        //to check if there is no cities.
        //first check
        if (cities.isEmpty()){
            System.out.println("No cities in the intenerary.");
            return;
        }else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;
                case 1:
                    //adding acheck going forward, that we can go forward, if there is an entry we can go forward to,
                    // we set it to go there, yhat sets us up to go in the right direction.That the following code works.
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else {
                        System.out.println("Reached the end of the list.");
                        //setting going forward to false, we reached the end of the list.
                        goingForward = false;
                    }
                    break;
                case 2:
                    //adding check going forward, to go the right direction.
                    //if we were going forward previosly, and now want to go backward, we check if there is a record to go back to.
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        //setting goingforward to false. cause we want to move back.
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }else {
                        System.out.println("We are at the start of the list.");
                        //setting going forward to true, we are at the start of the list.
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("0 - Vacation over.Quit.");
        System.out.println("1 - Next city.");
        System.out.println("2 - Previous city.");
    }
}
