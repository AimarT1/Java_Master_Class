package com.javamasteclass;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        //local classes

        // new instance of gearbox class
        Gearbox mcLaren = new Gearbox(6);
        //new instance of inner class gear, first have to use Main class. "innercalss" = new instance name. new Gear aka
        //the inner class.
       // Gearbox.Gear first = mcLaren.new Gear(1,12.3);
        //System.out.println(first.driveSpeed(1000));

        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));


        //
        class ClickListner implements Button.OnClickListner{
            public ClickListner(){
                System.out.println("Ive been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
        btnPrint.setOnClickListner(new ClickListner());

        //anonomous class
        btnPrint.setOnClickListner(new Button.OnClickListner() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
        int choise = scanner.nextInt();
        scanner.nextLine();
        switch (choise){
            case 0:
                quit = true;
                break;
            case 1:
                btnPrint.onClick();
                break;
        }
    }
}
}
