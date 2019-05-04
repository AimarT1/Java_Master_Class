package com.javamasteclass;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String leagueName;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean add(T team) {
        if (league.contains(team)) {
            return false;
        } else {
            league.add(team);
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T i : league) {
            System.out.println(i.getTeamName() + " : " + i.ranking());
        }
    }
}
