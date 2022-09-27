package session4_exercises.problem4;

import java.util.Date;

public class PearishableProduct extends Product{
    private Date expirationDate;

    public PearishableProduct(int id, String name, double price, int stock, Date expirationDate) {
        super(id, name, price, stock);
        this.expirationDate = expirationDate;
    }

    public PearishableProduct(int id, String name, double price, int stock, int mL, Date expirationDate) {
        super(id, name, price, stock, mL);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }
}
