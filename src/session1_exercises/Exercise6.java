package session1_exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;

        System.out.println("Vowel or consonant?");

        Scanner scan = new Scanner(System.in);

        String cha = scan.nextLine();

        scan.close();

        for (int i = 0; i < cha.length(); i++){
            switch (cha.substring(i,i + 1)) {
                case "a", "e", "i", "u", "y", "o", "æ", "ø", "å" -> vowels++;
                default -> consonants++;
            }
        }
        System.out.println("Antal vokaler:" + vowels);
        System.out.println("Antal konsonanter:" + consonants);
    }
}
