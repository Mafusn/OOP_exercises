package session2_exercises.Exercise5;

public class Team {
    private String teamName;
    private Player player1;
    private Player player2;

    public Team(String teamName, Player player1, Player player2) {
        this.teamName = teamName;
        this.player1 = player1;
        this.player2 = player2;
    }

    public double averageAge(){
        int age1 = player1.getAge();
        int age2 = player2.getAge();
        return ((double) age1 + (double) age2) / 2;
    }

    public Player playerHighestWLRatio(){
        if (this.player1.wLRatio() == this.player2.wLRatio()) {
            return player1;
        } else if (this.player1.wLRatio() < this.player2.wLRatio()) {
            return player2;
        }
        return player1;
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }
}
