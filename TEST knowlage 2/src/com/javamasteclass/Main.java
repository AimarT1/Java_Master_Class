package com.javamasteclass;


import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    //creating an new instnce of team class as an arrayList.
    private static List<Team> teams = new ArrayList<Team>();

    public static void main(String[] args) {

        Team fcElva = new Team("Fc Elva");
        fcElva.addPlayerToTeam("Aimar Tamm", "GK", 1);
        fcElva.addPlayerToTeam("Ats Joandi", "CM/AM/F", 9);
        fcElva.addPlayerToTeam("Jürgen Kuresoo", "LW", 17);
        fcElva.addPlayerToTeam("Mihkel Kuresoo", "LB/RB", 2);
        fcElva.addPlayerToTeam("Karl Bussov", "LB/DM", 4);
        fcElva.addPlayerToTeam("Veiko Kütt", "CB", 3);
        fcElva.addPlayerToTeam("Veiko Haan", "CB", 34);
        fcElva.addPlayerToTeam("Kaarel Tinn", "CM/DM", 8);
        fcElva.addPlayerToTeam("Kaarel Tani", "AM", 10);
        fcElva.addPlayerToTeam("Raido Kuus", "RB", 6);
        fcElva.addPlayerToTeam("Rando Kuus", "F/S", 11);
        fcElva.addPlayerToTeam("Arvo Käkk", "GK", 12);
        fcElva.addPlayerToTeam("Tarmo Kerro", "RW", 16);
        fcElva.addPlayerToTeam("Martin Thomson", "CB", 14);
        teams.add(fcElva);

        fcElva.printTeam();
        fcElva.addPlayerToTeam("Nabil Fecir", "CM/AM", 10);
        fcElva.addPlayerToTeam("Nabil Fecir", "CM/AM", 20);
        fcElva.addPlayerToTeam("Nabil Fecir", "CM/AM", 10);
        fcElva.addPlayerToTeam("Veiko Maidla", "S", 21);
        fcElva.addPlayerToTeam("Paul Frei", "S/RW", 13);
        teams.add(fcElva);
        fcElva.printTeam();
        System.out.println("*******");

        //adding players to match squad
        LinkedList<Player> playersList = new LinkedList<Player>();
        fcElva.addPlayerToMatchSquad(playersList, 1);
        fcElva.addPlayerToMatchSquad(playersList, 3);
        fcElva.addPlayerToMatchSquad(playersList, 14);
        fcElva.addPlayerToMatchSquad(playersList, 6);
        fcElva.addPlayerToMatchSquad(playersList, 2);
        fcElva.addPlayerToMatchSquad(playersList, 8);
        fcElva.addPlayerToMatchSquad(playersList, 16);
        fcElva.addPlayerToMatchSquad(playersList, 17);
        fcElva.addPlayerToMatchSquad(playersList, 9);
        fcElva.addPlayerToMatchSquad(playersList, 10);
        fcElva.addPlayerToMatchSquad(playersList, 13);
        fcElva.addPlayerToMatchSquad(playersList, 90);
        fcElva.addPlayerToMatchSquad(playersList, 21);
        fcElva.addPlayerToMatchSquad(playersList,34);
        fcElva.addPlayerToMatchSquad(playersList,57);

        printSquad(playersList);
       // playSquad(playersList);

        //league class
        League<Team> footballLeague = new League<Team>("Winter Ligue");
        footballLeague.addTeam(fcElva);
        //Creating a new team from team class object. Gives me more flexibilty.exp: add players..
        Team fcFlora = new Team("Fc Flora");
        Team tammeka = new Team("Tartu Tammeka");
        Team pärnuJK = new Team("Pärnu JK");
        Team paideLM = new Team("Paide LM");
        //adding created team to the league
        footballLeague.addTeam(fcFlora);
        footballLeague.addTeam(tammeka);
        footballLeague.addTeam(pärnuJK);
        footballLeague.addTeam(paideLM);

        footballLeague.printTeamsInLeague();
        System.out.println("*****");

        footballLeague.matchResult(fcFlora,fcElva,2,0);
        footballLeague.matchResult(null,fcElva,0,0);
        footballLeague.matchResult(fcFlora,tammeka,2,0);
        footballLeague.matchResult(fcFlora,pärnuJK,4,0);
        footballLeague.matchResult(fcFlora,paideLM,2,5);

        footballLeague.matchResult(fcElva,tammeka,2,2);
        footballLeague.matchResult(fcElva,pärnuJK,1,0);
        footballLeague.matchResult(fcElva,paideLM,0,3);

        footballLeague.matchResult(tammeka,pärnuJK,3,0);
        footballLeague.matchResult(tammeka,paideLM,0,0);

        footballLeague.matchResult(paideLM,pärnuJK,5,0);
        footballLeague.points();

    }

    //method to print the selected squad
    private static void printSquad(LinkedList<Player> matchSquad) {
        Iterator<Player> playerIterator = matchSquad.iterator();
        System.out.println("==========");
        System.out.println("Your starting 11 for the game:");
        while (playerIterator.hasNext()) {
            System.out.println(playerIterator.next().getPlayerName());
        }
        System.out.println("==========");
    }

    private static void printMenu() {
        System.out.println("Available actions: ");
        System.out.println("0 - To guit.");
        System.out.println("1 - Next player");
        System.out.println("2 - Previous player.");
        System.out.println("3 - Print Match Squad.");
        System.out.println("4 - Print menu options.");
    }

    private static void playSquad(LinkedList<Player> matchSquad) {
        boolean quit = false;
        boolean forvard = true;

        ListIterator<Player> listIterator = matchSquad.listIterator();
        if (matchSquad.size() == 0) {
            System.out.println("No players in your squad");
        } else {
            System.out.println("1st Player: " + listIterator.next().getPlayerName() + " " + listIterator.previous().getPlayerPosition() +
                    " " + listIterator.next().getPlayerNumber());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!forvard) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forvard = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Player: " + listIterator.next().getPlayerName() + " " + listIterator.previous().getPlayerPosition() +
                                " " + listIterator.next().getPlayerNumber());
                    } else {
                        System.out.println("We have reached the end of the squad List");
                        forvard = false;
                    }
                    break;

                case 2:
                    if (forvard){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forvard = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Player: " + listIterator.previous().getPlayerName() + " " + listIterator.next().getPlayerPosition() +
                                " " + listIterator.previous().getPlayerNumber());
                    }else {
                        System.out.println("Back at the start of the squad list.");
                        forvard = true;
                    }
                    break;

                case 3:
                    printSquad(matchSquad);
                    break;
                case 4:
                    printMenu();
            }
        }
    }
}
