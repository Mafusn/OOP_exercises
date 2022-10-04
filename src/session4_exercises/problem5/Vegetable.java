package session4_exercises.problem5;

import java.util.Date;

public class Vegetable extends Item implements ExpirationProduct{
    private Date expirationDate;
    private int weight;

    public Vegetable(String name, int stock, int id, Fridge fridge, Date expirationDate, int weight) {
        super(name, stock, id, fridge);
        expirationDate = expirationDate;
        this.weight = weight;
    }

    public Vegetable(String name, int stock, int id, Fridge fridge, Date expirationDate) {
        super(name, stock, id, fridge);
        expirationDate = expirationDate;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public Date getExpirationDate() {
        return this.expirationDate;
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
