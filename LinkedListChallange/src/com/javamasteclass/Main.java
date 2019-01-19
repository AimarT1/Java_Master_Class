package com.javamasteclass;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albumArrayList = new ArrayList<Album>();

    public static void main(String[] args) {
        //adding new albums.Creating new album objects.
        //Creating an arrayList of albums.
        Album GoodKidMadCity = new Album("Good Kid Mad City");
        GoodKidMadCity.addNewSong("Compton",04.48);
        GoodKidMadCity.addNewSong("Swimming pools",05.13);
        GoodKidMadCity.addNewSong("mAAd City",05.50);
        //adding album to album arrayList
        albumArrayList.add(GoodKidMadCity);
        GoodKidMadCity.printSongsInTheAlbum();

        Album MindOfMine = new Album("Mind of mine");
        MindOfMine.addNewSong("She",03.10);
        MindOfMine.addNewSong("Pillow talk",03.22);
        MindOfMine.addNewSong("Golden",03.14);
        MindOfMine.addNewSong("It´s you", 03.46);
        albumArrayList.add(MindOfMine);
        MindOfMine.printSongsInTheAlbum();

        Album Hasley = new Album("Hoples fountain kingdom");
        Hasley.addNewSong("100 Letters",03.30);
        Hasley.addNewSong("Heaven in Hiding",03.27);
        Hasley.addNewSong("Eyes Closed",03.22);
        albumArrayList.add(Hasley);
        Hasley.printSongsInTheAlbum();

        printAlbums();
        System.out.println("***");
        printSongList();
        System.out.println("***");

        //Creading the playlist, LinkedLIST wich consists of Song we have stored in the Song class,
        // but created inside the Album objects witch extends the song class objects.
        LinkedList<Song> playList = new LinkedList<Song>();
        //first we pass the album object whiches object we want to add to the playlist, and then the songname,
        // and the Linked list object playlist, wich is the new intsance we created, and its adds the songs to the list.
        //if the songs we pass are in those albums, wich we check in the "album" class method addToPlayList.
        Hasley.addToPlayList("100 Letters",playList);
        Hasley.addToPlayList("Heaven in Hiding",playList);
        MindOfMine.addToPlayList("She",playList);
        MindOfMine.addToPlayList("Golden",playList);
        GoodKidMadCity.addToPlayList("Compton",playList);
        Hasley.addToPlayList("Golden",playList);
        //we call the playPalyList method and pass the linkedlIST: playList as an object/parameter/variable.
        playPlayList(playList);
    }
    //method to print albums in the list
    private static void printAlbums(){
        System.out.println("You have: "  + albumArrayList.size() + " albums in your album list." );
        for (int i = 0; i < albumArrayList.size(); i++){
            System.out.println("You have album: "  + albumArrayList.get(i).getAlbumName());
        }
    }
    //method to print all the song in songlist from albums.
    public static void printSongList(){
        for (int i = 0; i < albumArrayList.size(); i++){
            albumArrayList.get(i).songList();
        }
    }
    // method to to play the new playlist. Prameter we pass is LinkedList of <Song> objeccts wich is our playList
    private static void playPlayList(LinkedList<Song> playList){
        boolean quit = false;
        boolean goingForward = true;
        //fisr did the playplaylist method and ListIterator-->
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0){
            System.out.println("No songs in play list");
        }else{
            System.out.println("Now playing: " + listIterator.next().getSongTitle() + " " + listIterator.next().getSongDuration());
            printMenu();
        }
        //<--
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().getSongTitle());
                    }else{
                        System.out.println("We have reached the end of the playList");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing: " + listIterator.previous().getSongTitle());
                    }else{
                        System.out.println("We are at the start of the playing list.");
                        goingForward = true;
                    }
                    break;
                case 3:
                  if (goingForward){
                      if (listIterator.hasPrevious()){
                          System.out.println("Now replaying: " + listIterator.previous().getSongTitle());
                          goingForward = false;
                      }else{
                          System.out.println("We are at the start of the playing list.");
                      }
                  }else {
                      if (listIterator.hasNext()){
                          System.out.println("Now replaying: " + listIterator.next().getSongTitle());
                          goingForward = true;
                      }else{
                          System.out.println("We have reached the end of the playList");
                      }
                  }
                    break;
                case 4:
                    if (playList.size()>0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing: " + listIterator.next().getSongTitle());
                        }else if (listIterator.hasPrevious()){
                            System.out.println("Now playing: " + listIterator.previous().getSongTitle());
                        }
                    }
                    break;
                case 5:
                    printPlayList(playList);
                    break;
                case 6:
                    printMenu();
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions: ");
        System.out.println("0 - To guit.");
        System.out.println("1 - Next song.");
        System.out.println("2 - Previous song.");
        System.out.println("3 - Replay song.");
        System.out.println("4 - Remove song.");
        System.out.println("5 - Print PlayList.");
        System.out.println("6 - Print menu options.");
    }
    private static void printPlayList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=================");
        while (iterator.hasNext()){
            System.out.println(iterator.next().getSongTitle());
        }
        System.out.println("=================");
    }
}
