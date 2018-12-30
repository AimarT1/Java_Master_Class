package com.javamasteclass;

public class New_Vehicle_2 {
    private String type_name;
    private String size;
    private String current_driving_direction;
    private int current_speed;

    //Constuctors.
    public New_Vehicle_2(String type_name, String size, String current_driving_direction, int current_speed) {
        this.type_name = type_name;
        this.size = size;
        this.current_driving_direction = "In stoped state. ";
        this.current_speed = 0;
    }
    //method for new directions.
    public void steering_direction(String direction){
        this.current_driving_direction = current_driving_direction + direction;
        if (this.current_speed != 0){
            this.current_driving_direction = "New direction." + direction;
        }
        System.out.println("Vehicle.steering_direction() called. Now moving in direction: " + direction + ".");
    }
    //method for moving at speed in some direction
    public void move (int speed, String direction){
        current_driving_direction = direction;
        current_speed = speed;
        this.current_speed = speed;
        System.out.println("Vehicle.move() called. Moving at speed: " + speed + " in direction: " + direction);
    }
    //method for stoping
    public void stop(){
        this.current_speed = 0;
        System.out.println("You pressed breaks, now we are stopping !");

    }

    public String getType_name() {
        return type_name;
    }

    public String getSize() {
        return "Your car is classe in size of: " +  size;
    }

    public String getCurrent_driving_direction() {
        return " Current driving direction is: " + current_driving_direction + " is new given direction . ";
    }

    public int getCurrent_speed() {
        return current_speed;
    }
}
