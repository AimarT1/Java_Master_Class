package com.javamasteclass;

import java.util.Scanner;

public class Main {

    //Butto n part -> local class
    private static Scanner scanner = new Scanner(System.in);
    private static Button button = new Button("Print");
    //<-

    public static void main(String[] args) {

        //creating a new instance of gearbox class
        Gearbox mcLaren = new Gearbox(6);
        //to creata a Gear class we have to use Gearbox.Gear- Beacuse Gear is an innerclass to gearbox.
        //then we use the gearbox instance we created "mcLAREN" and then added the .new Gear
        Gearbox.Gear first = mcLaren.new Gear(1,12.3);
        System.out.println(first.driveSpeed(1000));
        System.out.println("*******");


        //PART 2

        Gearbox_2 mC = new Gearbox_2(6);
        mC.addGear(1,5.3);
        mC.addGear(2,10.5);
        mC.addGear(3,15.9);
        mC.operateCluch(true);
        mC.changeGear(1);
        mC.operateCluch(false);
        System.out.println(mC.wheelSpeed(1000));
        mC.changeGear(2);
        System.out.println(mC.wheelSpeed(3000));
        mC.operateCluch(true);
        mC.changeGear(3);
        mC.operateCluch(false);
        System.out.println(mC.wheelSpeed(6000));
        System.out.println("*******");

        //part3/cahnge 3

        Gearbox_3 mCL = new Gearbox_3(6);
        mCL.operateCluch(true);
        mCL.changeGear(1);
        mCL.operateCluch(false);
        System.out.println(mCL.wheelSpeed(1000));
        mCL.changeGear(2);
        System.out.println(mCL.wheelSpeed(3000));
        mCL.operateCluch(true);
        mCL.changeGear(3);
        mCL.operateCluch(false);
        System.out.println(mCL.wheelSpeed(6000));

        System.out.println("*******");

        //Button part
        class ClickListener implements Button.OnClickListener{

            public ClickListener(){
                System.out.println("Ive been attached");
            }
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
        button.setOnClickListener(new ClickListener());
        listen();

        //part4 unanomous class
        //Created automaticly
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("Title was clicked");
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
                    button.onClick();
            }
        }
    }
}
