package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
	// Scope: emp: scope refers to the visibility of a class, member or variable.
        //non code terms: buying a computer from local store 20% off
        //the same computer in another store will still be at a full price though, so the price reduction is just that local store.
        //Contarst to a large company aka Walmart, if the desice to discount a computer the discaunt would applay to all their stores,
        //cause their big change store, many stores all over country, aka the scope of discount is much wider.
        //Java objects got scope much the same way.
        String privateVar = "This is private to main()";
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("Scope instance privateVar is: " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);
        scopeInstance.timesTwo();
        System.out.println("******");


        //innerclass instance
        // Creating a new instance of ScopeCheck (superclass). new instace of the inner class inside the superclass ".new innerClass".
        ScopeCheck.innerClass innerClass = new ScopeCheck().new innerClass();
        innerClass.timesTwo();

        //Visibility

     }
}
