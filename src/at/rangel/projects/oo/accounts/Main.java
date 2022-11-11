package at.rangel.projects.oo.accounts;

public class Main {
    public static void main(String[] args) {
        BaseAccount baseA1 = new BaseAccount();
        SavingsAccount savingA1 = new SavingsAccount();
        CreditAccount creditA1 = new CreditAccount();
        System.out.println("Basic Account 1, balance: " + baseA1.getBalance());
        baseA1.withdraw(1000);
        System.out.println("Basic Account 1, balance: " + baseA1.getBalance());

        savingA1.deposit(50);
        System.out.println("Saving Account 1, balance: " + savingA1.getBalance());
        savingA1.withdraw(100);

        creditA1.takeCredit(100000, 5, 10);
        System.out.println("Credit Account 1, balance: " + creditA1.getBalance());
    }
}
