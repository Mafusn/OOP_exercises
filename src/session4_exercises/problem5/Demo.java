package session4_exercises.problem5;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date dagsDato = new Date();
        Fridge fridge = new Fridge(5);
        Fluid vand = new Fluid("Vand", 4, 1, fridge, 500, dagsDato);
        Vegetable agurk = new Vegetable("Agurk", 2, 2, fridge, dagsDato, 200);

        System.out.println(fridge.getItem(vand.getId()));
        System.out.println(fridge.getItem(agurk.getId()));
        fridge.takeVegetableFromFridge(agurk, 2, 200);
        fridge.takeFluidFromFridge(vand, 3, 375);
        System.out.println(fridge.getItem(vand.getId()));
        System.out.println(fridge.getItem(agurk.getId()));
        fridge.addVegetableToFridge(agurk, 5, 600);
        fridge.addFluidToFridge(vand, 8, 2000);
        System.out.println(fridge.getItem(vand.getId()));
        System.out.println(fridge.getItem(agurk.getId()));
    }
}