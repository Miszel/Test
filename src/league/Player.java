package league;

public class Player {
    private final String name;
    private final String surname;
    private int goalAmount=0;

    public Player(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGoalAmount() {
        return goalAmount;
    }
}
