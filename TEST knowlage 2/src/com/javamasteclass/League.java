package com.javamasteclass;

import java.util.ArrayList;
import java.util.List;

public class League<T extends Team>{
    private String leagueName;

    private int played;
    private int won;
    private int lost;
    private int draw;

    //creates a new instance of team list with type pramater T
    private List<T> teams = new ArrayList<T>();

    //constructor
    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    //method to add a team to leeagu
    public boolean addTeam(T team){
        if (teams.contains(team)){
            System.out.println("Cant add team is allready in the league list.");
            return false;
        }else{
            teams.add(team);
            return true;
        }
    }
    //method to print teams added to the league
    public void printTeamsInLeague(){
        for (T i : teams){
            System.out.println(i.getTeamName());
        }
    }

    public boolean matchResult(Team homeTeam,Team opponentTeam, int ourScore,int theirScore){
        if (homeTeam == null || opponentTeam == null){
            System.out.println("Match abandoned!");
            return false;
        }
        if (homeTeam != null && opponentTeam != null){
            System.out.println(homeTeam.getTeamName() + ":" + ourScore + " " + opponentTeam.getTeamName()+ ":" + theirScore);
        }if (ourScore > theirScore) {
            won++;
            //System.out.println(won);
        } else if (ourScore < theirScore) {
            lost++;
            //System.out.println(lost);
        } else {
            draw++;
            //System.out.println(draw);
        }
        played++;
        return true;
    }

    public void points(){
        int points = (won * 3) + draw;
        System.out.println("Total of teams points : " + points);
    }

    //Getters
    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getDraw() {
        return draw;
    }
}
