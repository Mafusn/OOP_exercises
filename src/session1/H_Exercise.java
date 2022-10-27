package session1;

/**
 * a) Which is the function being computed by this code? (Hint: Use the debugger)
 * b) Re-write it using two nested for-loops?
 */
public class H_Exercise {
    public static void main(String[] args) {
        int e;
        int result;

        int n = 10;

        for (int i = 0; i < n; i++) {
            result = 1;
            for (e = i; e > 0; e--)
                result *= 2;

            System.out.println(result);
        }
    }
}
