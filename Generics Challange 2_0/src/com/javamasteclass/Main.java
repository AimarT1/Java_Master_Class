package com.javamasteclass;


public class Main {

    public static void main(String[] args) {
    //Creating a new instance of leagu wich Extends Team type aka football team.
	League<Team<FootBall>> footballLeague = new League<>("English Priemer League");

	//Creating new instaces of Fotball Class objects aka team types
	Team<FootBall> arsenal = new Team<>("Arsenal");
	Team<FootBall> chealsea = new Team<>("Chealsea");
	Team<FootBall> liverpool = new Team<>("Liverpool");
	Team<FootBall> everton = new Team<>("Everton");
	Team<FootBall> wolves = new Team<>("Wolves");
	Team<FootBall> mancersterCity = new Team<>("Manchester City");

	//adding created teams to footballleague
	footballLeague.addTeam(arsenal);
	footballLeague.addTeam(chealsea);
	footballLeague.addTeam(liverpool);
	footballLeague.addTeam(everton);
	footballLeague.addTeam(wolves);
	footballLeague.addTeam(mancersterCity);

	footballLeague.printLeagueTable();

	arsenal.matchresult(chealsea,2,0);
	arsenal.matchresult(liverpool,1,5);
	arsenal.matchresult(everton,3,0);
	arsenal.matchresult(wolves,2,2);
	arsenal.matchresult(mancersterCity,1,3);

	liverpool.matchresult(chealsea,2,2);
	liverpool.matchresult(everton,4,1);
	liverpool.matchresult(wolves,4,3);
	liverpool.matchresult(mancersterCity,0,0);

	chealsea.matchresult(everton,3,0);
	chealsea.matchresult(wolves,0,1);
	chealsea.matchresult(mancersterCity,0,0);

	mancersterCity.matchresult(everton,4,1);
	mancersterCity.matchresult(wolves,2,2);

	wolves.matchresult(everton,4,1);

	everton.matchresult(everton,1,1);

	footballLeague.printLeagueTable();
    System.out.println("*******");


	League<Team<FootBall>> laLiga = new League<>("la Liga");

	Team<FootBall> barcelona = new Team<>("Barcelona");
	Team<FootBall> atletico = new Team<>("Atletico Madrid");
	Team<FootBall> valencia = new Team<>("Valencia");
	Team<FootBall> madridReal = new Team<>("Real Madrid");
	Team<FootBall> sevilla = new Team<>("Sevilla");

	laLiga.addTeam(barcelona);
	laLiga.addTeam(atletico);
	laLiga.addTeam(valencia);
	laLiga.addTeam(madridReal);
	laLiga.addTeam(sevilla);

	barcelona.matchresult(atletico,3,1);
	barcelona.matchresult(valencia,2,0);
	barcelona.matchresult(madridReal,0,4);
	barcelona.matchresult(sevilla,3,0);

	atletico.matchresult(valencia,2,0);
	atletico.matchresult(madridReal,3,3);
	atletico.matchresult(sevilla,4,2);

	valencia.matchresult(madridReal,0,3);
	valencia.matchresult(sevilla,2,0);

	madridReal.matchresult(sevilla,3,0);

	laLiga.printLeagueTable();
    }
}
