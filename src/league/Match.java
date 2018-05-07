package league;

import java.util.ArrayList;
import java.util.List;

public class Match {

    public static void main(String[] args) {

        //zawodnicy
        Player player1 = new Player("Jan", "Kowalski",8);
        Player player2 = new Player("Robert", "Lewandowski",10);
        Player player3 = new Player("Jan", "Kowalski",2);
        //System.out.println(player1);
        //System.out.println(player2);

        //pierwsza druzyna
        List<Player> team1Players=new ArrayList<Player>();
        team1Players.add(player1);
        team1Players.add(player2);
        Team team1=new Team("Szare wilki",team1Players);
        System.out.println(team1.getTeamName()+ team1.listTeamMembers());

        //druga druzyna
        List<Player> team2Players=new ArrayList<Player>();
        team2Players.add(player3);
        Team team2=new Team("Białe łanie",team2Players);
        System.out.println(team2.getTeamName()+ team2.listTeamMembers());

        player1.scoreGoal(3);
        System.out.println(player1);
        player2.scoreGoal(1);
        System.out.println(player2);





    }
}
