package session2.E_Encapsulation;


import session2.E_Encapsulation.bank.BankAccount;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.withdraw(75);
        account.balance = 500_000;

        System.out.println(account.balance);
    }

}
