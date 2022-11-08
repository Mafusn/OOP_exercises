package session9.b_customexceptions;

import session9.c_checked_exceptions.NegativeAmountException;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            NegativeWithdrawException exception = new NegativeWithdrawException(amount);
            throw exception;
        }
        if (amount >= balance) {
            int deficit = amount - balance;
            throw new InsufficientFundsException(deficit);
        }
        balance = balance - amount;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            String msg = "Deposited amount must be positive.";
            throw new NegativeWithdrawException(amount);
        }

        balance=balance+amount;
    }
}