package com.javamasteclass;

//Sets - Symmetric(architecture ) and Asymmetric(ebasümmeetriline)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {

        //Creating two set objects.
        Set<Integer> squares = new HashSet<Integer>();
        Set<Integer> cubes = new HashSet<Integer>();

        for (int i = 1 ; i <= 100; i++){
            squares.add(i * i);
            cubes.add(i * i * i);
        }
        System.out.println("There are: " + squares.size() + " squares and " + cubes.size() + " cubes.");
        //creating a unified object of sets
        //we put a pramater squares so it adds elements from the square set into this union set.
        Set<Integer> union = new HashSet<Integer>(squares);
        //now we use union.addAll() to add the cubes(elements) as well aka we create a uninion of both sets.
        union.addAll(cubes);
        //after the unified set is created we print it out.
        System.out.println("union object contains: " + union.size() + " elements");
        //
        //intersection - lõikumine; lõikepunkt
        Set<Integer> intersection = new HashSet<Integer>(squares);
        /*this operation effectively modifies this
         * set so that its value is the <i>asymmetric set difference</i> of
         * the two sets. <- .retainAll() method */
        intersection.retainAll(cubes);
        System.out.println("Intersection contains: " + intersection.size() + " elements.");
        //going throgh each element in the intersecion object. aka printib lõikepunktid.
        for (int i : intersection){
            System.out.println(i + " is a square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }
        //Assumetric
        //new HashSet<String>"()" -empty constructor of object
        Set<String> words = new HashSet<String>();
        String sentece = "one day in the year of the fox";
        //splits the "String sentece" into parts of single words, for the arrayWords.
        String[] arrayWords = sentece.split(" ");
        //addIng allWords as Arrays.asList -  wich will pass the arryList of words to the words Set object.
        words.addAll(Arrays.asList(arrayWords));
        //Going through all the words in the words Set object. And print them all out.
        for (String s : words){
            System.out.println(s);
        }
        //"()" -empty constructor of object
        Set<String> nature = new HashSet<String>();
        Set<String> divine = new HashSet<String>();
        //Creating a string array of words.
        String[] natureWords = {"all","nature","is","but","art","unknown","to","tree"};
        String[] divineWords = {"to","err","is","human","to","forgive","divine"};
        nature.addAll(Arrays.asList(natureWords));
        divine.addAll(Arrays.asList(divineWords));

        //printing out the assymetric difference
        System.out.println("nature - divine: " );
        //Creating a new union set diff1 with nature as its constructor
        Set<String> diff1 = new HashSet<String>(nature);
        //diff1.remove(divine) - remove all divine words tha are the same in nature object.
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature: " );
        Set<String> diff2 = new HashSet<String>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        //Symmetric difference printse the collection of non matchimg words.
        Set<String> unionTest = new HashSet<String>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<String>(nature);
        intersectionTest.retainAll(divine);
        System.out.println("Symmetric difference: ");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        //
        if (nature.containsAll(divine)){
            System.out.println("Divine is a subset of Nature.");
        }
        if (nature.containsAll(intersectionTest)){
            System.out.println("Intersection is a sub set of Nature");
        }
        if (divine.containsAll(intersectionTest)){
            System.out.println("Intersection is a sub set of Devine");
        }

    }
    public static void printSet(Set<String> union){
        for (String s : union){
            System.out.println("\t" + s);
        }
    }
}
