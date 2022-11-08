package at.rangel.projects.oo.accounts;

public class SavingsAccount extends BaseAccount {
    @Override
    public double withdraw(double amount) {
        if ((getBalance() - amount) > 0) {
            return super.withdraw(amount);
        } else {
            System.out.println("There is no coverage for the withdrawal!");
            return 0;
        }
    }
}