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
        Player player1 = new Player("Jan", "Kowalski",8);
        Player player2 = new Player("Robert", "Lewandowski",10);
        Player player3 = new Player("Jan", "Kowalski",2);

        //pierwsza druzyna
        Team team1=new Team("Szare wilki");
        team1.addPlayer(player1);
        team1.addPlayer(player2);
//        System.out.println(team1.getTeamName()+ team1.listTeamMembers());
        System.out.println(team1);

        //druga druzyna
        Team team2=new Team("Biale Lanie");
        team2.addPlayer(player3);
//        System.out.println(team2.getTeamName()+ team2.listTeamMembers());
        System.out.println(team2);

        //pierwszy mecz
        Match match1= new Match(team1,team2);
        player1.scoreGoal(1);
        player2.scoreGoal(2);
        player3.scoreGoal(1);
        match1.getHostScorer().add(player1);
        match1.getHostScorer().add(player2);
        match1.getGuestScorer().add(player3);
        System.out.println(match1);


    }

    @Override
    public String toString() {
        return "Match{" +
                "teamHost=" + teamHost +
                ", teamGuest=" + teamGuest +
                ", hostScorer=" + hostScorer +
                ", guestScorer=" + guestScorer +
                '}';
    }
}
