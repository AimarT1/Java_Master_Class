package com.javamasteclass;
//Todo: You can add an additionl field called total page count to separate number of pages printed from the couunt,
//Todo: if the toner is re filled, so the pagesPrinted shows the new count after refill,
//Todo: and the total count shows the total amount of pages printed.

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted = 0;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplexPrinter) {
        if (tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
        this.tonerLevel = this.tonerLevel - numberOfPagesPrinted;
    }

    public void FillToner(){
        int toner = this.tonerLevel;
        if (tonerLevel < 30){
            tonerLevel = this.tonerLevel - numberOfPagesPrinted;
            System.out.println("Toner need filling, out of toner soon ! ");
            toner = toner - tonerLevel;
            System.out.println("Filling toner with toner in amount: " + toner);
        }
    }
    public void PrintPages(int print){
        if (duplexPrinter && print % 2 != 0){
                print = (print / 2) + 1;
                numberOfPagesPrinted = numberOfPagesPrinted + print;
        }else if (duplexPrinter && print % 2 == 0){
            print = print / 2;
                numberOfPagesPrinted = numberOfPagesPrinted + print;
        }
        else{
            print = print;
            numberOfPagesPrinted = numberOfPagesPrinted + print;
    }}

    public int getTonerLevel() {
        tonerLevel = tonerLevel - numberOfPagesPrinted;
        if (tonerLevel < 0){
            return tonerLevel = 100;
        }
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
