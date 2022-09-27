package session1_exercises;

import java.util.Scanner;

public class Exercise1 {


    public static void main(String[] args) {
        double FOOT_TO_METERS = 0.3048;
        System.out.println("Omregner fod til meter, skriv din værdi i fod: ");

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        scan.close();

        System.out.println(Double.parseDouble(s) * FOOT_TO_METERS);
    }
}
