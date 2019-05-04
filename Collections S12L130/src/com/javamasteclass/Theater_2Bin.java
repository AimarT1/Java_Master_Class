package com.javamasteclass;

import java.util.*;

public class Theater_2Bin {
    private final String theaterName;
    //private list of seat object. - we now made it type collection
    //Collection is a public interface class.
    //for example - new HashSet<>(); - returns seats in random order.
    //More in detail: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
    private List<Seat> seats = new ArrayList<>();

    public Theater_2Bin(String theaterName, int numberOfRows, int seatsPerRow) {
        this.theaterName = theaterName;

        //we created avariable lastrow and set it equal to "'A' + (numberOfRows -1);"
        int lastRow = 'A' + (numberOfRows - 1);
        //now we created a loop and a new variable called row
        for (char row = 'A'; row <= lastRow; row++) {
            for (int searNum = 1; searNum <= seatsPerRow; searNum++) {
                Seat seat = new Seat(row + String.format("%02d", searNum));
                seats.add(seat);
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }


    //binaryserch is two 2 faster. First its check to wich have it belongs, and then its searches fro thta half.
    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        System.out.println(".");
        int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
        if (foundSeat >= 0){
            return seats.get(foundSeat).Reserved();
        }else {
            System.out.println("There is no seat " +seatNumber);
            return false;
        }
        /*
        for (Seat seat : seats) {
            System.out.println(".");
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        return requestedSeat.Reserved();
        */


        /*binarysearch source
        *  public boolean reserveSeat(String seatNumber) {
        *  int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
        sout(".")
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return seats.get(mid).reserve(); // key found
        }
         }
         sout("There is no seat " + seatNumber);
         return false;
        */
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
            this.reserved = reserved;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean Reserved() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat: " + seatNumber + " is cancelled");
                return true;
            } else {
                return false;
            }
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareTo(seat.getSeatNumber());
        }
    }
}
