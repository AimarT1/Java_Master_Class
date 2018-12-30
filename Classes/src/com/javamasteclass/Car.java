package com.javamasteclass;
//public - acsess modifier
// Encapsulation(Private) in java is used to hide the field and methods, from acsess publicly.
public class Car {
    //characteristiks of a car
    // private means you cant acess these variables
    //fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        //testing the lowerCase verion
        if (model.equals("911") || validModel.equals("6")){

        //to up date filed "model", wich is private, we use " this."
        this.model = model; // = "model" is a paramater.
    }else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return  this.model;
    }

}
