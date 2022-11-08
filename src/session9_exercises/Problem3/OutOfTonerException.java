package session9_exercises.Problem3;

public class OutOfTonerException extends RuntimeException {
    private String msg;


    public OutOfTonerException(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
}
