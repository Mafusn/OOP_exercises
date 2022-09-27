package session2_exercises.Exercise5;

public class Match {
    private Team red;
    private Team blue;

    public Match(Team red, Team blue) {
        this.red = red;
        this.blue = blue;
    }

    public double getAverage(){
        return (this.red.averageAge() + this.blue.averageAge()) / 2;
    }

    public void teamBestWLRatio(){
        double player1WL = red.playerHighestWLRatio().wLRatio();
        double player2WL = blue.playerHighestWLRatio().wLRatio();

        if (player1WL > player2WL) {
            System.out.println(red.playerHighestWLRatio().getName() + " has the highest W/L ratio");
        } else if (player1WL < player2WL) {
            System.out.println(blue.playerHighestWLRatio().getName() + " has the highest W/L ratio");
        } else {
            System.out.println(red.playerHighestWLRatio() + " and " + blue.playerHighestWLRatio() +
                    " has equal W/L ratio.");
        }
    }

    public void matchStats(Team winningTeam, Team losingTeam){
        winningTeam.getPlayer1().setWins(1);
        winningTeam.getPlayer2().setWins(1);

        losingTeam.getPlayer1().setLosses(1);
        losingTeam.getPlayer2().setLosses(1);
    }
}
