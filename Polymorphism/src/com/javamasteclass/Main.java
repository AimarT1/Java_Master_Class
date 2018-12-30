package com.javamasteclass;
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        //super - extends the String parameter name from movie class.
        super("Jaws");
    }
    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{

    public IndependenceDay(){
        //super - extends the String parameter name from movie class.
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{

    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable(){
        super("Forgetable");
    }
    //No plot method
}


public class Main {

    public static void main(String[] args) {
	//polymorphism - method/mechanism that allows actions to act differently based on the actual object.
        // polymorphism - we are actualy assing differt functionality depending on the type of object that we created.
        // all the objecta are inherited from the base movie class,
        // but we assing a unice functionality in each of those plot methods for each of those classes.
        //we are going to cickle trogh 10 times
        for (int i = 1; i < 11; i++){
            //to call the method we are going to create a variable,we got our movie in our Movie object.
            Movie movie = randomMovie();
            //creating a new line                   //movie.plot() - is the defination how polymorphism works.
            //movie.plot() - it loking at the object called "movie" the variable we created,
            // that was returned from the randomMovie() method, and the its going to the object a seeng has it gota plot method.
            System.out.println("Movie# " + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }
    //Returning a super class Movie wich we created.
    //useing inheritance
    public static Movie randomMovie(){
        //casting to(int) beacuse random is type double
        //Math.random() * 5 will generate random number between 0 - 4 and thats why we add +1 to generate number between 1 -5.
        int randomNumber = (int) (Math.random() * 5) +1; //ilma +1 error: Exception in thread "main" java.lang.NullPointerException.
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
