package com.javamasteclass;

//to inherit some type of behavior from another class we use "extends" method and the class name you wanto inherite from.
//
public class Dog extends Animal {
    //in "private" we define the common characteristis that belong to a dog.
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    // we inherit basic characteristick of an animal from "Animal" class.
    //You need to generate a constuctor(like below)
    public Dog(String name,int size, int weight, int eyes,int legs, int tail,int teeth,String coat) {
        //super- means to call a constractor to a class we are extending from.
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //dog chew its food, we can override
    // private method
    private void chew(){
        System.out.println("Dog.chew() called");
    }
    //overrides the eat method withe specific way for dag, dog chews.
    // first it calls the eat method in dog class,
    // then it calss (private) chew method in dog class,
    // last it call the eat method in Animal class, cause we use super.eat()
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        //super - class for current class is animal, it will go to animal class, look the eat method and calls that.
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
