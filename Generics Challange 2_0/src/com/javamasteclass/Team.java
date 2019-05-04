package com.javamasteclass;

import java.util.ArrayList;
//class called Team with a type pramater T- generic type. implement built in interface class Comparable.
public class Team <T> implements Comparable<Team <T>> {
    //fields
    private String teamName;
    private int played;
    private int won;
    private int lost;
    private int draw;

    //ArrayList for teams.<T> -generic type
    public ArrayList<T> teams = new ArrayList<T>();

    //constructor
    public Team(String teamName) {
        this.teamName = teamName;
    }

    //getter
    public String getTeamName() {
        return teamName;
    }

    //method for matchresult
    public void matchresult(Team<T> opponent, int ourScore, int theirScore) {
        if (opponent != null) {
            opponent.matchresult(null, theirScore, ourScore);
            System.out.println(teamName + ":" + ourScore + " " + opponent.getTeamName() + ":" + theirScore);
        }
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore < theirScore) {
            lost++;
        } else {
            draw++;
        }
        played++;
    }

    //method to return teams rank.
    public int rank() {
        return (won * 3) + draw;
    }

    //compare to is a inbuilt in interface we are implementing .
    //overrideing the inmplemented method
    @Override
    public int compareTo(Team<T> team) {
        //current team ranks higer
        if (this.rank() > team.rank()) {
            return -1;
            //the current team has les points
        } else if (this.rank() < team.rank()) {
            return 1;
            //egual
        } else {
            return 0;
        }
    }
}
