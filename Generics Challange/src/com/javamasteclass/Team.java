package com.javamasteclass;

import java.util.ArrayList;

public class Team <T extends Leagues >{
    private String teamName;
    private String leagueName;
    private int points;
    private int won;
    private int lost;
    private int draws;

    private ArrayList<T> teamsInLeague = new ArrayList<>();

    public Team(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public boolean addTeam(T team){
        if (teamsInLeague.contains(team)){
            System.out.println("This team is allready in the league.");
            return false;
        }else{
            teamsInLeague.add(team);
            System.out.println(team.getTeamName() + " added to the: " + this.leagueName);
            return true;
        }
    }

    public int printNumberOfTeams(){
        return this.teamsInLeague.size();
    }

    public void printTeamsInLeagu(){
        for (int i = 0; i < teamsInLeague.size(); i++){
            System.out.println(teamsInLeague.get(i).getTeamName());
        }
    }
    public void getTeam(String name){
        for (int i = 0; i < teamsInLeague.size(); i++){
            if (teamsInLeague.get(i).getTeamName().equals(name)){
                System.out.println(name);
            }else{
                System.out.println(name + " is not in this league!");
            }
        }
    }
}
