package session9_exercises.Problem2;

public class NoSuchDigitException extends RuntimeException{
    private String msg;
    public NoSuchDigitException(String msg) {
        this.msg = msg;
    }
    public String getMessage() {
        return msg;
    }
}
