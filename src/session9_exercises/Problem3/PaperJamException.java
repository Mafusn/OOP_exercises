package session9_exercises.Problem3;

public class PaperJamException extends RuntimeException {
    private String msg;

    public PaperJamException(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
}
