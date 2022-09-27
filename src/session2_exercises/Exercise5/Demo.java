package session2_exercises.Exercise5;

public class Demo {
    public static void main(String[] args) {
        Player player1 = new Player("Karsten", "Preben", 15, 2, 2);
        Player player2 = new Player("Jeniffer", "Hansen", 16, 3, 1);

        Player player3 = new Player("Henning", "Hermansen", 12, 0, 4);
        Player player4 = new Player("Ebbe", "Larsen", 14, 2, 3);

        Team team1 = new Team("De gamle abekatter", player1, player2);
        Team team2 = new Team("Taberne", player3, player4);

        Match match1 = new Match(team1, team2);

        System.out.println(player1.wLRatio());
        System.out.println(player2.wLRatio());
        System.out.println(player3.wLRatio());
        System.out.println(player4.wLRatio());

        match1.matchStats(team2, team1);

        System.out.println(player1.wLRatio());
        System.out.println(player2.wLRatio());
        System.out.println(player3.wLRatio());
        System.out.println(player4.wLRatio());
    }
}
