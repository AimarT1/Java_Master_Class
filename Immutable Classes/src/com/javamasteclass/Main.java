package com.javamasteclass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer,Location> locationMap = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        //Scanner for input
        Scanner scanner = new Scanner(System.in);
        //temporary map for exits
        Map<String,Integer> tempExit = new HashMap<String, Integer>();
        //we can now pass null for exits
        locationMap.put(0,new Location(0,"You are sitting in front of a computer learning Java",tempExit));

        tempExit = new HashMap<String, Integer>();
        //locationMap.get\(\d\).addExit  - search in eddit and tempExit.put and location to put them. Regex has to be ticked.
        //adding exits to all created locations
        tempExit.put("W",2);
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        locationMap.put(1,new Location(1,"You are standing at the end of a road before small brick building.",tempExit));
        //)); - search in eddit second ,tempExit)); no regex selected

        //second location exits
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N",5);
        locationMap.put(2,new Location(2,"You are at the top of a hill.",tempExit));

        //third location exits
        tempExit = new HashMap<>();
        tempExit.put("W",1);
        locationMap.put(3,new Location(3,"You are inside a building,a well house for small spring",tempExit));

        //forth location exits
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N",1);
        tempExit.put("W",2);
        locationMap.put(4,new Location(4,"You are in a valley beside a stream",tempExit));

        //fifth location exits
        tempExit = new HashMap<String, Integer>();
        tempExit.put("S",1);
        tempExit.put("W",2);
        locationMap.put(5,new Location(5,"You are in the forest",tempExit));

        int loc = 1;
        while (true){
            //if the location key is there we get the value of it, as a starting position.
            System.out.println(locationMap.get(loc).getDescription());
            tempExit.remove("S");
            if (loc == 0 ){
                break;
            }

            //added the line "Map<String,Integer> exits" to our exits constructor, so we could access them.
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
