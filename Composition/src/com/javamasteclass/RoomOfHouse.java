package com.javamasteclass;

public class RoomOfHouse {
    private Walls theWall;
    private Floor theFloor;
    private Ceiling theCeiling;
    private Windows theWindows;
    private Door theDoor;
    private Bulders theBuilders;

    public RoomOfHouse(Walls theWall, Floor theFloor, Ceiling theCeiling, Windows theWindows, Door theDoor, Bulders theBuilders) {
        this.theWall = theWall;
        this.theFloor = theFloor;
        this.theCeiling = theCeiling;
        this.theWindows = theWindows;
        this.theDoor = theDoor;
        this.theBuilders = theBuilders;
    }

    public void complete(){
        theBuilders.buildersTimeToBuild();
        theFloor.installingFloor();
        theWall.installingWalls();
        theCeiling.insatllCeilings();
        theWindows.installingWindows();
        theDoor.installingDoor();
        System.out.println("House is Complete");
    }
}
