package session3_exercises.problem5;

public class WeekDayRate extends ParkingMeter implements ParkingMeterRate{
    public WeekDayRate() {;
    }

    @Override
    public int getParkingRate() {
        return 5;
    }
}
