package com.javamasteclass;

//List inerface, ArrayList and Linked List: classes form part of the Java Collections framework.
// This framework also includes sets maps,trees and ques. At the toplevel of the collections framework is the collections class:
//.. this exposes static methods that operate on collections: sort(), the also return collections Objects such as the list method.
//Interfaces in the collections frame fowk allow the framework to be extended and define methods to allfundamental operations.

//jdk provides a range of polymorphic algoridms that work on collections Objects, Objects that implement the collections interface.
//the provide reusable functionality.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//SeatBooking
public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater("Vanemuine", 8, 12);
        theater.getSeats();

        //reserving a seat.
        if (theater.reserveSeat("H11")) {
            System.out.println("Please pay.");
        } else {
            System.out.println("Seat is taken");
        }

        if (theater.reserveSeat("H11")) {
            System.out.println("Please pay.");
        } else {
            System.out.println("Sorry, seat is taken");
        }


        System.out.println("===================================");
        //Theather with Binary

        Theather_Binary theatherBinary = new Theather_Binary("Binary", 8, 12);

        //reserving a seat.
        if (theatherBinary.reserveSeat("H11")) {
            System.out.println("Please pay.");
        } else {
            System.out.println("Seat is taken");
        }

        if (theatherBinary.reserveSeat("H11")) {
            System.out.println("Please pay.");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        //Deleted the Reverse seat instances.
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        //Comparable And Comparator
        //new intsce of the class
        Theater_ComparableAndComparator theaterComparableAndComparator = new Theater_ComparableAndComparator(
                "Comparable And Comparator", 8, 12);

        if (theaterComparableAndComparator.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat is taken.");
        }

        if (theaterComparableAndComparator.reserveSeat("B12")){
            System.out.println("Please pay for B12");
        } else {
            System.out.println("Seat already reserved, sorry");
        }

        if (theaterComparableAndComparator.reserveSeat("B13")){
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved, sorry");
        }
        //we create a new instance of the theather seats list as a arrayList and pass the Previous Class instance as a paramter
        //.getSeats.
        List<Theater_ComparableAndComparator.Seat> reverseSeat = new ArrayList<>(theaterComparableAndComparator.getSeats());
        //now we call the Collections Classes reverse method and pass the created list object.
        // returns list of seats with prices in reverse order
        Collections.reverse(reverseSeat);
        printList(reverseSeat);

        List<Theater_ComparableAndComparator.Seat> priceSeat = new ArrayList<>(theaterComparableAndComparator.getSeats());
        Collections.reverse(priceSeat);
        //adding anew seat to the arraylist
        priceSeat.add(theaterComparableAndComparator.new Seat("B00",13.00));
        priceSeat.add(theaterComparableAndComparator.new Seat("A00",13.00));
        Collections.sort(priceSeat,Theater_ComparableAndComparator.PRICE_ORDER);
        printList(priceSeat);
    }

    //Passing the List<Theatre_Reverse.Seat> as pramater we call it list.
    public static void printList(List<Theater_ComparableAndComparator.Seat> list) {
        for (Theater_ComparableAndComparator.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("============");
    }
}
