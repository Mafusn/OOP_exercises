package session4_exercises.problem5;

public abstract class Item {
    private String name;
    private int stock;
    private int id;

    public Item(String name, int stock, int id) {
        this.name = name;
        this.stock = stock;
        this.id = id;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return this.stock;
    }

    public void takeFromFridge(int stock) {
        this.stock -= stock;
    }

    public void addToFridge(int stock) {
        this.stock += stock;
    }
}
