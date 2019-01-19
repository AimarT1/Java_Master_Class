package com.javamasteclass;

import java.util.LinkedList;

public class Album {
    private String albumName;
    private LinkedList<Song> songList ;

    //constructors
    public Album(String albumName) {
        this.albumName = albumName;
        this.songList = new LinkedList<Song>();
    }
    //method to add songs
    public void addNewSong(String newSongTitle, double duration ){
        if (findSong(newSongTitle) == null){
            songList.add(new Song(newSongTitle,duration));
        }else{
            System.out.println("Song with this name is allready in the list.");
        }
    }

    //method to find song from the list.
    private Song findSong(String songName){
        for (int i = 0; i < songList.size();i++){
          Song searchedSong = songList.get(i);
          if (searchedSong.getSongTitle().equals(songName)){
              //returns the searched songs index i position in the list,
              return searchedSong;
          }
        }
        return null;
    }

    //method to print print the album name and the songs in that album
    public void printSongsInTheAlbum(){
        //first i print the number of songs,
        System.out.println(songList.size() +  "# songs in the Album: " + this.albumName);
        for (int i = 0; i < songList.size(); i++){
            System.out.println("Song #" + (i+1) + " " +  songList.get(i).getSongTitle() + " " + songList.get(i).getSongDuration());
        }
        //separator for eyes.
        System.out.println("***");
    }

    //method to add a song to the new LinkedList object playList.
    //we pass String type parameter title, we are searchin and wanting to add. "And LinkedList" class object with
    // <Song> class objects as its parameters and name the parametr playList aka we create a new object of Linkedlist class,
    // and we save the addded songs to playlist object as LinkedList.
    public void addToPlayList(String title,LinkedList<Song> playList){
        //we use the song class to find the song we want to add throuhg our findSong method.
        Song checkedSong = findSong(title);
        if (checkedSong != null){
         //parameter playList.add - add the song to list, if it found songs index position which is equal to the song we want to add.
            playList.add(checkedSong);
            System.out.println("Song sucessfully added to your playlist: " + title);
        }else{
            System.out.println("Song: " + title + " is not on the album");
        }
    }
    //method to print just songList of all songs added.
    public void songList(){
        for (int i = 0; i <songList.size(); i++){
            System.out.println("All songs in Song classes list: " + songList.get(i).getSongTitle());
        }
    }
    //Getters
    public String getAlbumName() {
        return albumName;
    }

    public LinkedList<Song> getSongs() {
        return songList;
    }
}
