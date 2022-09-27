package session4.A_Vehicle_Hierarchy;

public abstract class Bus implements Vehicle{
    private int capacity;
    private int speed;

    public Bus(int capacity, int speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    @Override
    public int speed(){
        return this.speed;
    }

    public int capacity(){
        return this.capacity;
    }
}
