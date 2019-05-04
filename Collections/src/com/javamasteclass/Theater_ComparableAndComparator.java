package com.javamasteclass;

import java.util.*;

public class Theater_ComparableAndComparator {
    //fields
    //values that are constant are usually declared as static final.
    private final String theaterName;
    private List<Seat> seats = new ArrayList<>();

    //Created an annonomus inner class called(implementing comparator) static final Comparator
    // <Seat[we passsed seat Class as the object]> PRICE_ORDER[field name] = new Comparator<Seat>()
    //Passing a Comparator interface type(generic). It can be created and allow objects to be sorted.
    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        //creates a override method to sort by price.
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if (seat1.getPrice() < seat2.getPrice()){
                return -1;
            } else if (seat1.getPrice() > seat2.getPrice()){
                return 1;
            }else {
                return 0;
            }
        }
    }; //need colon to finish of the definition !

    //Constructor
    //we added 2 addional variables/paramaters to constructor.
    public Theater_ComparableAndComparator(String theaterName, int numRows, int seatsPerRow) {
        this.theaterName = theaterName;

        //string quotes " " -will provide an error we use single quotes istead.
        //variable lastrow = string "A" + the number of seat -1 to calculate the last rownumber in that row.
        int lastRow = 'A' + (numRows -1);
        //loop will go thtogh all the row from A-Z and assing an number to it, depening how meny seatsPerRow we assign.
        for (char row = 'A'; row <= lastRow; row++){
            //new loop with varaible seatNum, we set it equal to 1 cause sounting starts from 1 no seat 0.
            //seatNum need to be less or equal to seatsPerRow, seatNum++ to increment throgh each seat in the row.
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                //added price to the constructor and checks to it depending on the seat position.
                double price = 12.00;
                if ((row < 'D') && seatNum >= 4 && seatNum <= 9 ){
                    price = 14.00;
                } else if ((row > 'F') || (seatNum < 4 || seatNum > 9) ){
                    price = 7.00;
                }
                //We create a seat Object.The row we defined + formated seatnum to add a 0 infornt and price.
                Seat seat = new Seat(row + String.format("%02d",seatNum),price);
                //now we add the new seatobject to the seats  arrayList.
                seats.add(seat);
            }
        }
    }

    //Getter
    public String getTheaterName() {
        return theaterName;
    }

    //methods
    public boolean reserveSeat(String seatNumber) {
        //creating a seatClass object called requestedSeat.
        Seat requestedSeat = new Seat(seatNumber,0);
        //This is now going to use the comparable interface and use the method that we implemented,
        // to check using the String CompareTo operator, method to do the comparason.
        //it reduces the search to half and will check the half that contains the seat.
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            //arrayList of seats.get(), pass the variable foundseat. reserve() method.
            return seats.get(foundSeat).reserve();
        } else {
            //seat not found
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        //deleted the unnessasary code.
    }

    //method to get all the seats. [we use public interface class Collections here]
    public Collection<Seat> getSeats(){
        return seats;
    }

    //innerClass Seat
    public class Seat implements Comparable<Seat>{
        //fields in inner class
        private final String seatNumber;
        //added a price field
        private double price;
        private boolean reserved = false;

        //constructor
        public Seat(String seatNumber,double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }
        //getter
        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

        //Overide method from public interface class
        @Override
        public int compareTo(Seat seat) {
            //now we have a comparason that fullfils the interface and we can use a different type of set for our searching of seatnumber.
            //compareToIgnoreCase - * Tests if two string regions are equal.
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        //method to reserve
        public boolean reserve(){
            //if seat is not reserved aka = false
            if (!this.reserved){
                //we set it to true and reserve it
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        //method to cancel
        public boolean cancel(){
            //if seat is reserved
            if (this.reserved){
                //we cancel and print message.
                this.reserved = false;
                System.out.println("Reservation of seat: " + seatNumber + " is cancelled");
                return true;
            } else {
                //seat wasnt reserved.
                return false;
            }
        }
    }
}
