package session4_exercises.problem5;

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
            System.out.println(this.items[i]);
        }
    }
}
