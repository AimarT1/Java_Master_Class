package com.javamasteclass;

import java.util.*;

public class Main {

    //Scanner for input.
    private static Scanner scanner = new Scanner(System.in);
    //And albums as an array list.
    private static ArrayList<Album> albumArrayList = new ArrayList<Album>();

    public static void main(String[] args) {

        //creating a new album instance.
        Album TreySongz = new Album("Trey Songz","Chapter V");
        TreySongz.addSong("Heart Attack",03.53);
        TreySongz.addSong("Bad Decisions",04.34);
        TreySongz.addSong("Simply Amazing",03.59);
        TreySongz.addSong("Panty Wetter",03.50);
        //adding the album to the array list
        albumArrayList.add(TreySongz);

        Album Usher = new Album("Usher", "Here I Stand");
        Usher.addSong("Appetite",03.58);
        Usher.addSong("Here I Stand",04.11);
        Usher.addSong("Moving Mountains",04.58);
        albumArrayList.add(Usher);

        Album AugustAlsina = new Album("August Alsina","Testimony");
        AugustAlsina.addSong("Testify",04.02);
        AugustAlsina.addSong("Right There",03.37);
        AugustAlsina.addSong("You Deserve",04.02);
        AugustAlsina.addSong("Ah Yeah",02.35);
        AugustAlsina.addSong("No Love",04.03);
        AugustAlsina.addSong("Kissin On My Tattoos",04.11);
        albumArrayList.add(AugustAlsina);

        //Printing songs in ALBUMS:
        TreySongz.printSongsInAlbum();
        AugustAlsina.printSongsInAlbum();
        Usher.printSongsInAlbum();

        printAlbums();

        //new instance of LinkedList, with Song class object, called playlist.
        LinkedList<Song> playList = new LinkedList<Song>();
        TreySongz.addSongsToPlaylist("Heart Attack",playList);
        TreySongz.addSongsToPlaylist("Simply Amazing",playList);
        Usher.addSongsToPlaylist("Appetite",playList);
        Usher.addSongsToPlaylist("Moving Mountains",playList);
        AugustAlsina.addSongsToPlaylist("Kissin On My Tattoos",playList);
        AugustAlsina.addSongsToPlaylist("You Deserve",playList);
        AugustAlsina.addSongsToPlaylist("Ah Yeah",playList);
        AugustAlsina.addSongsToPlaylist("Right There",playList);
        AugustAlsina.addSongsToPlaylist("Simply Amazing",playList);

        // calling the printPlayList method and passing my playList as a parameter.
        //Prints the songs ive added to my play list.
        printPlayList(playList);

        //calling the playPlaylist method and passing my playList as a parameter.
        //Gives me options to play.
        playPlayList(playList);
    }

    //method to print the albus in your array list.
    private static void printAlbums(){
        System.out.println("You have: " + albumArrayList.size() + " albums in your album array list.");
        for (int i = 0; i < albumArrayList.size(); i++){
            System.out.println(albumArrayList.get(i).getAlbumName());
        }
        //for readability.
        System.out.println("******");
    }

    //method to print the songs ive added to playList
    private static void printPlayList(LinkedList<Song> playList){
        //becuse we are not going backward and forwars we dont need to use listiterator. perfect for looping throgh once.
        Iterator<Song> iterator = playList.iterator();
       //while(true) that element that is in this linked list is pointing to another entry/record.
        while (iterator.hasNext()){
            //while there is another song to be played..
            System.out.println("Now listening to: " + iterator.next());
        }
        System.out.println("=============");
    }

    //method to play the playList, and go through and select options.
    private static void playPlayList(LinkedList<Song> playList){

        //variables for menu and flexibillity in playList.
        boolean quit = false;
        boolean forward = true;

        //Useing the listiterator to go throu the playList
        ListIterator<Song> songListIterator = playList.listIterator();

        //check if there is any song in playlist.
        if (playList.isEmpty()){
            System.out.println("No songs in your playList.");
        }else{
            System.out.println("Now playing: " + songListIterator.next());
            printMenu();
        }
        while (!quit){
            //variable for menu options.
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 0:
                    quit = true;
                    break;
                case 1:
                    //first i add a check that forward is false, but if songListIterator.hasNext() has a next entry/song to move
                    //then i set forward true.
                    if (!forward){
                        if (songListIterator.hasNext()){
                            songListIterator.next();
                        }
                        forward = true;
                    }
                    if (songListIterator.hasNext()){
                        System.out.println("Now listening to: " + songListIterator.next());
                    }else{
                        System.out.println("Reached the end of your playList.");
                        forward = false;
                    }
                    break;
                case 2:
             //first i add a check that forward is true, but if songListIterator.hasPrevious() has a previous entry/song to move
             //then i set forward false, and i move backwwards in the list
                    if (forward){
                        if (songListIterator.hasPrevious()){
                            songListIterator.previous();
                        }
                        forward = false;
                    }
                    if (songListIterator.hasPrevious()){
                        System.out.println("No listening to: " + songListIterator.previous());
                    }else{
                        System.out.println("You are at the start of the list.");
                        forward = true;
                    }
                    break;
                case 3:
                    //now i set forward tru, but i check previous,and set forward to false.Then i check next and set it true.
                    //basicly im creating a loop, to stay put and replay.
                    if (forward){
                        if (songListIterator.hasPrevious()){
                            System.out.println("Now replaying: " + songListIterator.previous());
                            forward = false;
                        }else{
                            System.out.println("You are at the start of the list.");
                        }
                    } else {
                        if (songListIterator.hasNext()){
                            System.out.println("Now replaying: " + songListIterator.next());
                            forward = true;
                        }else{
                            System.out.println("Reached the end of your playList.");
                        }
                    }
                    break;
                case 4:
                    //first i check if there is anything in playList.
                    if (playList.size() != 0){
                        //if there is i remove and move on to listening to next or previous song.
                        songListIterator.remove();
                        if (songListIterator.hasNext()){
                            System.out.println("Now listening to: " + songListIterator.next());
                        }else if (songListIterator.hasPrevious()){
                            System.out.println("No listening to: " + songListIterator.previous());
                        }
                    }else{
                        System.out.println("Play list is empty.");
                    }
                    break;
                case 5:
                    printPlayList(playList);
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    //method to print menu.
    private static void printMenu(){
        //for readabilliry
        System.out.println(" ");
        System.out.println("Menu options available:");
        System.out.println("0 - Quit playList. ");
        System.out.println("1 - Next song.");
        System.out.println("2 - Previous song.");
        System.out.println("3 - Replay song");
        System.out.println("4 - Remove song.");
        System.out.println("5 - Print playList.");
        System.out.println("6 - Print menu options.");
    }
}
