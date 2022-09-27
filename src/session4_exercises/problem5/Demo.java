package session4_exercises.problem5;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date dagsDato = new Date();
        Fluid vand = new Fluid("Vand", 4, 1, 500, dagsDato);
        Vegetables agurk = new Vegetables("Agurk", 1, 2, dagsDato, 200);
        Fridge fridge = new Fridge(5);

        fridge.getItem();
    }
}
