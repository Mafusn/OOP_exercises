package session9.b_customexceptions;

public class NegativeWithdrawException extends RuntimeException{
    private int amount;

    public NegativeWithdrawException() {
    }
}
