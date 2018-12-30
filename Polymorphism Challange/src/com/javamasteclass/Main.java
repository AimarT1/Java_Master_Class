package com.javamasteclass;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int gears;
    private String color;

    //Constructos

    public Car(String name,int cylinders, int gears, String color) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.gears = gears;
        this.color = color;
    }

    //methods

    public boolean startEngine(){
       if (engine){
           return true;
       }
       return false;
    }

    public int accelerate(){
      return gears;
    }

    public String brake(){
        return "You pressed brakes, slowing down";
    }

    //Getters
    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getGears() {
        return gears;
    }

    public String getColor() {
        return color;
    }

}
    class Mazda extends Car{
        public Mazda(){
            super("Mazda",6,6,"Black");
        }

        @Override
        public boolean startEngine() {
            return true;
        }

        @Override
        public int accelerate() {
            return getGears();
        }

        @Override
        public String brake(){
            return "No brakes pressed, continueing drive !";
        }
    }

    class Ferrari extends Car{
        public Ferrari (){
            super("Ferrari",12,6,"Red");
        }

        @Override
        public boolean startEngine() {
            return true;
        }

        @Override
        public int accelerate() {
            return getGears();
        }

        @Override
        public String brake(){
            return "No brakes pressed, continueing drive !";
        }
    }

    class Nissan extends Car{
        public Nissan(){
            super("Nissan",4,5,"White");
        }

        @Override
        public boolean startEngine() {
            return true;
        }

        @Override
        public int accelerate() {
            return getGears();
        }
    }

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++ ){

            Car car = randomCar();
            System.out.println("Car# " + i + " : " + car.getColor()+ " " + car.getName() + "\n" + "Start Engine: " + car.startEngine() + "\n" +
                    "Accelatateing to: " + car.accelerate() + "\n" + "Used breaks:  " + car.brake() + "\n" );
        }
    }

    public static Car randomCar(){

        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Mazda();
            case 2:
                return new Nissan();
            case  3:
                return new Ferrari();
        }
        return null;
    }
}
