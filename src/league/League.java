package league;

public class League {
    public static void main(String[] args) {


        //zawodnicy
        Player player1 = new Player("Jan", "Kowalski", 8);
        Player player2 = new Player("Robert", "Lewandowski", 10);
        Player player3 = new Player("Jan", "Kowalski", 2);
        Player player4 = new Player("Rysio", "Mały", 3);

        //pierwsza druzyna
        Team team1 = new Team("Szare wilki");
        team1.addPlayer(player1);
        team1.addPlayer(player2);
        System.out.println("team: " + team1);


        //druga druzyna
        Team team2 = new Team("Biale Lanie");
        team2.addPlayer(player3);
        System.out.println("team: " + team2);

        //trzecia druzyna
        Team team3 = new Team("Mysie ogonki");
        team3.addPlayer(player4);
        System.out.println("team: " + team3);

        //pierwszy mecz
        Match match1 = new Match(team1, team2);
        match1.hostGoal(player1);
        match1.hostGoal(player1);
        match1.guestGoal(player3);
        match1.endMatch();
        match1.showResult();


        //drugi mecz
        Match match2 = new Match(team1, team3);
        match2.hostGoal(player2);
        match2.hostGoal(player1);
        match2.guestGoal(player4);
        match2.guestGoal(player4);
        match2.endMatch();
        match2.showResult();

        //liga
        Statistics statistics = new Statistics();
        statistics.addTeam(team1);
        statistics.addTeam(team2);
        statistics.addTeam(team3);
        statistics.showTable();
        statistics.showBestTeams(2);
        statistics.listAllPlayersByGoals();
        statistics.showTopScorer();


    }
}
