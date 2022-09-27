package session4.B_Multiple_Inheritance;

public class TeslaModelS extends SportsCar implements ElectricVehicle{
    @Override
    public boolean goFast() {
        System.out.println("Going Fast!!!");
        return true;
    }

    @Override
    public int speed() {
        return 300;
    }

    @Override
    public double batteryLevel() {
        return 20;
    }
}
