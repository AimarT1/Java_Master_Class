package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
	// Scope: emp: scope refers to the visibility of a class, member or variable.
        //non code terms: buying a computer from local store 20% off
        //the same computer in another store will still be at a full price though, so the price reduction is just that local store.
        //Contarst to a large company aka Walmart, if the desice to discount a computer the discaunt would applay to all their stores,
        //cause their big change store, many stores all over country, aka the scope of discount is much wider.
        //Java objects got scope much the same way.
        String varFour = "This is private to main()";
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("Scope instance var1 is: " + scopeInstance.getVarOne());
        System.out.println(varFour);
        scopeInstance.timesTwo();
        System.out.println("******");


        //innerclass instance
        // Creating a new instance of ScopeCheck (superclass). new instace of the inner class inside the superclass ".new innerClass".
        ScopeCheck.innerClass innerClass = new ScopeCheck().new innerClass();
        innerClass.timesTwo();

        //Visibility - is gover by the access modifiers. Visibility is connected to scope
        //Scope of each variable in turn.
        //The objects scope is the lock in its declared includeing any contained blocks.
        scopeInstance.useInner();
        //if we make the innerclasses field " private int varTree = 3;" private we dont have the visibilty to acess it .
        System.out.println(innerClass.varTree);

     }
}
