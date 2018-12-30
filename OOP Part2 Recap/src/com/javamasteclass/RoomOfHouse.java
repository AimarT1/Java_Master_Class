package com.javamasteclass;

public class RoomOfHouse {
    private Room theRoom;
    private Furniture theFurniture;
//Constuctors
    public RoomOfHouse(Room theRoom, Furniture theFurniture) {
        this.theRoom = theRoom;
        this.theFurniture = theFurniture;
    }
    //method for the private getter
    public void build(){
        theRoom.BuildRoom(6);
    }
//Getters
    //since this getter is private we can actuly delet it.
    private Room getTheRoom() {
        return theRoom;
    }

    public Furniture getTheFurniture() {
        return theFurniture;
    }
}
