package com.javamasteclass;

//Sets - Symmeric & Asymmeric

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {

        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++){
            squares.add(i *1);
            cubes.add(i * i * i);
        }
        System.out.println("There are : " + squares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> uniin = new HashSet<>(squares);
        uniin.addAll(cubes);
        System.out.println("Union contains " + uniin.size() + " elements");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for (int i : intersection){
            System.out.println(i + " is square of " + Math.sqrt(i) + " and cubes of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words){
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all","nature","is","but","unknown","to","thee"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to","err","is","human","to","forgive","divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine: ");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature: ");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("SYMMETRIC DIFFERENCE: ");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        if (nature.containsAll(divine)){
            System.out.println("divine is subset of nature");
        }
        if (nature.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of nature");
        }

        if (divine.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of divine");
        }

    }
    private static void printSet (Set<String> print){
        for (int i = 0; i < print.size(); i++){
            //System.out.println(print);
        }
        System.out.println(print);
        System.out.println(print.size());
    }
}
