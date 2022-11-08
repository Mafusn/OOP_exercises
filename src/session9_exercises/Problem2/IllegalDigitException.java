package session9_exercises.Problem2;

public class IllegalDigitException extends RuntimeException{
    private String msg;
    public IllegalDigitException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}
