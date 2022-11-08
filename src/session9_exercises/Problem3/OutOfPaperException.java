package session9_exercises.Problem3;

public class OutOfPaperException extends RuntimeException {
    private String msg;


    public OutOfPaperException(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
}
