package com.javamasteclass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();
      //moved here in part 3->
        addInorder(placesToVisit,"Sydney");
        addInorder(placesToVisit,"Melbourne");
        addInorder(placesToVisit,"Brisbane");
        addInorder(placesToVisit,"Perth");
        addInorder(placesToVisit,"Canberra");
        addInorder(placesToVisit,"Adelaode");
        addInorder(placesToVisit,"Darwin");
        printList(placesToVisit);
        addInorder(placesToVisit,"Alice Springs");
        addInorder(placesToVisit,"Darwin");
        printList(placesToVisit);
        visit(placesToVisit);

        //moved here in part 3<-|
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaode");
        placesToVisit.add("Darwin");


       // printList(placesToVisit);
        //adding element to index position 1. teh element in ts position moves forvard one position.
        placesToVisit.add(1,"Alice Springs");
       // printList(placesToVisit);
        //removing the element in position 4(4 = 5 since starts from 0)
        placesToVisit.remove(4);
       // printList(placesToVisit);
    }

    //void - to not return anything
    //we pass LinkedList as parameter named linkedList
    private static void printList(LinkedList<String> linkedList){
        //we are useing iterator to go through all entries in array/arraylist/linkedlist
        //equavalent to for loop
        Iterator<String> i = linkedList.iterator();
        //while there is atleast one more record in the list, w are going to show current record
        while (i.hasNext()){
            //i.next - equalent to i++, its moveing to annother entry
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============");
    }

    private static boolean addInorder(LinkedList<String> linkedList,String newCity){
        //ListIterator - gives more flwxibility than traditional iterator.
        //its  not automaticly pointing to the first entry. you need to use stringListIterator.next() to go to first entry.
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            //.next() - we are moving to the next record. .compareTo(newCity) - which is the city we are looking to insert.
            //it gives us a number
            int comparison = stringListIterator.next().compareTo(newCity);
            //equal , do not add, its already on the record
            if (comparison == 0){
                System.out.println(newCity + " is already included as destination.");
                return false;
                //new City should apear before this one.
                //exp Brisbane->Adelaide(as the new entry, it should go before Brisbane.)
            }else if (comparison > 0){
                //stringListIterator.previous(); - go back to previous match/record
                stringListIterator.previous();
                //goes back to previous and adds it to its place and the one moves one element forward.
                stringListIterator.add(newCity);
                return true;
            }else if (comparison < 0){
                //move on to next city
            }
        }
        //at the end if the while loop.
        stringListIterator.add(newCity);
        return true;
    }

    private static void  visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingforward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("No cities in the intenary: ");
            return;
        }else{
            System.out.println("Now visiting: " + listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingforward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingforward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list.");
                        goingforward = false;
                    }
                    break;
                case 2:
                    if (goingforward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingforward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting: " + listIterator.previous());
                    }else {
                        System.out.println("We are at the start of the list.");
                        goingforward = true;
                    }
                    break;

                case 3:
                    printMenu();


            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: ");
        System.out.println("0 - To guit.");
        System.out.println("1 - Next city.");
        System.out.println("2 - Previous city.");
        System.out.println("3 - Print menu options.");
    }
}
