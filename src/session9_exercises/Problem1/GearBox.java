package session9_exercises.Problem1;

public class GearBox {
    private int gear;

    public GearBox(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void changeGear(int gearChange) {
        // Reverse gear
        if (gearChange == -1 && this.gear != 1) {
            String msg = "Du må kun skifte til bakgear fra 1. gear";
            throw new IllegalGearChangeException(msg);
        }

        // Only change 1 gear up and down at a time
        if (gearChange - this.gear != 1 && gearChange != -1) {
            String msg = "Kun et gear af gangen gamle";
            throw new IllegalGearChangeException(msg);
        }

        if (gearChange > 5) {
            String msg = "Tror du at du kører Bentley eller hvad, kun skift et gear af gangen";
            throw new IllegalGearChangeException(msg);
        }

        this.gear = gearChange;
    }

    public static void main(String[] args) {
        GearBox gearBox = new GearBox(1);

        try {
            gearBox.changeGear(2);
            gearBox.changeGear(3);
            gearBox.changeGear(4);
            gearBox.changeGear(5);
            gearBox.changeGear(6);

            System.out.println(gearBox.getGear());
        } catch (IllegalGearChangeException e){
            System.out.println(e.getErrorMessage());
        }
    }
}
