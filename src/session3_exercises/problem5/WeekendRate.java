package session3_exercises.problem5;

public class WeekendRate extends ParkingMeter implements ParkingMeterRate{
    public WeekendRate() {
    }

    @Override
    public int getParkingRate() {
        return 10;
    }
}
