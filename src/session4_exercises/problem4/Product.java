package session4_exercises.problem4;

public abstract class Product {
    private int id;
    private String name;
    private double price;
    private int stock;
    private int mL;

    public Product() {
    }

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(int id, String name, double price, int stock, int mL) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.mL = mL;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }

    public void buy(int stock) {
        this.stock -= stock;
    }

    public void add(int stock){
        this.stock += stock;
    }

    public int getmL() {
        return mL;
    }

    @Override
    public String toString() {
        if (mL == 0)
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", stock=" + stock +
                    '}';

        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", mL=" + mL +
                '}';
    }
}
