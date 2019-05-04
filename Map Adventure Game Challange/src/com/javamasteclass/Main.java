package com.javamasteclass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer,Location> locationMap = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        //Scanner for input
        Scanner scanner = new Scanner(System.in);

        locationMap.put(0,new Location(0,"You are sitting in front of a computer learning Java"));
        locationMap.put(1,new Location(1,"You are standing at the end of a road before small brick building."));
        locationMap.put(2,new Location(2,"You are at the top of a hill."));
        locationMap.put(3,new Location(3,"You are inside a building,a well house for small spring"));
        locationMap.put(4,new Location(4,"You are in a valley beside a stream"));
        locationMap.put(5,new Location(5,"You are in the forest"));

        //adding exits to all created locations
        locationMap.get(1).addExit("W",2);
        locationMap.get(1).addExit("E",3);
        locationMap.get(1).addExit("S",4);
        locationMap.get(1).addExit("N",5);

        //second location exits
        locationMap.get(2).addExit("N",5);

        //third location exits
        locationMap.get(3).addExit("W",1);

        //forth location exits
        locationMap.get(4).addExit("N",1);
        locationMap.get(4).addExit("W",2);

        //fifth location exits
        locationMap.get(5).addExit("S",1);
        locationMap.get(5).addExit("W",2);

        int loc = 1;
        while (true){
            //if the location key is there we get the value of it, as a starting position.
            System.out.println(locationMap.get(loc).getDescription());
            if (loc == 0 ){
                break;
            }

            Map<String,Integer> exits = locationMap.get(loc).getExits();
            System.out.println("Available exits are ");
            //we create a loop to go through all the exits we have.
            for (String exit: exits.keySet()){
                System.out.print(exit + ", ");
            }
            //to go to new line
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
//code for exerice that does the trick
            if (exits.containsKey(direction)){
                loc = exits.get(direction);
            }
            else if (direction.contains("WEST")){
                direction = "W";
            }else if (direction.contains("EAST")){
                direction = "E";
            }else if (direction.contains("SOUTH")){
                direction = "S";
            } else if (direction.contains("NORTH")){
                direction = "N";
            } else if (direction.contains("QUIT")){
                direction = "Q";
            }else  {
                System.out.println("You cannot go in that direcion.");
            }
            if (exits.containsKey(direction)){
                loc = exits.get(direction);
            }
            //code for exerice that does the trick
        }
    }
}
