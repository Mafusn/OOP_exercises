package session4_exercises.problem4;

import java.util.Date;

public class NonPearishableProduct extends Product{
    private Date bestBeforeDate;

    public NonPearishableProduct(int id, String name, double price, int stock, Date bestBeforeDate) {
        super(id, name, price, stock);
        this.bestBeforeDate = bestBeforeDate;
    }

    public NonPearishableProduct(int id, String name, double price, int stock, int mL, Date bestBeforeDate) {
        super(id, name, price, stock, mL);
        this.bestBeforeDate = bestBeforeDate;
    }

    public Date getBestBeforeDate() {
        return bestBeforeDate;
    }
}
