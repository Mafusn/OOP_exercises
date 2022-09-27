package session4_exercises.problem5;

import java.util.Date;

public class Fluid extends Item{
    private int mL;
    private Date bestBefore;

    public Fluid(String name, int stock, int id, int mL, Date bestBefore) {
        super(name, stock, id);
        this.mL = mL;
        this.bestBefore = bestBefore;
    }
}
