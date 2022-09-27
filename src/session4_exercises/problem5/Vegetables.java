package session4_exercises.problem5;

import java.util.Date;

public class Vegetables extends Item{
    private Date ExpirationDate;
    private int weight;

    public Vegetables(String name, int stock, int id, Date expirationDate, int weight) {
        super(name, stock, id);
        ExpirationDate = expirationDate;
        this.weight = weight;
    }

    public Vegetables(String name, int stock, int id, Date expirationDate) {
        super(name, stock, id);
        ExpirationDate = expirationDate;
    }

    public void takeSomeVegetables(int stock, int weight) {
        takeFromFridge(stock);
        this.weight -= weight;
    }

    public void addSomeVegetables(int stock, int weight) {
        addToFridge(stock);
        this.weight += weight;
    }
}
