package com.javamasteclass;

//Abstarct - class can have member variables that are inherited, something that cant be done in interface.
//Methods of abstact class can have any visibility (private,protected,..)
// Abstract classes can have defined methods, methods with implementation

//Interface - can have variables, but they are all public static final variables aka constnt variables,
// that never change in static scope. They have to be static cause non-static variables require instance,
// but you cant instansiate interface. Intefaces cant have constructors but abstract classes can.
//all methods of interface are automaticlly public
//no code in inteface.

public class Main {

    public static void main(String[] args) {

        //creating a new instance of the dog
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breath();

        //Bird bird = new Bird("Leevike");
        //bird.eat();
        //bird.breath();
        Parrot parrot = new Parrot("lEEVIKE");
        parrot.eat();
        parrot.breath();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

        //we need to consider the relation ships: is a/ has a / or can.
        //is -makes sence to inherit from a class.
        //interface for implemaentaion. exp bat vs bird - both can fly but bat is not a bird.
    }
}
