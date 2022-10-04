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

    public void setItems(int index, Item item){
        this.items[index] = item;
    }

    public Item getItem(int id) {
        return items[id];
    }
}
