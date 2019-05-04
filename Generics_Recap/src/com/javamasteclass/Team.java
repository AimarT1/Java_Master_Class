package com.javamasteclass;

import javax.naming.Name;
import java.util.ArrayList;
//we used the <T> - to use the type pramater
//extend the player class types

/**
 * Compares this object with the specified object for order.  Returns a
 * negative integer, zero, or a positive integer as this object is less
 * than, equal to, or greater than the specified object.
 */
//compare to is a inbuilt in interface we are implementing .
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String teamName;
    private int played;
    private int won;
    private int lost;
    private int draw;

    //creating an arry list instnce of Player with member parameter aka members of a team.
    //we used the <T> - to use the type pramater
    private ArrayList<T> members = new ArrayList<>();

    //constructor
    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    //method to add player. extends the Player class object
    //we used the <T> - to use the type pramater. We are chaning the type so its more generic and will work for any type of player.
    public boolean addPlayer(T player){
        //if the arry list of players allready has that player not adding.
        if (members.contains(player)){
            //since <T> extend from player we dont have to cast anymore.
            System.out.println(player.getName() + " is allready in the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.teamName);
            return true;
        }
    }

    //method to print the number of players in the array list
    public int numberOfPlayers(){
        return this.members.size();
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
           //gives us matchscore for both teams.
           opponent.matchResult(null,theirScore,ourScore);
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
