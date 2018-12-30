package com.javamasteclass;

public class New_Car_2  extends New_Vehicle_2{
    private String model;
    private String engine;
    private int numberOfgears;
    private boolean isManual;
    private String colour;

    //gear state for driving
    private int currentGear;
//constuctors
    public New_Car_2(String type_name, String size, String current_driving_direction, int current_speed,
                         String model, String engine, int numberOfgears, boolean isManual, String colour,int currentGear) {
        super(type_name, size, current_driving_direction, current_speed);
        this.model = model;
        this.engine = engine;
        this.numberOfgears = numberOfgears;
        this.isManual = isManual;
        this.colour = colour;
        this.currentGear = 0;
    }
    //method for gear chaning
    public void changeGears(int currentGear){
        this.currentGear = getCurrentGear();
        System.out.println("Car.changegears() called. Current gear is set to 0. Changeing gear to: "  + currentGear);
    }
    //method for speed changge
    public void changeSpeed(int speed, String direction){
        System.out.println("Car.changeSpeed() called. Chaning speed to: " + speed + " and direction to: "  +direction);
        move(speed,direction);
    }
    //method for accelateing speed also chanenig gears acordingly
    public void accelarate(int accelaration_Rate){
        //muutuja uue kiiruse arvutamiseks.
        int newSpeed = getCurrent_speed() + accelaration_Rate;
        if (newSpeed == 0){
            stop();
            changeGears(0);
        }else if (newSpeed > 0 && newSpeed <= 20){
            changeGears(1);
        }else if (newSpeed > 20 && newSpeed <= 40){
            changeGears(2);
        }else if (newSpeed > 40 && newSpeed <= 50){
            changeGears(3);
        }else if (newSpeed > 50 && newSpeed <= 70){
            changeGears(4);
        }else if (newSpeed > 70 && newSpeed <= 90){
            changeGears(5);
        }else if (newSpeed > 90 && newSpeed <= 120){
            changeGears(6);
        }else if (newSpeed > 120 && newSpeed <= 200){
            changeGears(7);
        }
        else{
            changeGears(8);
        }
        //kui kiirus suurem 0ist, siis muuda kiirus ja direction.
        if (newSpeed > 0 && newSpeed < 250){
            changeSpeed(newSpeed,getCurrent_driving_direction());
        }else {
            System.out.println("Current speed is: "+ getCurrent_speed() + ". Your speed is over 250 km/h. Not accelarating further! Better buckle up!" + getCurrent_driving_direction());
        }

    }

    public String getModel() {
        return "Your car model is: " + model;
    }

    public String getEngine() {
        return "Your car has engine: " + engine;
    }

    public int getNumberOfgears() {
        return numberOfgears;
    }

    public boolean isManual() {
        return isManual;
    }

    public String getColour() {
        return "Your car is beaudiful " + colour + " colour";
    }

    public int getCurrentGear() {
        //checking and chaning gears back acordingly to speed
        if (getCurrent_speed() == 0){
            currentGear = 0;
        }else if (getCurrent_speed() <= 20 ){
            currentGear = 1;
        }else if (getCurrent_speed() > 20 && getCurrent_speed() <= 40 ){
            currentGear = 2;
        }else if (getCurrent_speed()> 40 && getCurrent_speed()<= 50){
            currentGear = 3;
        }else if (getCurrent_speed() > 50 && getCurrent_speed() <= 70){
            currentGear = 4;
        }else if (getCurrent_speed() > 70 && getCurrent_speed() <= 90){
            currentGear = 5;
        }else if (getCurrent_speed() > 90 && getCurrent_speed() <= 120){
            currentGear = 6;
        }else if (getCurrent_speed() > 120 && getCurrent_speed() <= 200){
            currentGear = 7;
        }else {
            currentGear = 8;
        }
        return currentGear;
    }
}
