package com.javamasteclass;

import java.util.HashMap;
import java.util.Map;

//

public class Location {
    //fields. Our fields are final so they cant be changed ounce constractor has finished changing the location instance.
    private final int locationID;
    private final String description;
    //Map takes String and Integer as its types
    private final Map<String,Integer> exits;

    //constructor
    public Location(int locationID, String description,Map<String,Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        //we just inizialise the Maps filed "exit" to new instance of it as HashMap.
        //we added a check so if a null value is passed it wount crach
        if (exits != null){
            //every location has an exit therefor we set it in the constructor.
            this.exits = new HashMap<String, Integer>(exits);
        } else {
            //creates anew hach map witjout any data.
            this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q",0);
    }

    //getters
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        //new map is created and it has all the mapings from the exits map.
        //reson: nothing outside of the class can change exits, so the getter will return a copy of exits,
        // if the calling program wants to add or remove mapings from it then the exits maping field wont be effected.
        return new HashMap<String, Integer>(exits);
    }
}
