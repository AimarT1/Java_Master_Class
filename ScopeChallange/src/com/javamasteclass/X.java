package com.javamasteclass;

public class X {
    //Field
    private  int x;

    //constructor
    public X(int x) {
        this.x = x;
    }
    //method
    public void x (){
        for (int x = 1; x < 13; x++){
            //int x for loop, this.x for the input and equals x times * this.x input(number)
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
