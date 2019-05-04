package com.javamasteclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songArrayList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songArrayList = new ArrayList<Song>();
    }
    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            this.songArrayList.add(new Song(title,duration));
            return true;
        }
        return false;
    }
    private Song findSong(String title){
        //knowns as for each command in java.
        // It goes throgh and creates a variable called checkedSong for every entry that in our array list.
        for (Song checkedSong : this.songArrayList){
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }
    //we pass the track number we want to add to playlist and we allso pass our playlist.
    public boolean addToPlayList(int trackNumber, List<Song> playList){
        //useing track number to refrence actual entries for this albums.
        //"trackNumber -1" -tracks start from one
        int index = trackNumber -1;
        //we check if there is a song in that index position for this arraylist, then well add this song object to the playlist.
        if (index >= 0 && index <= this.songArrayList.size()){
          playList.add(this.songArrayList.get(index));
          return true;
        }
        System.out.println("This album does not have a track " +trackNumber);
        return false;
    }
    public boolean addToPlayList(String title, List<Song> playList){
        Song checkSong = findSong(title);
        if (checkSong != null){
            playList.add(checkSong);
            return true;
        }
        System.out.println("Song "+ title + " is not in the album.");
        return false;
    }
}
