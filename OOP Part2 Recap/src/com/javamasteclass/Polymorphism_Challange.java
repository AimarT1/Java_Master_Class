package com.javamasteclass;

class Car{
    private String name;
    private boolean engine;
    private int cylingers;
    private int wheels ;

    //constructor
    public Car(String name, int cylingers) {
        this.name = name;
        //since enginine is set to no else statement will be accest, but you hava a option to change that!
        this.engine = true;
        this.cylingers = cylingers;
        this.wheels = 4;
    }
    //methods
    public String startEngine(){

        if (engine){
            return "Engine has been started !";
        }else{
            return "Engine is set to false, your car seems not to have an engine, no way to start !";
        }
    }

    public String accelarate(){
        if (engine){
            return "Accelarating from 0 to 100";
        }else{
            return "No enginge, no accelaration for you ! ";
        }
    }

    public String brake(){
        return "Breaks have been inizialized, braking and returing to stop state, speed 0.";
    }

    //getters
    public String getName() {
        return name;
    }

    public int getCylingers() {
        return cylingers;
    }
}

class Mazda extends Car{
    public Mazda() {
        super("Mazda 6", 6);
    }

    @Override
    public String startEngine() {
        return "Engine has been started, ready to roll!";
    }

    @Override
    public String accelarate() {
        return "Accelerateing to the max, til engine blown !";
    }

    //No breaks method here
}

class Ferrari extends  Car{
    public Ferrari() {
        super("Ferrari F1", 12);
    }

    @Override
    public String startEngine() {
        return "With a press of a button !";
    }

    @Override
    public String accelarate() {
        return "Accelarating from 0 to 350";
    }

    @Override
    public String brake() {
        return "Breaks have been inizialized, braking smoothly with my Ferrari F1.";
    }
}

class Qasquie extends Car{
    public Qasquie() {
        super("Nissan Qasquie", 5);
    }
   //No start engine method here

    @Override
    public String accelarate() {
        //example to get the name differently.
        //All classes that you create in java are extended automaticcly from the object class.To give you functionalitty ect.
        return getClass().getSimpleName()+ " Accelarating from 0 to 100, but might take time";
    }
    //No breaks method here
}

public class Polymorphism_Challange {
    public static void main(String[] args) {
//Example one how to display
        Car car1 = new Car("Car",4);
        System.out.println(car1.getName());
        System.out.println(car1.startEngine());
        System.out.println(car1.accelarate());
        System.out.println(car1.brake());
        System.out.println("***");

        Mazda mazda = new Mazda();
        System.out.println(mazda.getName());
        System.out.println(mazda.startEngine());
        System.out.println(mazda.accelarate());
        System.out.println( mazda.brake());
        System.out.println("***");

        Ferrari ferrari = new Ferrari();
        System.out.println(ferrari.getName());
        System.out.println(ferrari.startEngine());
        System.out.println(ferrari.accelarate());
        System.out.println(ferrari.brake());
        System.out.println("***");

        Qasquie qasquie = new Qasquie();
        System.out.println(qasquie.getName());
        System.out.println(qasquie.startEngine());
        System.out.println(qasquie.accelarate());
        System.out.println(qasquie.brake());
        System.out.println("***");

        //Example2
        //We want to run the loop 9 times
        for (int i = 1; i < 10; i++){
            Car car = randomCar();
            //Out put
            System.out.println("Car#" + i + " : " + car.getName() + "\n" + "StartEngine: " + car.startEngine() + "\n"
            + "Accelarate: " + car.accelarate()+ "\n" + "Break: " + car.brake() + "\n");
        }

    }
    //Example2
    //extending from a car Class
    public static Car randomCar(){
        //useing (int) to get whole numbers
        int randomNumber = (int) (Math.random()*3) + 1; //+1 to start generating between 1 and 3;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                //equal to Mazda mazda = new Mazda, wich we need to greate if we want to access the Mazda class,
                // and main Car class. Inside main method usally.
                return new Mazda();
            case 2:
                return new Ferrari();

            case 3:
                return new Qasquie();

                default:
                    return null;
        }
    }
}
