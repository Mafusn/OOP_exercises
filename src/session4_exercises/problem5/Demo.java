package session4_exercises.problem5;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date dagsDato = new Date();
        Fridge fridge = new Fridge(5);
        Fluid vand = new Fluid("Vand", 4, 1, fridge, 500, dagsDato);
        Vegetables agurk = new Vegetables("Agurk", 1, 2, fridge, dagsDato, 200);

        System.out.println(fridge.getItem(vand.getId()));
        System.out.println(fridge.getItem(agurk.getId()));
        agurk.addSomeVegetables(2, 400);
        System.out.println(fridge.getItem(agurk.getId()));
    }
}