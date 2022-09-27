package session3_exercises.problem5;

public class ParkingMeter {
    private int coins;
    private int minutes;

    public ParkingMeter() {
    }

    public int getCoins() {
        return coins;
    }

    public void insertCoins(int coins) {
        this.coins += coins;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int rate) {
        this.minutes = this.coins * rate;
    }

    public static void main(String[] args) {
        ParkingMeter parkingMeter = new ParkingMeter();
        WeekDayRate weekDayRate = new WeekDayRate();
        WeekendRate weekendRate = new WeekendRate();

        parkingMeter.insertCoins(15);

        int rateWeekDay = weekDayRate.getParkingRate();
        int rateWeekend = weekendRate.getParkingRate();

        parkingMeter.setMinutes(rateWeekDay);

        System.out.println(parkingMeter.getCoins() + ", " + parkingMeter.getMinutes());

        parkingMeter.insertCoins(20);

        parkingMeter.setMinutes(rateWeekend);

        System.out.println(parkingMeter.getCoins() + ", " + parkingMeter.getMinutes());
    }
}
