package session2_exercises.Exercise4;

public class BankAccount {
    private int balance;
    private int borrowingRate;
    private int savingsRate;

    public BankAccount(int balance, int borrowingRate, int savingsRate) {
        this.balance = balance;
        this.borrowingRate = borrowingRate;
        this.savingsRate = savingsRate;
    }

    public void deposit(int money){
        if (money > 0 && this.balance + money < 250000){
            this.balance += money;
        } else {
            System.out.println("Du kan ikke sætte så mange penge ind!");
        }
    }

    public void withdraw(int money){
        if (money > 0 && this.balance - money > -100000){
            this.balance -= money;
        } else {
            System.out.println("Du kan ikke hæve så meget!");
        }
    }

    public double accrue(){
        return this.savingsRate * 0.01 * balance;
    }

    public double charge(){
        return this.borrowingRate * 0.01 * balance;
    }

    public void setBorrowingRate(int borrowingRate) {
        if (borrowingRate >= 6){
            this.borrowingRate = borrowingRate;
        } else {
            System.out.println("Borrowing rate skal være over 6%!");
        }
    }

    public void setSavingsRate(int savingsRate) {
        if (savingsRate >= 2) {
            this.savingsRate = savingsRate;
        } else {
            System.out.println("Savings rate skal være over 2%!");
        }
    }

    public void getBankAccount(){
        System.out.println(this.balance + ", " + this.borrowingRate + ", " + this.savingsRate);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000, 10, 2);

        bankAccount.setBorrowingRate(5);
        bankAccount.setSavingsRate(4);

        System.out.println("Du skylder: " + bankAccount.charge() + " DKK");
        System.out.println("Du har modtaget: " + bankAccount.accrue() + " DKK");

        bankAccount.getBankAccount();
    }
}
