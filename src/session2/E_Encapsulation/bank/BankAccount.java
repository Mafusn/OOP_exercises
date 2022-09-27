package session2.E_Encapsulation.bank;


public class BankAccount {

    public int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            return true;
        }
        return false;
    }


}