package com.javamasteclass;

public abstract class Leagues {
    //Filed
    private String teamName;

    //constuctor
    public Leagues(String teamName) {
        this.teamName = teamName;
    }

    //getter
    public String getTeamName() {
        return teamName;
    }
}
