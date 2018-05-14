package league;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final String teamName;
    private final List<Player> members = new ArrayList<>();
    private int points = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Player> getMembers() {
        return members;
    }

    public int getPoints() {
        return points;
    }

    public void addPlayer(Player player) {
        getMembers().add(player);
    }

    public int addPointsForWin() {
        this.points = this.points + 3;
        return points;
    }

    public int addPointsForDraw() {
        this.points = this.points + 1;
        return points;
    }

    private List<String> listTeamMembers() {
        String str1 = "";
        List<String> newList = new ArrayList<>();
        for (Player player : members) {
            str1 = player.getName() + " " + player.getSurname() + " " + player.getNumber();
            newList.add(str1);
        }
        return newList;
    }

    @Override
    public String toString() {
        String teamDescription = teamName;
        for (String player : listTeamMembers()) {
            teamDescription = teamDescription + "\n" + player;
        }
        return teamDescription;
    }


}
