package com.javamasteclass;

import java.util.ArrayList;
import java.util.Collections;

public class Generics_2 {
    public static void main(String[] args) {
        FootballPlayer Joe = new FootballPlayer("Joe");
        BaseballPlayer Pat = new BaseballPlayer("Pat");
        SoccerPlayer Beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");

        adelaideCrows.addPlayer(Joe);
        //adaleideCrows.addPlayer(Pat);
        //adaleideCrows.addPlayer(Beckham);

        System.out.println(adelaideCrows.numberOfPlayers());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(Pat);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Fc UNITED");
        soccerPlayerTeam.addPlayer(Beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getTeamName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getTeamName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getTeamName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getTeamName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

        ArrayList<Team> teams;
        //Collections.sort(teams)
    }}