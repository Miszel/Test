package league;


import java.util.HashSet;
import java.util.Set;

public class Match {

    private final String guest;
    private final String host;
    Set<Player> guestListGoalPlayer = new HashSet<>();
    Set<Player> hostListGoalPlayer = new HashSet<>();

    public Match(String guest, String host) {
        this.guest = guest;
        this.host = host;
    }

    public String getGuest() {
        return guest;
    }

    public String getHost() {
        return host;
    }

    public void scoreGoal(Player player){
//jesli team1.player -> counter dla team1 ++ i przypisz goal graczowi

        //jesli team2.player --> counter dla team2++ i przypisz gol graczowi
    }
}
