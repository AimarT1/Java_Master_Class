package com.javamasteclass;
//Sets cannot contain duplicates. Orderd sets - LinkedHashSet and TreeSet.
//To ensure that there is no duplicates in your collection is to use a set rather than a list.
//Set interface is generic and takes a single type. SetInterface provaides basic: add, remove and clear,
// to maintain the items in the set as we a size method and isEmpty to provide info. We can check with contains method.
//there is no way to retrive a item from the set!
//Sets are useful because operations with them are very fast.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    //Creating a new object of bodyTypes.
    private static Set<HeavenlyBody.BodyTypes> bodyTypesSet = new HashSet<>();

    //Creating an new map instance wuth string and Heavenlybody object as pramaters, call the field solarSystem.
    private static Map<String,HeavenlyBody> solarSystem = new HashMap<String, HeavenlyBody>();
    //Creating a new set with Heavenlybody object as its type pramater called planets = a new HashSet.
    private static Set<HeavenlyBody> planets = new HashSet<HeavenlyBody>();

    public static void main(String[] args) {

        //Creating a new instance of HeavanlyBody class called temp = need the constuctor values.
        HeavenlyBody temp = new HeavenlyBody("Mercury",88,new HeavenlyBody.BodyTypes("Planet"));
        //added it to the map
        solarSystem.put(temp.getName(),temp);
        //added it to set
        planets.add(temp);
        bodyTypesSet.add(temp.getBodyType());

        // useing the created instance varaible to add more objects.
        temp = new HeavenlyBody("Venus",225,new HeavenlyBody.BodyTypes("Planet"));
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        bodyTypesSet.add(temp.getBodyType());

        temp = new HeavenlyBody("Earth",365,new HeavenlyBody.BodyTypes("Planet"));
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        bodyTypesSet.add(temp.getBodyType());

        HeavenlyBody tempMoon = new HeavenlyBody("Moon",27,new HeavenlyBody.BodyTypes("Moon"));
        solarSystem.put(tempMoon.getName(),tempMoon);
        //we are adding moon to earth, rather then adding as it as planet.
        temp.addMoon(tempMoon);
        bodyTypesSet.add(tempMoon.getBodyType());

        temp = new HeavenlyBody("Mars",687,new HeavenlyBody.BodyTypes("Planet"));
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        bodyTypesSet.add(temp.getBodyType());

        //adding the moon to Mars object, "Deimos is part of Mars"
        tempMoon = new HeavenlyBody("Deimos",1.3,new HeavenlyBody.BodyTypes("Moon"));
        solarSystem.put(tempMoon.getName(),tempMoon);
        bodyTypesSet.add(tempMoon.getBodyType());
        //using the metho in heavenly body class addMoon(); to add Moon to Created Planet object.
        temp.addMoon(tempMoon);//temp is still Mars aka a part of Mars
        bodyTypesSet.add(tempMoon.getBodyType());

        temp = new HeavenlyBody("Jupiter",4332,new HeavenlyBody.BodyTypes("Planet"));
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        bodyTypesSet.add(temp.getBodyType());

        tempMoon = new HeavenlyBody("Io",1.8,new HeavenlyBody.BodyTypes("Moon"));
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);//temp is still Jupiter aka a part of Jupiter
        bodyTypesSet.add(tempMoon.getBodyType());

        tempMoon = new HeavenlyBody("Europa",3.5,new HeavenlyBody.BodyTypes("Moon"));
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);//temp is still Jupiter aka a part of Jupiter
        bodyTypesSet.add(tempMoon.getBodyType());
        //******************************

        tempMoon = new HeavenlyBody("Callisto",16.7,new HeavenlyBody.BodyTypes("Moon"));
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);//temp is still Jupiter aka a part of Jupiter
        bodyTypesSet.add(tempMoon.getBodyType());

        temp = new HeavenlyBody("Saturn",10759,new HeavenlyBody.BodyTypes("Planet"));
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        bodyTypesSet.add(temp.getBodyType());

        temp = new HeavenlyBody("Uranus",30660,new HeavenlyBody.BodyTypes("Planet"));
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        bodyTypesSet.add(temp.getBodyType());

        temp = new HeavenlyBody("Neptune",165,new HeavenlyBody.BodyTypes("Planet"));
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        bodyTypesSet.add(temp.getBodyType());
        //***********************************TRY DUPLICATES******************
        temp = new HeavenlyBody("Neptune",999,new HeavenlyBody.BodyTypes("Moon"));
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        bodyTypesSet.add(temp.getBodyType());
        //***********************************TRY DUPLICATES******************

        temp = new HeavenlyBody("Pluto",248,new HeavenlyBody.BodyTypes("Planet"));
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        bodyTypesSet.add(temp.getBodyType());

        //***********************************TRY DUPLICATES******************
        //Example of duplicate and we print the all the planets out with their name and orbital period.
        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842,new HeavenlyBody.BodyTypes("Planet"));
        //it doesnt compare if there is a planet named pluto allready!
        planets.add(pluto);
        solarSystem.put(pluto.getName(),pluto);
        bodyTypesSet.add(pluto.getBodyType());
        //***********************************TRY DUPLICATES******************

        //printing the planets
        System.out.println("Planets:");
        //Going throgh a loop of Heavenlybody(type) objects int the planet Hashset instance.
        for (HeavenlyBody planet : planets){
            System.out.println("\t" + planet.getName());
        }

        //Creatin a new Heavenlybody instance called body, set it equal to "solarSystem", created instance,
        // to get the name of the moons of particular Planet.
        HeavenlyBody body = solarSystem.get("Jupiter");
        System.out.println("Moons of: " + body.getName());
        //Go throug the loop, create instance HeavenlyBody JupiterMoon and
        // access the HeavenlyBody class trogh the body variable/object to get the setof satelites/(moons) for that planet.
        for (HeavenlyBody jupiderMoon : body.getSatelites()){
            System.out.println("\t" + jupiderMoon.getName());
        }

        //Generating a set union.
        //Creating a new Set of "HeavenlyBody" objects a new HashSet.
        Set<HeavenlyBody> moons = new HashSet<HeavenlyBody>();
        //now we loop throgh the set of planets.
        for (HeavenlyBody planet : planets){
            //useing the created moons Set instance to add all planets moons to the new moons object.
            moons.addAll(planet.getSatelites());
        }
        System.out.println("All Moons:");
        //now we go throuh the Set of Moons in the Heavanlybody object.
        for (HeavenlyBody moon : moons){
            System.out.println("\t" + moon.getName());
        }

        System.out.println("Plantes with their orbital periods: ");
        for (HeavenlyBody planet : planets){
            System.out.println(planet.getName() + " " + planet.getOrbitalPeriod());
        }
        //Object example for equals method
        Object o = new Object();
        o.equals(o);
        "pluto".equals(" ");

        //Challange code
        //WE have 13 Objects i n the bodyType SET.
        System.out.println(bodyTypesSet.size());
        //Since we iniziated the new Set of bodyTypes, we justa have to create a variable of same type to loop.
        for (HeavenlyBody.BodyTypes types : bodyTypesSet){
            System.out.println(types.getBodyType());
        }

        //Check for test2
        HeavenlyBody earth1 =  new HeavenlyBody("Earth",365,new HeavenlyBody.BodyTypes("Planet"));
        HeavenlyBody earth2 =  new HeavenlyBody("Earth",365,new HeavenlyBody.BodyTypes("Planet"));
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));

    }
}
