package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
	//Encapsulation - is the mechanism that alowws you to restrict acess to certain components in the objects you are createing,
    // you are able to protect members of the class to from external acess. We are stoping outsideers Classes or code,
    // outside of the class that you are working to hide the inner working of the class from another class.
        //Acsess for Create a new  class.
        Player player = new Player();
        //We need to manualy set the fields, we can do it because we made variables public
        player.name = "Aimar";
        player.health = 20;
        player.weapon = "Gun";

        int damage = 10;
        //we are accessing "Player Class", "LoseHealt method" and we are giving it a parameter "damage"
        player.loseHealth(damage);
        System.out.println("Remaing health = " + player.healthRemaing());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaing health = " + player.healthRemaing());
        System.out.println("**************");

        //useing encapsulation, by makeing our class private we are making sure that our class values arnet acessable outside.
        EnhancedPlayer player1 = new EnhancedPlayer("Aimar",70,"Gun");
        System.out.println("Remaing health = " + player1.getHealt());
        System.out.println("**************");

        //Challange
        Printer printer = new Printer(100,0,false);
        printer.print(49);
        System.out.println("Pages printed = " + printer.getNumberOfPagesprinted());
        printer.print(12);
        System.out.println("Pages printed = " + printer.getNumberOfPagesprinted());
        //System.out.println(printer.getTonerLevel() - printer.getNumberOfPagesprinted());
        System.out.println(printer.getTonerLevel());
        printer.fillUpToner();
        System.out.println(printer.getTonerLevel());
        //Tims
        System.out.println("**************");
        Printer_Tim printerTim = new Printer_Tim(50,true);
        System.out.println("Initial page count = " + printerTim.getPagesPrinted());
        int pagesPrint = printerTim.printPages(4);
        System.out.println("Pages printed was " + pagesPrint + " new total count of printer = " + printerTim.getPagesPrinted());
        pagesPrint = printerTim.printPages(2);
        System.out.println("Pages printed was " + pagesPrint + " new total count of printer = " + printerTim.getPagesPrinted());
        printerTim.printPages(15);
        System.out.println("Pages printed was " + pagesPrint + " new total count of printer = " + printerTim.getPagesPrinted());

    }
}
