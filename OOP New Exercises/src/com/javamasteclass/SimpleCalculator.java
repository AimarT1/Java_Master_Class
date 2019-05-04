package com.javamasteclass;

public class SimpleCalculator {

    //fields
    private double firstNumber;
    private double secondNumber;

    //constructor
    public SimpleCalculator() {
    }

    //getters and setters
    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //methods
    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }
    public double getDivisionResult(){
        if (this.secondNumber == 0){
            return 0;
        }else {
        return this.firstNumber / this.secondNumber;
    }}
}
