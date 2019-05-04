package com.javamasteclass;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{

    private String leagueName;
    //ctraing a new array list with type <T> generic type called leagues.
    private ArrayList<T> leagues = new ArrayList();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    //method to add a team to leaguw
    public boolean addTeam(T team){
        if (leagues.contains(team)){
            System.out.println("Cant add team to league, this team: " + team.getTeamName() + " is already registered.");
            return false;
        }else{
            leagues.add(team);
            return true;
        }
    }

    //method to print the league table
    public void printLeagueTable(){
        //useing inbult class of collection and method sort to sort the table from higer to lower.
        Collections.sort(leagues);
        for (T i : leagues){
            System.out.println(i.getTeamName() + " : " + i.rank());
        }
    }
}
