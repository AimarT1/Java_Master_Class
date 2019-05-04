package com.javamasteclass;

//we can point directly to the java.util Maps intrface. MapProgram is reserved Class word!
//MapProgram - is abstract class, it maps keys to values.
//Example langue dictionary is a map: with the kes being the words in the dictionary and values being the definitions of those words.
//Java map - cant contain duplicate keys, key can oly map to single value.
// Hashmap, LinkedHashmap,
// treeMap - implements the sorted map interface.
//Maps like all the Core Collection interfaces are Generic- they take two types: one for the key and one for the value.

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        //Map types - first is key(type String) and second value is (type String) - we use.
        Map<String,String> languages = new HashMap<>();

        if (languages.containsKey("Java")){
            System.out.println("Java already exists");
        } else {
            languages.put("Java", " a compiled high level object-oriantated, platform independant language");
            System.out.println("Java added successfully");
        }
        //languages.put("Java", " a compiled high level object-oriantated, platform independant language");
        languages.put("Python", "a interpreted, object-oriantated, high.level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Begginners All PURPOSES symbolic Instrucion code");
        languages.put("Lisp","Therein lies madness");
        //these values have now been store to the map object. <

        //a way to check if JAVA as a key ia already used.
        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", " this course is about Java");
        }

        //To print the value of the Key, we have to use (languages.get("Java")); and use the key name aka Java.
        System.out.println(languages.get("Java"));
        //if we use the same key again the it overrides the original value of that key.

        System.out.println("======================");

        //remove method retuns true of false.
        //languages.remove("Lisp");
        if (languages.remove("Algol", "a family of algoritmic languages")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        //to replace the current value of the key.
        languages.replace("Lisp","a functional programming languaege with imperative features");
        //if check, if old value is correct then rreplace with new.
        if (languages.replace("Scala","No value","this will not b added")){
            System.out.println("Scala replaced");
        } else {
            System.out.println("Scala Not replaced");
        }

        //for loop to go all the key in the HashMap. Records are returned in corect order.
        for (String key: languages.keySet()){
            System.out.println(key + " : " +languages.get(key));
        }

    }
}
