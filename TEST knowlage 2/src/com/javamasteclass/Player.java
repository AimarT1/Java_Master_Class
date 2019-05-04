package com.javamasteclass;

public class Player {
    //fields
    private String playerName;
    private String playerPosition;
    private int playerNumber;

    //constructor
    public Player(String playerName, String playerPosition, int playerNumber) {
        this.playerName = playerName;
        this.playerPosition = playerPosition;
        this.playerNumber = playerNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    //* Class {@code Object} is the root of the class hierarchy.
    // * Every class has {@code Object} as a superclass. All objects,
    // * including arrays, implement the methods of this class.
    @Override
    public String toString() {
        return this.playerName + ": " + playerPosition + " nr:" + playerNumber;
    }
}
