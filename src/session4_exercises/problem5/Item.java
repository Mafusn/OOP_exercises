package session4_exercises.problem5;

public abstract class Item {
    private String name;
    private int stock;
    private int id;
    private Fridge fridge;

    public Item(String name, int stock, int id, Fridge fridge) {
        this.name = name;
        this.stock = stock;
        this.id = id;
        this.fridge = fridge;
        this.fridge.setItems(id, this);
    }

    public Item() {
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                '}';
    }
}