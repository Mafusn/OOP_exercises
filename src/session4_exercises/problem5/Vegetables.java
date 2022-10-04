package session4_exercises.problem5;

import java.util.Date;

public class Vegetables extends Item{
    private Date ExpirationDate;
    private int weight;

    public Vegetables(String name, int stock, int id, Fridge fridge, Date expirationDate, int weight) {
        super(name, stock, id, fridge);
        ExpirationDate = expirationDate;
        this.weight = weight;
    }

    public Vegetables(String name, int stock, int id, Fridge fridge, Date expirationDate) {
        super(name, stock, id, fridge);
        ExpirationDate = expirationDate;
    }

    public void takeSomeVegetables(int stock, int weight) {
        if (this.getStock() - stock >= 0 && this.weight - weight >= 0) {
            takeFromFridge(stock);
            this.weight -= weight;
        } else {
            System.out.println("Du har ikke så meget på lager desværre");
        }
    }

    public void addSomeVegetables(int stock, int weight) {
        addToFridge(stock);
        this.weight += weight;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "Name = " + this.getName() +
                ", Stock = " + this.getStock() +
                ", weight = " + weight +
                '}';
    }
}
