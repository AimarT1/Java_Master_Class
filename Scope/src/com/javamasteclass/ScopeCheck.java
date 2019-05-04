package com.javamasteclass;

public class ScopeCheck {
    public int publicVar = 0;
    //member variable "privateVar" - extends to the whole class.
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck  created, publicVar = " + publicVar + " : privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        //this "privateVar" variable is local to this method.
        int privateVar = 2;
        //i - is in the scope of 2 {braces} limited to this block
        for (int i = 0; i < 10; i++) {
            //if you want to use the class level "privateVar" then we use it as "this.privateVar".
            System.out.println(i + " times two is " + i * privateVar);
        }
    }

    public class innerClass {
        public int privateVar = 3;

        public innerClass() {
            System.out.println("InnerClass created, privateVar is: " + privateVar);
        }

        //method with same name for inner class.
        public void timesTwo() {
            //this "privateVar" variable is local to this method.

            //since i commented the variable "int privateVar = 2" out the it takse the innerclasses field " public int privateVar = 3;"
            // value as its given value.
            //int  privateVar = 2;
            //i - is in the scope of 2 {braces} limited to this block
            for (int i = 0; i < 10; i++) {
                //if you want to use the class level "privateVar" then we use it as "this.privateVar".
                //if we use "this.privateVar" , and we dont have it inside the inner class field we get an error,
                // its looking inide the scope of this innerClass.
                // But just ""privateVar"" will find it in the superclass scope, if we havent defined it here first.
                System.out.println(i + " times two is " + i * privateVar);
                //below will get it from that superclass, we used it as the class to find it.
                //System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);
            }
        }
    }
}
