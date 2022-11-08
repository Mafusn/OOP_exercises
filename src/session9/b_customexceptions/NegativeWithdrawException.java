package session9.b_customexceptions;

public class NegativeWithdrawException extends RuntimeException{
    private int amount;

    public NegativeWithdrawException(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}
