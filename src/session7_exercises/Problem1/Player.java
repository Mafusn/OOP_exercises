package session7_exercises.Problem1;

public class Player {
    private String name;
    private double height;
    private double weight;

    public Player(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getBMI() {
        double heightBMI = this.height / 100;
        double bmi = this.weight / (heightBMI * heightBMI);

        System.out.println(bmi + ", " + heightBMI);

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        }

        return "Overweight";
    }
}
