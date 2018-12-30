package com.javamasteclass;

public class Main {

    //Objects can share similar characteristic (harddrive, mouse), they can be different
    //Inhertiance - to share common behaviour from another classes.

    public static void main(String[] args) {

     /*   Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long silky");
        dog.eat();
        dog.walk();
        dog.run();
        */
     //Challange

        Mazda mazda = new Mazda();
        mazda.changeGear();
        mazda.move(90);

    }
}

//reclusive call aka it will call it self forever, until memory is fully used on compuer.
// thats why we need super keyword, to call a method with the same name from parent class.
