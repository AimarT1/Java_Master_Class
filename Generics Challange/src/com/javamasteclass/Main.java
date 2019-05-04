package com.javamasteclass;

public class Main {

    public static void main(String[] args) {

        EPL epl = new EPL("English Priemer League");
        LA_LIGA la_liga = new LA_LIGA("La Liga");
        LIGE1 lige1 = new LIGE1("Lige 1");

        Team<EPL> eplTeam = new Team<EPL>("English Priemer League");

        String dataEpl = "Arsenal NewCastle ManU ManCity Liverpool Brighton Wolves Chealsea Spurs CristalPalce Everton";
        String[] eplArray = dataEpl.split(" ");
        for (String i : eplArray) {
            eplTeam.addTeam(new EPL(i));
        }
        System.out.println(eplTeam.printNumberOfTeams());

        Team<LA_LIGA> la_ligaTeam = new Team<LA_LIGA>("La Liga");
        String dataLaLiga = "Real_Madrid Barcelona Atletico Valencia Sevilla Villa_Real Leganes Deportivo";
        String[] laligaArray = dataLaLiga.split(" ");
        for (String i : laligaArray){
            la_ligaTeam.addTeam(new LA_LIGA(i));
        }
        System.out.println(la_ligaTeam.printNumberOfTeams());

        Team<LIGE1> lige1Team = new Team<LIGE1>("Lige 1");
        String ligue1data = "Lyon Marcelle PSG Lille Lorient Amnies Nantes";
        String lige1Array[] = ligue1data.split(" ");
        for (String i : lige1Array){
            lige1Team.addTeam(new LIGE1(i));
        }
        System.out.println(lige1Team.printNumberOfTeams());
        lige1Team.printTeamsInLeagu();
        la_ligaTeam.getTeam("Arsenal");
    }
}
