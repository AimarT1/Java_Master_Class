package com.javamasteclass;

public class Main {

    public static void main(String[] args) {

        League<Team<Football>> footballLeague = new League<>("AFL");

        Team<Football> adalaidCrows = new Team<>("Adalaid Crows");
        Team<Football> melbourne = new Team<>("Melbourne");
        Team<Football> hawthorn= new Team<>("Hawthorn");
        Team<Football> fremantle= new Team<>("Fremantle");
        Team<Football> arsenal = new Team<>("Arsenal");

        footballLeague.add(adalaidCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);
        footballLeague.add(arsenal);

        footballLeague.showLeagueTable();
        System.out.println("*****");

        adalaidCrows.matchResult(melbourne,1,4);
        adalaidCrows.matchResult(hawthorn,0,0);
        adalaidCrows.matchResult(fremantle,1,0);

        melbourne.matchResult(hawthorn,5,1);
        melbourne.matchResult(fremantle,3,0);

        hawthorn.matchResult(fremantle,0,6);

        footballLeague.showLeagueTable();
        System.out.println("*****");

        arsenal.matchResult(melbourne,7,0);
        footballLeague.showLeagueTable();
        System.out.println("*****");

    }
}
