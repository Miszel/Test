package league;

import java.util.ArrayList;
import java.util.List;

public class Match {

    private final Team teamHost;
    private final Team teamGuest;
    private final List<Player> hostScorer = new ArrayList<>();
    private final List<Player> guestScorer = new ArrayList<>();


    public Match(Team teamHost, Team teamGuest) {
        this.teamHost = teamHost;
        this.teamGuest = teamGuest;
    }


    public Team getTeamHost() {
        return teamHost;
    }

    public Team getTeamGuest() {
        return teamGuest;
    }

    public List<Player> getGuestScorer() {
        return guestScorer;
    }

    public List<Player> getHostScorer() {
        return hostScorer;
    }

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
        System.out.println(team1);

        //druga druzyna
        Team team2 = new Team("Biale Lanie");
        team2.addPlayer(player3);
        System.out.println(team2);

        //trzecia druzyna
        Team team3 = new Team("Mysie ogonki");
        team3.addPlayer(player4);
        System.out.println(team3);

        //pierwszy mecz
        Match match1 = new Match(team1, team2);
        player1.scoreGoal();
        player2.scoreGoal();
        player3.scoreGoal();
        player1.scoreGoal();
        match1.getHostScorer().add(player1);
        match1.getHostScorer().add(player2);
        match1.getGuestScorer().add(player3);
        System.out.println(match1);
        match1.teamPoints();


        //drugi mecz
        Match match2 = new Match(team1, team3);
        player1.scoreGoal();
        player4.scoreGoal();
        match2.getHostScorer().add(player1);
        match2.getGuestScorer().add(player4);
        System.out.println(match2);
        match2.teamPoints();

        System.out.println("team1 points: " + team1.getPoints() + "," + "team2 points: " + team2.getPoints() + "," + "team3 points: " + team3.getPoints()); //zastanowic sie jak to poprawic
    }

    public int getTeamHostScore() {
        return hostScorer.size();
    }

    public int getTeamGuestScore() {
        return guestScorer.size();
    }

    public void teamPoints() {
        if (getTeamHostScore() > getTeamGuestScore()) {
            teamHost.addPointsForWin();
        } else if (getTeamHostScore() == getTeamGuestScore()) {
            teamGuest.addPointsForDraw();
            teamHost.addPointsForDraw();
        } else teamGuest.addPointsForWin();
    }


    @Override
    public String toString() {
        return "Match{" +
                teamHost.getTeamName() + "-" +
                teamGuest.getTeamName() + " " + getTeamHostScore() + ":" + getTeamGuestScore() +
                '}';
    }
}
