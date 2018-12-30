package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        Dimentions dimentions = new Dimentions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "250",dimentions);
        //we created a Resolution on the fly
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        //composition -creating objects within objects
        thePC.powerUp();
        System.out.println();

        //Challange
        Floor floor = new Floor(1);
        Walls walls = new Walls(4);
        Ceiling ceiling = new Ceiling(1);
        Windows windows = new Windows(2);
        Door door = new Door(1);
        Bulders bulders = new Bulders(6);

        RoomOfHouse roomOfHouse = new RoomOfHouse(walls,floor,ceiling,windows,door,bulders);
        roomOfHouse.complete();

    }
}
