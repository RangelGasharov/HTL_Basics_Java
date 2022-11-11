package at.rangel.projects.oo.accounts;

public class CreditAccount {
    private double balance;

    public void takeCredit(double amount, double interestRate, double yearFactor) {
        this.balance -= amount * Math.pow((1 + interestRate / 100), yearFactor);
    }

    public void payOffCredit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
