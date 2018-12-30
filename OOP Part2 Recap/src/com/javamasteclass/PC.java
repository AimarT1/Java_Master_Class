package com.javamasteclass;

public class PC {
    //in composition you can use multible classes, while with inheritance you can use one class at a time.
    //we call them form their classes and give them variable name
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherBoard;
//Created a constuctor for 3 different objects.
    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherBoard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherBoard =  theMotherBoard;
    }
    //method after making Cse,Monitor,Motherboard acess private
    public void powerUp(){
        getTheCase().pressPowerButton();
        drawLogo();
    }
    //power Up funcion will draw this logo.
    private void drawLogo(){
        theMonitor.drawPixelAt(1200,500,"yellow");
    }
    public void loadProgram(){
        theMotherBoard.loadProgram("Windows 10");
    }

    //method after making Cse,Monitor,Motherboard acess private
    private Case getTheCase() {
        return theCase;
    }

    private Monitor getTheMonitor() {
        return theMonitor;
    }

    private Motherboard getTheMotherBoard() {
        return theMotherBoard;
    }
}

