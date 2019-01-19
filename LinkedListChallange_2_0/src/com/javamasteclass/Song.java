package com.javamasteclass;

public class Song {

    //filelds
    private String Title;
    private double Duration;

    //constructor
    public Song(String title, double duration) {
        Title = title;
        Duration = duration;
    }

    //getter for title
    public String getTitle() {
        return Title;
    }

    //overloaded method to get both when printing song list.
    @Override
    public String toString() {
        return this.getTitle() + " :" + this.Duration;
    }
}
