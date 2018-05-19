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


    public void hostGoal(Player player) {
        hostScorer.add(player);
        player.scoreGoal();
    }

    public void guestGoal(Player player) {
        guestScorer.add(player);
        player.scoreGoal();
    }


    public int getTeamHostScore() {
        return hostScorer.size();
    }

    public int getTeamGuestScore() {
        return guestScorer.size();
    }

    public void endMatch() {
        if (getTeamHostScore() > getTeamGuestScore()) {
            teamHost.addPointsForWin();
        } else if (getTeamHostScore() == getTeamGuestScore()) {
            teamGuest.addPointsForDraw();
            teamHost.addPointsForDraw();
        } else teamGuest.addPointsForWin();
    }

    public void showResult() {
        System.out.println("Match: " + teamHost.getTeamName() + "-" +
                teamGuest.getTeamName() + " " + getTeamHostScore() + ":" + getTeamGuestScore());
    }

  /*  @Override
    public String toString() {
        return "Match{" +
                teamHost.getTeamName() + "-" +
                teamGuest.getTeamName() + " " + getTeamHostScore() + ":" + getTeamGuestScore() +
                '}';
    }*/
}
