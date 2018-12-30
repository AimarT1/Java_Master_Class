package com.javamasteclass;

public class Dog extends Animal{
    //extra fields common for dog
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Dog constructor
    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        //if we define or give variable a value in "super" wich inherits from animal class, we can delete it from constuctor
        super(1, size, weight, name, 1);
        //initialize
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("Dog chews food");
    }

    @Override
    public void eat() {
        //sice we override the animal.eat method we get the output "Dog.eat() called" then we callmethod chew and it prints the message,
        //lastly it will confirm that inizialized/inherited the animal.eat method.
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        //if u overide the move function of dog it will corectly call dog method
        //we inizialized a value of 5 to dogs speed while walking.
        move(5);
    }
    public void run(){
        System.out.println("Dog.run()called");
        move(10);
    }
}
