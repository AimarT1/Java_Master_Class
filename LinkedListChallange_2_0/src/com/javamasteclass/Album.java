package com.javamasteclass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    //fields
    private String Artist;
    private String AlbumName;
    //and arraylist of songs.
    ArrayList<Song> songArrayList;

    //constructors
    public Album(String artist, String albumName) {
        Artist = artist;
        AlbumName = albumName;
        this.songArrayList = new ArrayList<Song>();
    }

    //extending the song class object.
    public Song findSong(String title){
        //knowns as for each command in java.
        // It goes throgh and creates a variable called serachedSong for every entry that in our array list.
        for (Song searchedSong : this.songArrayList){
           if (searchedSong.getTitle().equals(title)){
               return searchedSong;
           }
        }
        return null;
    }

    //method to add a song to the album.
    public void addSong(String title, double duration){
        if (findSong(title) != null){
            //prints error message if cant add, otherwise it wont show any message.
            System.out.println("Can`t add, this song is already in the album.");
        }else{
            this.songArrayList.add(new Song(title,duration));
        }
    }

    //Method to print out the songs in its album.
    public Album printSongsInAlbum(){
        System.out.println("Album: " + getAlbumName() + " has #" + songArrayList.size() + " songs");
        for (int i = 0; i < songArrayList.size();i++){
                System.out.println((i+1) +". " + this.songArrayList.get(i).getTitle());
        }
        //for readability.
        System.out.println("******");
        return null;
    }

//todo: Optionaly you can add an additionl check, to not allow dublicates to playlist, if you want, but then you have to also check,
//todo: if its from another artsist with same song name, than allow, and if same name but different leght allow.
//todo: But in real life you can add them to playlist as much as you want.

    //method to add a song from your songlist/albums to your playlist wich is a linked list.
    public void addSongsToPlaylist(String title, LinkedList<Song> playList){
        Song searchedSong = findSong(title);
        if (searchedSong != null){
            playList.add(searchedSong);
        }else{
            System.out.println("This song: "  + title + " is not in the album.");
        }
    }
    //getters
    public String getArtist() {
        return Artist;
    }

    public String getAlbumName() {
        return AlbumName;
    }

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }
}
