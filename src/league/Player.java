package league;


public class Player implements Comparable<Player> {
    private final String name;
    private final String surname;
    private final int number;
    private int goalAmount = 0;

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

    public void scoreGoal() {
        goalAmount = goalAmount + 1;

    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + "-" + " goals: " + getGoalAmount();
    }


    @Override
    public int compareTo(Player o) {
        return Integer.compare(goalAmount, o.goalAmount);
    }
}

