package com.javamasteclass;

import java.util.ArrayList;
import java.util.Collections;

public class Generics_pt2 {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        //we specify the type of player
        Team<FootballPlayer> adalaidCrows = new Team<>("Adalaid Crows");
        adalaidCrows.addPlayer(joe);
        System.out.println(adalaidCrows.numberOfPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Cubs");
        baseballTeam.addPlayer(pat);
        System.out.println(baseballTeam.numberOfPlayers());

        Team<SoccerPlayer> soccerTeam = new Team<>("United FC");
        soccerTeam.addPlayer(beckham);
        System.out.println(soccerTeam.numberOfPlayers());

        //just a function to add multiple player at once to a certain team.
        String data = "Lukaku Rashford Pogba Laccasete Kahn";
        String[] players = data.split(" ");
        for (String i : players){
            soccerTeam.addPlayer(new SoccerPlayer(i));
        }
        System.out.println(soccerTeam.numberOfPlayers());

        //team results
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adalaidCrows, 3, 8);

        adalaidCrows.matchResult(fremantle, 2, 1);

        System.out.println("Rankings");
        System.out.println(adalaidCrows.getTeamName() + ": " + adalaidCrows.ranking());
        System.out.println(melbourne.getTeamName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getTeamName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getTeamName() + ": " + hawthorn.ranking());

        System.out.println(adalaidCrows.compareTo(melbourne));
        System.out.println(adalaidCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adalaidCrows));
        System.out.println(melbourne.compareTo(fremantle));

        //ArrayList<Team> teams;
        //Collections.sort(teams);
    }
}
