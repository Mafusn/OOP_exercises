package session9_exercises.Problem2;

import java.util.HashMap;
import java.util.Map;

public class DigitalDisplay {
    private Map<Integer, Integer> display;

    public DigitalDisplay(Map<Integer, Integer> display) {
        this.display = display;
    }

    public int getDigit(int i) {
        return display.get(i);
    }

    public void setDigit(int i, int v) {
        if (!display.containsKey(i)) {
            String msg = "Den findes ikke i displayet";
            throw new NoSuchDigitException(msg);
        }

        if (v > 10) {
            String msg = "Ikke højere end 10!";
            throw new IllegalDigitException(msg);
        }
        display.put(i, v);
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 2);
        map.put(3,4);
        map.put(2,9);
        map.put(7,3);

        DigitalDisplay digitalDisplay = new DigitalDisplay(map);

        try {
        digitalDisplay.setDigit(9, 9);
        } catch (NoSuchDigitException | IllegalDigitException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(digitalDisplay.getDigit(3));
    }
}
