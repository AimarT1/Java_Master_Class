package com.javamasteclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater("Vanemuine",8,12);
        //theater.getSeats();

        if (theater.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken. ");
        }
        if (theater.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken. ");
        }

        System.out.println("***************");

        Theater_2Bin theater_2Bin = new Theater_2Bin("Olympian",6,6);
        //theater_2Bin.getSeats();

        if (theater_2Bin.reserveSeat("F01")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken. ");
        }
        if (theater_2Bin.reserveSeat("F01")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken. ");
        }
        System.out.println("*********");

        Theater_3_Reverse theater_3_reverse = new Theater_3_Reverse("Columbus",10,13);
        printList(theater_3_reverse.seats);

        //shallow copy tims
        List<Theater_3_Reverse.Seat> seatCopy = new ArrayList<>(theater_3_reverse.seats);
        printList(seatCopy);

        seatCopy.get(1).Reserved();
        if (theater_3_reverse.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        //reverse is order of any list.
        Collections.reverse(seatCopy);
        //returns random order
        Collections.shuffle(seatCopy);
        System.out.println("Print seatCopy");
        printList(seatCopy);
        System.out.println("Printing theter.seats");
        printList(theater_3_reverse.seats);

        //return minimum and maximum number name of seat elements
        Theater_3_Reverse.Seat minSeat = Collections.min(seatCopy);
        Theater_3_Reverse.Seat maxSeat = Collections.max(seatCopy);
        System.out.println(minSeat.getSeatNumber() + " <min || max> " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("sorted copy");
        printList(seatCopy);

        System.out.println("===============================");
        System.out.println("PART 4");
        System.out.println("===============================");

Theater_4_Comparable_Comparator theater_4 = new Theater_4_Comparable_Comparator("Junk",8,12);

        if (theater_4.reserveSeat("D12")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken. ");
        }
        if (theater_4.reserveSeat("B13")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken. ");
        }

        List<Theater_4_Comparable_Comparator.Seat> reverse = new ArrayList<>(theater_4.getSeats());
        Collections.reverse(reverse);
        printList4(reverse);

        List<Theater_4_Comparable_Comparator.Seat> priceSeats = new ArrayList<>(theater_4.getSeats());
        priceSeats.add(theater_4.new Seat("B00",13.00));
        priceSeats.add(theater_4.new Seat("A00",13.00));
        Collections.sort(priceSeats,Theater_4_Comparable_Comparator.PRICE_ORDER);
        printList4(priceSeats);




    }
    public static void printList4(List<Theater_4_Comparable_Comparator.Seat> list){
        for (Theater_4_Comparable_Comparator.Seat seat : list){
            System.out.println(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("======================");
    }

    public static void printList(List<Theater_3_Reverse.Seat> list){
        for (Theater_3_Reverse.Seat seat : list){
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("======================");
    }

    public static void sortList(List<? extends Theater_3_Reverse.Seat> list){
        for (int i = 0; i < list.size() -1; i++){
            for (int j = i+1; j < list.size(); j++){
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }
}
