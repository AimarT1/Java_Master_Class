package com.javamasteclass;

public class Song {
    private String songTitle;
    private double songDuration;

    //constructors
    public Song(String songTitle, double songDuration) {
        this.songTitle = songTitle;
        this.songDuration = songDuration;
    }

    //getters
    public String getSongTitle() {
        return songTitle;
    }

    public double getSongDuration() {
        return songDuration;
    }
}
