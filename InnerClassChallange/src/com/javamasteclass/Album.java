package com.javamasteclass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songArrayList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songArrayList = new SongList();
    }
    public boolean addSong(String title, double duration){
       return this.songArrayList.add(new Song(title,duration));
    }
    //we pass the track number we want to add to playlist and we allso pass our playlist.
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){

        Song checkedSong = this.songArrayList.findSong(trackNumber);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " +trackNumber);
        return false;
    }
    public boolean addToPlayList(String title,LinkedList<Song> playList){
        Song checkSong = this.songArrayList.findSong(title);
        if (checkSong != null){
            playList.add(checkSong);
            return true;
        }
        System.out.println("Song "+ title + " is not in the album.");
        return false;
    }
    private class SongList{

        private ArrayList<Song> songArrayList;

        public SongList() {
            this.songArrayList = new ArrayList<Song>();
        }

        public boolean add(Song song){
            if (songArrayList.contains(song)){
                return false;
            }
            this.songArrayList.add(song);
            return true;
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

        public Song findSong(int trackNumber){
            int index = trackNumber -1 ;
            if (index > 0 && index  < songArrayList.size()){
                return songArrayList.get(index);
            }
            return null;
        }
    }
}
