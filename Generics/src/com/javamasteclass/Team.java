package com.javamasteclass;

import java.util.ArrayList;
//T -type parameter. Extends any Player
//Can use multible bound but only one can ba a class othet has to be interfaces
public class Team<T extends Player> implements Comparable<Team <T>> {
    private String teamName;
    int played = 0;
    int lost = 0;
    int won = 0;
    int draw= 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName() + " is already in your team");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " piced for team: " + teamName);
            return true;
        }
    }

    public int numberOfPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> oponent, int ourScore, int theirScore){
        String message;

        if (ourScore > theirScore){
            won++;
            message = " beat ";
        } else if (ourScore < theirScore){
            lost++;
            message = " lost to ";
        }else{
            draw++;
            message = " drew with ";
        }
        played++;
        if (oponent != null){
            oponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + draw;
    }

    @Override
    public int compareTo(Team<T> tTeam) {
        if (this.ranking() > tTeam.ranking()){
            return -1;
        }else if (this.ranking() < tTeam.ranking()){
            return 1;
        }else {
            return 0;
        }
        }
    }
