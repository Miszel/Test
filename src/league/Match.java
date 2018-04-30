package league;

import java.util.ArrayList;
import java.util.List;

public class Match {

    public static void main(String[] args) {

        Player player1 = new Player("Jan", "Kowalski",8);
        Player player2 = new Player("Robert", "Lewandowski",10);
        System.out.println(player1);
        System.out.println(player2);


        player1.scoreGoal(1);
        System.out.println(player1);
        player1.scoreGoal(3);
        System.out.println(player1);
        player2.scoreGoal(1);
        System.out.println(player2);


        List<Player> team1Players=new ArrayList<Player>();
        team1Players.add(player1);
        team1Players.add(player2);

        Team team1=new Team("Szare wilki",team1Players);
        System.out.println(team1);
    }
}
