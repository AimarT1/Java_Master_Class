package com.javamasteclass;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    //fields

    //values that are constant are usually declared as static final.
    private final String theaterName;
    //Creating a List of Seat Class Objects called seats. = and we store them in an ArrayList[Seat- object]
    private List<Seat> seats = new ArrayList<Seat>();

    //Constructor
    //we added 2 addional variables/paramaters to constructor.
    public Theater(String theaterName, int numRows, int seatsPerRow) {
        this.theaterName = theaterName;

        //string quotes " " -will provide an error we use single quotes istead.
        //variable lastrow = string "A" + the number of seat -1 to calculate the last rownumber in that row.
        int lastRow = 'A' + (numRows -1);
        //loop will go thtogh all the row from A-Z and assing an number to it, depening how meny seatsPerRow we assign.
        for (char row = 'A'; row <= lastRow; row++){
            //new loop with varaible seatNum, we set it equal to 1 cause sounting starts from 1 no seat 0.
            //seatNum need to be less or equal to seatsPerRow, seatNum++ to increment throgh each seat in the row.
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                //We create a seat Object.The row we defined + formated seatnum to add a 0 infornt.
                Seat seat = new Seat(row + String.format("%02d",seatNum));
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
    //Brute force approce
    public boolean reserveSeat(String seatNumber){
        //creating a seatClass object called requestedSeat.
        Seat requestedSeat = null;
        //wor the loop we pass the pramater seat from the Seat object. It coes throug the seats ArrayList Objects.
        for (Seat seat : seats){
            //Prinline to see how many times it has to goe through the loop before it finds the seat.
            System.out.print(".");
            //if the object contains/ eguals to the number we search we pass it to the requestedSeat objects.
            if (seat.getSeatNumber().equals(seatNumber)){
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null){
            //there is no seat with given number
            System.out.println("There is no seat " + seatNumber);
            return false;
        } else {
            //if the seat is there then calle the reserve method from the Seat class object to make the reservation.
            return requestedSeat.reserve();
        }
    }
    //method to get all the seats
    public void getSeats(){
        //we go throgh the arrayList of seats.
        for (Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    //innerClass Seat
    private class Seat{
        //fields in inner class
        private final String seatNumber;
        private boolean reserved = false;

        //constructor
        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
            this.reserved = reserved;
        }
        //getter
        public String getSeatNumber() {
            return seatNumber;
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
