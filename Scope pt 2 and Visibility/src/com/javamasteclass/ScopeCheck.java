package com.javamasteclass;

public class ScopeCheck {

    //The objects scope is the lock in its declared includeing any contained blocks.

    public int publicVar = 0;
    //member variable "varOne" - extends/acesssable to the whole class.
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck  created, publicVar = " + publicVar + " : varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        //this "varTwo" variable is local/acessable to this method.
        int varTwo = 2;
        //i - is in the scope of 2 {braces} limited to this block
        for (int i = 0; i < 10; i++) {
            //if you want to use the class level "varOne" then we use it as "this.varOne".
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public void useInner(){
        //created a new instance of the inner class and use it in its superclass "class ScopeCheck".
        innerClass innerClass = new innerClass();
        //aka visibility extends into the outerClass/SuperClass
        System.out.println("varThree from outer class:" + innerClass.varTree);
    }

    public class innerClass {
        //accessable in side its inner class
        public int varTree = 3;

        public innerClass() {
            System.out.println("InnerClass created, varOne is" + varOne +  " and varTree is: " + varTree);
        }

        //method with same name for inner class.
        public void timesTwo() {
            System.out.println("var one is still available here " + varOne);
            //this "varOne" variable is local to this method.

            //since i commented the variable "int varOne = 2" out the it takse the innerclasses field " public int varOne = 3;"
            // value as its given value.
            //int  varOne = 2;
            //i - is in the scope of 2 {braces} limited to this block
            for (int i = 0; i < 10; i++) {
                //if you want to use the class level "varOne" then we use it as "this.varOne".
                //if we use "this.varOne" , and we dont have it inside the inner class field we get an error,
                // its looking inide the scope of this innerClass.
                // But just ""varOne"" will find it in the superclass scope, if we havent defined it here first.
                System.out.println(i + " times two is " + i * varTree);
                //below will get it from that superclass, we used it as the class to find it.
                //System.out.println(i + " times two is " + i * ScopeCheck.this.varOne);
            }
        }
    }
}
