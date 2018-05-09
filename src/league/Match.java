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



        Team team1=new Team("Szare wilki");
        team1.addPlayer(player1);
        team1.addPlayer(player2);
        System.out.println(team1.getTeamName()+ team1.listTeamMembers());



        player1.scoreGoal(3);
        System.out.println(player1);
        player2.scoreGoal(1);
        System.out.println(player2);





    }
}
