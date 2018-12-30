package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
	// inheritanse - is a relationship (exp: car is a vehicle)
        //composition - has a relationship (exp: pc has a case,motherboard,monitor. Case,motherboard,monitor is not PC)
        //another wordds PC-s components are Case,Motherboard,Monitor

        //Created a instance of dimentions class without yousing a variable.
        Case theCase = new Case("220B","Dell","250", new Dimentions(20,20,5));
        Monitor theMonitor = new Monitor("27inhc Beast", "Acer",27,new Resolution(2540,1440));
        Motherboard theMotherBoard = new Motherboard("BJ 200","Asus",4,6,"v2.44");
        PC thePC = new PC(theCase,theMonitor,theMotherBoard);
        //We are using the getter funcion from Pc class "return monitor", wich is store in that object in the pc class,
        // from the pc object. Whisc call the Monitor classs, drawPixelAT method.
        //WE are acessing them by the PC object.
        //thePC.getTheMonitor().drawPixelAt(1500,1200,"White");
        //thePC.getTheMotherBoard().loadProgram("Windows 1.0");
        //thePC.getTheCase().pressPowerButton();
        //Constructor part2 we make the Case, Monitor,Motherboard classis acess Private.
        //compositon creating objects within objects.
        thePC.powerUp();
        thePC.loadProgram();
        System.out.println("******");
        //Challange Composition
        //inizialazing classes
        Room room = new Room(1,1,4,2,1);
        Furniture furniture = new Furniture("Master Bed","Cristall lamp","Big white closet with mirrors",
                "White furry carpet,","Multiuse");
        RoomOfHouse roomOfHouse = new RoomOfHouse(room,furniture);
        //private method instead of public getter
        roomOfHouse.build();
        //public getter
        roomOfHouse.getTheFurniture().designeRoom();
        System.out.println("******");


        //Encaptulation
        //We can acsess it beacuse we made fileds in the Player Class public.
        Player player = new Player();
        player.name = "AIMAR";
        player.health = 100;
        player.weapon = "Gun";

        int damage = 30;
        player.loseHealth(damage);
        System.out.println("Remaing health = " + player.healthRemaing());

        damage = 88;
        player.loseHealth(damage);
        System.out.println("Remaing health = " + player.healthRemaing());

        //one potentsial problem is that you can change the healt value since its made public.
        //second is if u change a filed name in class, it wont work in the main call and you have to change it there too.

        //Encaptulation2 the right way
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Aimar",500,"Gun");
        System.out.println("Inizial health is: " + enhancedPlayer.getHealth());
        System.out.println("******");

        //Challange
        Printer printer = new Printer(100,0,true);
        printer.PrintPages(59);
        printer.PrintPages(82);
        System.out.println(printer.getNumberOfPagesPrinted());
        Printer printer1 = new Printer(100,0,false);
        printer1.PrintPages(38);
        printer1.PrintPages(20);
        System.out.println(printer1.getNumberOfPagesPrinted());
        System.out.println("Toner level is: " + printer.getTonerLevel());
        System.out.println("Toner level is: " + printer1.getTonerLevel());
        printer.FillToner();
        System.out.println("Toner level is: " + printer.getTonerLevel());
        printer1.PrintPages(29);
        System.out.println("Total amount of pages printed: " + printer1.getNumberOfPagesPrinted());
        printer.PrintPages(40);
        System.out.println(printer.getNumberOfPagesPrinted());
        System.out.println("Toner level is: " + printer.getTonerLevel());
        printer.FillToner();
        System.out.println("Toner level is: " + printer.getTonerLevel());
        System.out.println("******");
        System.out.println("******");

        //SINCE HERE IS T0NN OF CODE ILL CREATE MAIN INTO CLASS POLYMORPHISM
        //polymorphism

        //Master challence Calls here !!!

        Hamburger hamburger = new Hamburger();
        System.out.println(hamburger.getBurgerName());
        System.out.println(hamburger.getPrice());
        System.out.println(hamburger.getRollType());
        //hamburger.additions(true,true,true,true);
        hamburger.additions(false,false,false,true);


        System.out.println("******");

        HealthyBurger healthyBurger = new HealthyBurger();
        System.out.println(healthyBurger.getBurgerName());
        System.out.println(healthyBurger.getPrice());
        System.out.println(healthyBurger.getRollType());
        healthyBurger.healthyAdditions(true,true);
        healthyBurger.additions(true,true,false,true);

        System.out.println("******");

        DeluxHamburger deluxHamburger = new DeluxHamburger("Cheetos","Coca cola");
        deluxHamburger.additions(false,false,false,false);
        System.out.println(deluxHamburger.getBurgerName());
        System.out.println(deluxHamburger.getPrice());
        System.out.println(deluxHamburger.getRollType());







    }
}
