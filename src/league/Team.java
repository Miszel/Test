package league;

import java.util.List;

public class Team {
    private final String teamName;
    private final List<Player> members;

    public Team(String teamName, List<Player> members) {
        this.teamName = teamName;
        this.members = members;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Player> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        for(Player player:members) {
           = player.getName()+player.getSurname()+player.getNumber();
        }

        return getTeamName();
    }
}
