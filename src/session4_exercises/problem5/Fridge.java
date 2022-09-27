package session4_exercises.problem5;

import java.util.Arrays;

public class Fridge {
    private int temperature;
    private Item[] items;

    public Fridge(int temperature) {
        this.temperature = temperature;
        this.items = new Item[100];
    }

    public int getTemperature() {
        return temperature;
    }

    public void getItem() {
        int length = this.items.length;
        for (int i = 0; i < length && this.items[i] != null; i++) {
            System.out.println(Arrays.toString(new Item[]{this.items[i]}));
        }
        System.out.println(this.items.length);
        System.out.println(Arrays.toString(new Item[]{this.items[1]}));
    }
}
