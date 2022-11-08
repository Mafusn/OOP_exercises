package session9_exercises.Problem3;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class PrinterFromHell {
    public PrinterFromHell() {
    }

    public void print() {
        int random = ThreadLocalRandom.current().nextInt(1, 4);

        switch (random) {
            case 1:
                String msg1 = "NOTHING TO PRINT ON";
                throw new OutOfPaperException(msg1);
            case 2:
                String msg2 = "NO MORE COLOURS!";
                throw new OutOfTonerException(msg2);
            case 3:
                String msg3 = "THE PAPER IS STUCK, HELP ME!";
                throw new PaperJamException(msg3);
        }
    }

    public static void main(String[] args) {
        PrinterFromHell printerFromHell = new PrinterFromHell();

        try {
            printerFromHell.print();
        } catch (OutOfPaperException e) {
            System.out.println(e.getMsg());
        } catch (OutOfTonerException e) {
            System.out.println(e.getMsg());
        } catch (PaperJamException e) {
            System.out.println(e.getMsg());
        }
    }
}
