package com.javamasteclass;

import java.util.ArrayList;

public class Team<T> implements Comparable<Team<T>> {
    private String teamName;
    private int played;
    private int won;
    private int lost;
    private int draw;

    //constructor
    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }
    //method for matchresult
    //passing the teamclasses objects.
    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        //if for matchresults it increses the given result

        String message;
       if (ourScore > theirScore){
           won++;
           message = " beat ";
       }else if (ourScore == theirScore){
           draw++;
           message = " drew with ";
       }else{
           lost++;
           message = " lost to ";
       }
       //increses the total games played
       played++;
       //if there is an oponent
       if (opponent != null){
           //gives us matchscore for both teams. hosting team name goes first.
           opponent.matchResult(null,theirScore,ourScore);
           System.out.println(teamName + " " + ourScore + " " + opponent.getTeamName()+ " " + theirScore);
       }
    }

    public int ranking(){
        //return teams ranking based on wins and draws
        return (won * 3) + draw;
    }

    //compare to is a inbuilt in interface we are implementing .
    //overrideing the inmplemented method
    @Override
    public int compareTo(Team<T> team) {
        //the current team is higer return -1
        if (this.ranking() > team.ranking()){
            return -1;
            //the current team has les points
        }else if (this.ranking() < team.ranking()){
            //equal
            return 1;
        }else {
            return 0;
        }
    }
}
