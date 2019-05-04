package com.javamasteclass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    //we create a new instance of Map where we add our locations. We pass the first pramater Integre and second the locations Class.
    private static Map<Integer,Location> locationMap = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        //Scanner for input
        Scanner scanner = new Scanner(System.in);
        //now we use the locationMap field to add our locations, first pass the id nr as key
        // and second as value we pass a new instance of the map Class as its value witch will take 2 paramaters:
        //first the same key field value and second the actual value of the key.
        //aka useing autoboxing
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

        //Using Map.ofEntries() Method to Create Immutable Map
        //Map.of(2,"W",3,"N",4,"E",5,"S",6,"Q").get(1);

        //we ctraete a variable called loc and assing it a value of one aka the key field value.
        int loc = 1;
        while (true){
            //if the location key is there we get the value of it, as astarting position.
            System.out.println(locationMap.get(loc).getDescription());
            if (loc == 0 ){
                break;
            }
            //created copy of a map called exits = and set it equal to the created instance of loactionmap
            // to access the Location classes method getExits.
            Map<String,Integer> exits = locationMap.get(loc).getExits();
            System.out.println("Available exits are ");
            //we create a loop to go through all the exits we have.
            for (String exit: exits.keySet()){
                System.out.print(exit + ", ");
            }
            //to go to new line
            System.out.println();

            //now we need to grab a character instead of integere, and to have it in upper case.
            String direction = scanner.nextLine().toUpperCase();
            //if exit the new mapinstance of exists contains that key we enter, we set the loc variable equal to that  direcion.
            if (exits.containsKey(direction)){
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direcion.");
            }
            /* adventuregame part1
            //now we go to the next where it asks us for a loc(location key number) input.
            loc = scanner.nextInt();
            //if the location map does not have a value with given key input, we get error.
            if (!locationMap.containsKey(loc)){
                System.out.println("You cannot go in that direcion.");
            }*/
        }
        /*
        //splits into single words
        String[] road = "You are sitting in front of a computer learning Java".split(" ");
        for (String i : road){
            System.out.println(i);
        }
        //Splits after coma.
        String[] road2 = "You are sitting in front of a computer, learning Java".split(", ");
        for (String i : road2){
            System.out.println(i);
        }*/
    }
}
