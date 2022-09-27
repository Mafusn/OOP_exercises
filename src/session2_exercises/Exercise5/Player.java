package session2_exercises.Exercise5;

public class Player {
    private String firstName;
    private String lastName;
    private int age;
    private int wins;
    private int losses;
    private String sponsor;

    public Player(String firstName, String lastName, int age, int wins, int losses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.wins = wins;
        this.losses = losses;
    }

    public Player(String firstName, String lastName, int age, int wins, int losses, String sponsor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.wins = wins;
        this.losses = losses;
        this.sponsor = sponsor;
    }

    public double wLRatio(){
        if(losses > 0){
            return (double) this.wins / (double) this.losses;
        }
        return this.wins;
    }

    public int getAge(){
        return this.age;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setWins(int wins) {
        this.wins += wins;
    }

    public void setLosses(int losses) {
        this.losses += losses;
    }
}
