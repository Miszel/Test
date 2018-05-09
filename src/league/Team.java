package league;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final String teamName;
    private final List<Player> members = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Player> getMembers() {
        return members;
    }

    public void addPlayer(Player player){
        getMembers().add(player);


    }

    public List<String> listTeamMembers() {
        String str1 = "";
        List<String> newList = new ArrayList<>();
        for (Player player : members) {
            str1 = player.getName() + " " + player.getSurname() + " " + player.getNumber();
            newList.add(str1);
        }
        return newList;
    }


}
