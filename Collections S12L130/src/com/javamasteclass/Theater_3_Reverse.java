package com.javamasteclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theater_3_Reverse {
    private final String theaterName;
    public List<Seat> seats = new ArrayList<>();

    public Theater_3_Reverse(String theaterName, int numberOfRows, int seatsPerRow) {
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
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).Reserved();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }
    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }


    public class Seat implements Comparable<Seat>{
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
