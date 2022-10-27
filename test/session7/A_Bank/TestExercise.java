package session7.A_Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Exercise: Test the method "withdraw":
 * a) Create an account with 100 dkk.
 * b) Withdraw 25 dkk.
 * c) Test using "assertEquals" that the balance is equal to 75 dkk
 *
 */
public class TestExercise {

    @Test
    public void withdraw01() {
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.withdraw(25);
        assertEquals(75, bankAccount.getBalance());
    }
}
