package com.javamasteclass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    //Creating an new map instance wuth string and Heavenlybody object as pramaters, call the field solarSystem.
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<HeavenlyBody.Key, HeavenlyBody>();
    //Creating a new set with Heavenlybody object as its type pramater called planets = a new HashSet.
    private static Set<HeavenlyBody> planets = new HashSet<HeavenlyBody>();

    public static void main(String[] args) {

        //Creating a new instance of HeavanlyBody class called temp = need the constuctor values.
        HeavenlyBody temp = new Planet("Mercury",88);
        //added it to the map
        solarSystem.put(temp.getKey(),temp);
        //added it to set
        planets.add(temp);

        // useing the created instance varaible to add more objects.
        temp = new Planet("Venus",225);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Earth",365);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon",27);
        solarSystem.put(temp.getKey(),tempMoon);
        //we are adding moon to earth, rather then adding as it as planet.
        temp.addSatelite(tempMoon);

        temp = new Planet("Mars",687);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        //adding the moon to Mars object, "Deimos is part of Mars"
        tempMoon = new Moon("Deimos",1.3);
        solarSystem.put(temp.getKey(),tempMoon);
        //using the metho in heavenly body class addSatelite(); to add Moon to Created Planet object.
        temp.addSatelite(tempMoon);//temp is still Mars aka a part of Mars

        temp = new Planet("Jupiter",4332);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        tempMoon = new Moon("Io",1.8);
        solarSystem.put(temp.getKey(),tempMoon);
        temp.addSatelite(tempMoon);//temp is still Jupiter aka a part of Jupiter

        tempMoon = new Moon("Europa",3.5);
        solarSystem.put(temp.getKey(),tempMoon);
        temp.addSatelite(tempMoon);//temp is still Jupiter aka a part of Jupiter

        tempMoon = new Moon("Callisto",16.7);
        solarSystem.put(temp.getKey(),tempMoon);
        temp.addSatelite(tempMoon);//temp is still Jupiter aka a part of Jupiter

        temp = new Planet("Saturn",10759);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Uranus",30660);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Neptune",165);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Pluto",248);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        //printing the planets
        System.out.println("Planets:");
        //Going throgh a loop of Heavenlybody(type) objects int the planet Hashset instance.
        for (HeavenlyBody planet : planets){
            System.out.println("\t" + planet.getKey());
        }

        //Creatin a new Heavenlybody instance called body, set it equal to "solarSystem", created instance,
        // to get the name of the moons of particular Planet.
        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of: " + body.getKey());
        //Go throug the loop, create instance HeavenlyBody JupiterMoon and
        // access the HeavenlyBody class trogh the body variable/object to get the setof satelites/(moons) for that planet.
        for (HeavenlyBody jupiderMoon : body.getSatelites()){
            System.out.println("\t" + jupiderMoon.getKey());
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
            System.out.println("\t" + moon.getKey());
        }

        //Example of duplicate, works no duplicate added.
        HeavenlyBody pluto = new Planet("Pluto", 842);
        //it doesnt compare if there is a planet named pluto allready!
        planets.add(pluto);

        //for 4th test to adda satelite with the same name but differnt bodyType
       // HeavenlyBody saturn = new Planet("Saturn", 842);// Test to replace previous value.
        HeavenlyBody saturn = new Comet("Saturn", 842);
        //it doesnt compare if there is a planet named pluto allready!
        planets.add(saturn);

        for (HeavenlyBody planet : planets){
            System.out.println(planet);
        }
        //testing the equals method.
        HeavenlyBody earth1 = new Planet("Earth",365);
        HeavenlyBody earth2 = new Planet("Earth",365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));

        //test 5,6
        solarSystem.put(saturn.getKey(),saturn);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Saturn", HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Saturn", HeavenlyBody.BodyTypes.COMET)));

        //print solarSystem
        System.out.println();
        System.out.println("The solar system contains: ");
        for (HeavenlyBody heavenlyBody : solarSystem.values()){
            System.out.println(heavenlyBody);
        }
    }
}
