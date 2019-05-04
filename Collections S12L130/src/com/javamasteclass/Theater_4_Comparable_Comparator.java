package com.javamasteclass;

import java.util.*;

public class Theater_4_Comparable_Comparator {
    private final String theaterName;
    private List<Seat> seats = new ArrayList<>();
    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    public Theater_4_Comparable_Comparator(String theaterName, int numberOfRows, int seatsPerRow) {
        this.theaterName = theaterName;

        //we created avariable lastrow and set it equal to "'A' + (numberOfRows -1);"
        int lastRow = 'A' + (numberOfRows - 1);
        //now we created a loop and a new variable called row
        for (char row = 'A'; row <= lastRow; row++) {
            for (int searNum = 1; searNum <= seatsPerRow; searNum++) {
                double price = 12.00;
                if ((row < 'D') && (searNum >= 4 && searNum <= 9)){
                    price = 14.00;
                } else if ((row > 'F') || (searNum < 4 && searNum > 9)){
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", searNum),price);
                seats.add(seat);
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    //binaryserch is two 2 faster. First its check to wich have it belongs, and then its searches fro thta half.
    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber,0);
        System.out.println(".");
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).Reserved();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }
    public Collection<Seat> getSeats() {
        return seats;
    }


    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber,double price) {
            this.seatNumber = seatNumber;
            this.reserved = reserved;
            this.price = price;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
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
