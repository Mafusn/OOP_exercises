package session4.A_Vehicle_Hierarchy;

public abstract class SportsCar implements Vehicle {
    private int speed;

    public SportsCar(int speed) {
        this.speed = speed;
    }

    @Override
    public int speed() {
        return this.speed;
    }

    public int goFast(int velocity){
        return this.speed + velocity;
    }
}
