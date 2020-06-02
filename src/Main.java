public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");


        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        Team<BaseBallPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> soccerTeam = new Team("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        soccerTeam.addPlayer(banks);

        Team<FootballPlayer> hawthorne = new Team("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorne.matchResult(fremantle, 0,1 );
        hawthorne.matchResult(adelaideCrows, 8,3);

        adelaideCrows.matchResult(fremantle, 1,2);


        System.out.println("Rankings");
        System.out.println(adelaideCrows.getTeamName() + ": " + adelaideCrows.ranking());
        System.out.println(soccerTeam.getTeamName() + ": " + soccerTeam.ranking());
        System.out.println(fremantle.getTeamName() + ": " + fremantle.ranking());
        System.out.println(hawthorne.getTeamName() + ": " + hawthorne.ranking());


        System.out.println(adelaideCrows.compareTo(soccerTeam));
        System.out.println(adelaideCrows.compareTo(hawthorne));
        System.out.println(hawthorne.compareTo(adelaideCrows));
        System.out.println(soccerTeam.compareTo(fremantle));

        LeagueTable<Team<FootballPlayer>> table = new LeagueTable<>();
        table.addTeam(hawthorne);
        table.addTeam(fremantle);
        table.addTeam(adelaideCrows);
        table.printList();

    }
}
