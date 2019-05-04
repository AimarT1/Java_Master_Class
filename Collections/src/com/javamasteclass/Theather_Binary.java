package com.javamasteclass;

import java.util.*;

public class Theather_Binary {
    //fields

    //values that are constant are usually declared as static final.
    private final String theaterName;
    //Useing Collectio(it extends lists, arraylists,linkedLists)
    // a Collection of Seat Class Objects called seats. = and we store them in an LINKEDList[Seat- object]
    //since we use collection framework  we can use " new HashSet<>(); or new LinkedHashSet<>();"
    // private Collection<Seat> seats = new ArrayList<>(); - we changesd it back to List
    private List<Seat> seats = new ArrayList<>();

    //Constructor
    //we added 2 addional variables/paramaters to constructor.
    public Theather_Binary(String theaterName, int numRows, int seatsPerRow) {
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
    public boolean reserveSeat(String seatNumber) {
        //creating a seatClass object called requestedSeat.
        Seat requestedSeat = new Seat(seatNumber);
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

    /*binarysearch source
          public boolean reserveSeat(String seatNumber) {
              int low = 0;
              int high = seats.size() - 1;

              while (low <= high) {
                  System.out.print(".");
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

              System.out.println("There is no seat " + seatNumber);
              return false;
          }*/


    //method to get all the seats
    public void getSeats(){
        //we go throgh the arrayList of seats.
        for (Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    //innerClass Seat
    private class Seat implements Comparable<Seat>{
        //fields in inner class
        private final String seatNumber;
        private boolean reserved = false;

        //constructor
        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }
        //getter
        public String getSeatNumber() {
            return seatNumber;
        }

        //Overide method from public interface class
        @Override
        public int compareTo(Seat seat) {
            //Prinline to see how many times it has to goe through the loop before it finds the seat.
            System.out.print(".");
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
