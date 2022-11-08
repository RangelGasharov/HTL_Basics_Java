package at.rangel.projects.oo.accounts;

public class CheckingAccount extends BaseAccount {
    private int limit;

    public CheckingAccount(int limit) {
        this.limit = limit;
    }

    @Override
    public double withdraw(double amount) {
        if ((getBalance() - amount) > (limit * -1)) {
            System.out.println("Withdrawn " + amount + " Euros");
            return super.withdraw(amount);
        } else {
            System.out.println("Unfortunately there is no coverage for the withdrawal!");
            return 0;
        }
    }
}
