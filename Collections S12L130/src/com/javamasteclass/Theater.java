package com.javamasteclass;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private final String theaterName;
    //private list of seat object.
    private List<Seat> seats = new ArrayList<Seat>();

    public Theater(String theaterName, int numberOfRows, int seatsPerRow) {
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

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
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
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat {
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
            if (!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel(){
            if (this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat: " + seatNumber + " is cancelled");
                return true;
            }else {
                return false;
            }
        }
    }
}

