package com.javamasteclass;

class Movie{
    //field for movie name.
    private String name;
//constructor
    public Movie(String name) {
        this.name = name;
    }
    //method
    public String plot(){
        return "No plot here";
    }
//getter
    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    //created constructor right away.
    //No parameters needed we difine the value of it in the super method.
    public Jaws() {
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people.";
    }
}

class IndependendsDay extends Movie {
    public IndependendsDay() {
        super("IndependendsDay");
    }
// same as typing manualy
    @Override
    public String plot() {
        return "Alians attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class PersonOfInterest extends Movie {
    public PersonOfInterest() {
        super("PersonOfInterest");
    }

    @Override
    public String plot() {
        return "Saveing ordinary people, who government say are Irrelavant.";
    }
}

class NoMOVIE extends Movie{
    public NoMOVIE() {
        super("NoMOVIE");
    }
    //no plot
}

//AKA THIS public class Polymorphism ACTS AS A MAIN CLASS HERE!
public class Polymorphism {
    //main to run the code
    public static void main(String[] args) {
        //creating a for loop
        //we are going to run through the loop ten times, and it will asigne a random movie to it
        for (int i = 1; i<11; i++){
            Movie movie = randomMovie();
            //this little line "movie.plot()" is how really the polymorphism works .
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }


    }

    //method part of the main class
    //We are returning a super class Movie, beacuse all these cöasses inherit from movie. IS A RELATIONSHIP.
    public static Movie randomMovie(){
        //we added +1 to return a number between 1 and 5 . Just multping by it will give 0-4.
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated was: " +randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependendsDay();
            case 3:
                return new MazeRunner();
            case 4:
                return  new PersonOfInterest();
            case 5:
                return new NoMOVIE();
        }
        return null;
    }
}
