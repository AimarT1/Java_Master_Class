package com.javamasteclass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    //fields
    private String Artist;
    private String AlbumName;
    //and arraylist of songs.
   // ArrayList<Song> songArrayList;
    //inner class songList extends the array list of songs in the son class
    private SongList songArrayList;

    //constructors
    public Album(String artist, String albumName) {
        Artist = artist;
        AlbumName = albumName;
        this.songArrayList = new SongList();
    }

    //method to add a song to the album.
    public void addSong(String title, double duration){
        // songArrayList - extends from the inner class SongList and we can use the Song classes instance.
        songArrayList.add(new Song(title,duration));
    }

    //Method to print out the songs in its album.
    public Album printSongsInAlbum(){
        System.out.println("Album: " + getAlbumName() + " has #" + songArrayList.getSongArrayList().size() + " songs");
        for (int i = 0; i < songArrayList.getSongArrayList().size();i++){
                System.out.println((i+1) +". " + this.songArrayList.getSongArrayList().get(i).getTitle());
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
        Song searchedSong = songArrayList.findSong(title);
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

    //inner class to hold songs
    private class SongList{

        //field to holds the arrayList of songs
        private ArrayList<Song> songArrayList;

        //constructor
        public SongList() {

            this.songArrayList = new ArrayList<Song>();

        }

        //method to add songs to array list
        //Extending the Song class objects: title, duration and  call paramer song.
        public void add(Song song){
            //checking if the song is allready there
            if (songArrayList.contains(song)){
                System.out.println("Can`t add, this song is already in the album.");
            }else{
                //if not then adding it to songlist.
                songArrayList.add(song);
            }
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

        public ArrayList<Song> getSongArrayList() {
            return songArrayList;
        }
    }
}
