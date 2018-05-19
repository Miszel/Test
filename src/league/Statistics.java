package league;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Statistics {

    private final List<Team> teams = new ArrayList<>();


    public void addTeam(Team team) {
        this.teams.add(team);
    }

    public List<Team> getTeams() {
        return teams;
    }

    public List<Team> getTeamsSorted() {
        Collections.sort(this.teams);
        Collections.reverse(this.teams);
        return this.teams;
    }

    public void showTable() {
        System.out.println("Result Table");
        for (Team team : getTeamsSorted()) {
            System.out.println(team.getTeamName() + "-" + team.getPoints());
        }
    }

    public void showBestTeams(int n) {
        List<Team> bestTeams = new ArrayList<>();
        System.out.println(n + " Best teams:");

        for (int i = 0; i < n; i++) {
            bestTeams.add(getTeamsSorted().get(i));
            System.out.println(bestTeams.get(i).getTeamName());
        }


    }

    public List<Player> getAllPlayersByGoalsSorted() {
        List<Player> players = new ArrayList<>();
        for (Team team : getTeams()) {
            for (Player player : team.getMembers()) {
                players.add(player);
            }
        }
        Collections.sort(players);
        Collections.reverse(players);
        return players;
    }

    public void listAllPlayersByGoals() {
        System.out.println("AllPlayersByGoals: " + getAllPlayersByGoalsSorted());
    }

    public void showTopScorer() {
        System.out.println("Best player: " + getAllPlayersByGoalsSorted().get(0));

    }
}



