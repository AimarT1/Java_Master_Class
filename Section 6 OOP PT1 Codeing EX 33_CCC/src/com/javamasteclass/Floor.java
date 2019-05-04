package com.javamasteclass;

public class Floor {
    // fields
    private double length;
    private double width;

    //consytructors
    public Floor(double length, double width) {
        //inizializing constructors
        if (length < 0){
            this.length = 0;
        }else {
            this.length = length;
        }

        if (width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }
    //methods
    public double getArea(){
         return this.length * this.width;
    }
}
