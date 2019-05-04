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
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        //before we made the bird class abstract
       // Bird bird = new Bird("Leevike");
        //bird.breathe();
        //bird.eat();

        Parrot parrot = new Parrot("Leevike");
        parrot.fly();
        parrot.breathe();
        parrot.eat();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}
