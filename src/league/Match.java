package league;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Match {

    private final Team teamHost;
    private final Team teamGuest;
    private Map<Player, Integer > hostScorer= new LinkedHashMap<>();
    private Map<Player, Integer> guestScorer = new LinkedHashMap<>();

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

    public Map<Player, Integer> getGuestScorer() {
        return guestScorer;
    }

    public Map<Player, Integer> getHostScorer() {
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








    }

}
