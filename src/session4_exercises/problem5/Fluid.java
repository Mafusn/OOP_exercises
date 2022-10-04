package session4_exercises.problem5;

import java.util.Date;

public class Fluid extends Item implements BestBeforeProduct {
    private int mL;
    private Date bestBefore;

    public Fluid(String name, int stock, int id, Fridge fridge, int mL, Date bestBefore) {
        super(name, stock, id, fridge);
        this.mL = mL;
        this.bestBefore = bestBefore;
    }

    public int getmL() {
        return mL;
    }

    public void setmL(int mL) {
        this.mL = mL;
    }

    @Override
    public Date getBestBeforeDate() {
        return this.bestBefore;
    }

    @Override
    public String toString() {
        return "Fluid{" +
                "Name = " + this.getName() +
                ", Stock = " + this.getStock() +
                ", mL = " + mL +
                '}';
    }

}
