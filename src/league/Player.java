package league;

import java.util.Objects;

public class Player {
    private final String name;
    private final String surname;
    private final int number;
    private int goalAmount=0;

    public Player(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumber() {
        return number;
    }

    public int getGoalAmount() {
        return goalAmount;
    }

    public void scoreGoal(int goalAmount){
        this.goalAmount = this.goalAmount +goalAmount;

    }

    @Override
    public String toString() {
        return  getName()+" " + getSurname()+" "+getNumber() + " goals: "+getGoalAmount();
    }


}

