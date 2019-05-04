package com.javamasteclass;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    //its function is tu print praticlar object, the title and duration.
    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
