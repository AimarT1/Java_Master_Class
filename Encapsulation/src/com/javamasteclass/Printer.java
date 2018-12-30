package com.javamasteclass;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesprinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesprinted, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesprinted = numberOfPagesprinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(){
        System.out.println("Current toner level is : " + this.tonerLevel);
        if (this.tonerLevel < 50){
            System.out.println("Time to fill up, it getting empty : adding " + numberOfPagesprinted);
            tonerLevel= tonerLevel+numberOfPagesprinted;
        }
    }

    public void print(int printing){
        while (printing > 0){
            printing = printing;
            System.out.println("Printing number of pages: " + printing);
            numberOfPagesprinted = printing + getNumberOfPagesprinted();
            this.tonerLevel= this.tonerLevel - printing;
            break;
        }

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesprinted() {
        return numberOfPagesprinted;
    }
}
