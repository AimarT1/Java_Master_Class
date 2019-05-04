package com.javamasteclass;

import java.util.LinkedList;
import java.util.List;

public class Team {
    //fields
    private String teamName;
    List<Player> playerList;

    public Team(String teamName) {
        this.teamName = teamName;
        this.playerList = new LinkedList<Player>();
    }

    //extends the player class object
    private Player findPlayer(String playerName) {
        //knowns as for each command in java.
        // It goes throgh and creates a variable called playerToSearch for every entry that in our array list.
        for (Player playerToSearch : playerList) {
            if (playerToSearch.getPlayerName().equals(playerName)) {
                return playerToSearch;
            }
        }
        return null;
    }

    //method to find the index position of player number and return the players shirt number
    private int findNumbers(int number) {
        for (int i = 0; i < playerList.size(); i++) {
            Player numberToFind = playerList.get(i);
            if (numberToFind.getPlayerNumber() == number) {
                return numberToFind.getPlayerNumber();
            }
        }
        return -1;
    }

    //method to add player.With 2 checks for name and number.
    public void addPlayerToTeam(String playerName, String playerPosition, int playerNumber) {
        int searchedNumber = findNumbers(playerNumber);
        if (findPlayer(playerName) != null) {
            System.out.println("Player is all ready in the team, cant add");
        } else if (searchedNumber == playerNumber) {
            System.out.println("Cant add player number is allready taken chose a differnt number!");
        } else {
            playerList.add(new Player(playerName, playerPosition, playerNumber));
            System.out.println("Success! Player: " + playerName + " added to team.");
        }
    }

    public Team printTeam() {
        for (int i = 0; i < playerList.size(); i++) {
            System.out.println((i + 1) + ". " + playerList.get(i).getPlayerName() +
                    " Postion: " + playerList.get(i).getPlayerPosition() + " nr: " + playerList.get(i).getPlayerNumber());
        }
        if (playerList.size() == 0) {
            System.out.println("No players in your team.");
        }
        return null;
    }

    //method to add players to matchsquad
    public void addPlayerToMatchSquad(LinkedList<Player> players, int playerNumber) {
        for (int i = 0; i < playerList.size(); i++) {
            Player playerToAdd = playerList.get(i);
            if (players.size() == 11){
                //Emty does nothing, if sout then print trough the size of list, but i dont want that.
                //But message would be good if squad complete!
            } else if (playerToAdd.getPlayerNumber() == playerNumber) {
                players.add(playerToAdd);
                System.out.println("Player: " + playerToAdd.getPlayerName() + " added to match squad!");
            }
        }
        if (findNumbers(playerNumber) != playerNumber){
            System.out.println("Player: " + playerNumber + " with this number is not in your team!");
        }else if (players.size() == 11){
            System.out.println("Match squad full! Sit on the bench!");
        }
    }

    public String getTeamName() {
        return teamName;
    }

}
