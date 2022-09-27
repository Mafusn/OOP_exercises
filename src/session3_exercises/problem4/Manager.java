package session3_exercises.problem4;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, int age, String jobTitle, double salary, double bonus) {
        super(name, age, jobTitle, salary + bonus);
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Preben", 25, "Prosti", 25000, 2500);

        System.out.println(manager.getBonus());
    }

}
