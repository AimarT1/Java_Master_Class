package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
	// feilds aka variable

        //Classes
        //we created an object called porche, based on Class car;
        //inizializing with "new" key word.
        Car porche = new Car(4,6,4,"911","3.0 Turbo","White");
        Car mazda = new Car(5,6,4,"6","2.0 D","Black");
        System.out.println("Mazda has an engine of: " + mazda.getEngine());
        System.out.println("Porche has a colour of " + porche.getColour());
        porche.setModel("Carrera");
        System.out.println("Model is: " + porche.getModel());

        //Classes chalange

        BankAccount myAccaount = new BankAccount(1,0,"Shaw Root","cash.ee","555555");
        System.out.println(myAccaount.getBalance());
        myAccaount.depositFunds(100);
        System.out.println(myAccaount.getBalance());
        myAccaount.withdrawFunds(200);
        myAccaount.withdrawFunds(100);
        System.out.println(myAccaount.getBalance());
        myAccaount.depositFunds(10);
        System.out.println(myAccaount.getBalance());
        myAccaount.withdrawFunds(9);
        System.out.println(myAccaount.getBalance());
        System.out.println(myAccaount.getCustomerName());
        BankAccount deafult = new BankAccount();
        BankAccount CP2 = new BankAccount("tim","tim.mail.ee","1234");
        System.out.println(CP2.getEmail());

        //Constructor challange
        VipCustomer aimar = new VipCustomer();
        VipCustomer tim = new VipCustomer("Tim",100_000,"tim@b.com");
        VipCustomer timSon = new VipCustomer("Son","son@.ee");
        System.out.println(tim.getCreditLimit());
        System.out.println(timSon.getCreditLimit());

        //Inheritance
        Animal animal = new Animal(1,5,10,"animal",1);
        Dog dog = new Dog(5,25,"Bear",2,4,1,20,"long silki");
        dog.eat();
        dog.walk();
        dog.run();
        Fish fish = new Fish(1,1,"Fish Boy",2,2,4);
        fish.move(2);

        //this and super
        //super - used to call parent class members.
        //this- used to call curent class members. this is commonly used in constructors and setters.
        //cant use both in static methods
        //this(): are calls. use this() to call constuctor from anotheroverloaded constructor on same class.
        //- can be ised in constuctor, must be first statement. Used with constructor chaning, helps to reduce duplicate code.
        // super() : are calls. To call super() must be first statement in each constuctor,Calls apraent class.

        //method Overrideing -defing amethod in child class that already exists in praent class.(same namem,same arguments)
        //we cant override static methods. Only inherited methods can be overwritten aka only in child classes.

        //Static methods - cant acess instance methods and instance variables directly.
        //They are used for operations not requireing any data from instance of class(from "this").
        //Instance methods - belong to an instance of a class. to use we have to instaniate the class first, usualy by keyword "new".
        //the can acess instane methods and variables directly. and static methods and static variables directly.

        //Static variables - are shared between instances. (aka name raimains static because of Static use)
        //Instance variables - known as fields or member variables.They belong to an instance of a class.

        //Challange
        Mazda mazda6 = new Mazda();
        mazda6.accelerate(50);
        mazda6.changeGear(7);
        mazda6.move(90,11);
        mazda6.changeSpeed(110,12);
        mazda6.steer(1);
        System.out.println(mazda6.getName());
        System.out.println(mazda6.getMilagege());
        System.out.println(mazda6.getCurrentSpeed());
        mazda6.stop();
        System.out.println("********");

        //Take2

        New_Ferrari Ferrari = new New_Ferrari();
        System.out.println(Ferrari.getCurrent_driving_direction());
        System.out.println(Ferrari.getCurrent_speed());
        System.out.println(Ferrari.getSize());
        System.out.println(Ferrari.getColour());
        System.out.println(Ferrari.getEngine());
        System.out.println(Ferrari.getModel());
        Ferrari.changeGears(6);
        Ferrari.changeSpeed(110,"North");
        Ferrari.steering_direction("South");
        System.out.println(Ferrari.getCurrent_driving_direction());
        Ferrari.move(200,"Hollywood");
        Ferrari.accelarate(30);
        Ferrari.steering_direction("Hollywood");
       Ferrari.getCurrent_driving_direction();
        System.out.println(Ferrari.getCurrentGear());
       Ferrari.changeSpeed(90,"Home");
        System.out.println(Ferrari.getCurrent_speed());
        System.out.println(Ferrari.getCurrentGear());
        Ferrari.stop();
        System.out.println(Ferrari.getCurrent_speed());
        System.out.println(Ferrari.getCurrentGear());
        Ferrari.changeSpeed(110,"Old Town");
        Ferrari.accelarate(100);
        System.out.println(Ferrari.getCurrent_speed());
        System.out.println(Ferrari.getCurrentGear());
        Ferrari.stop();
        System.out.println(Ferrari.getCurrent_speed());











    }
}
