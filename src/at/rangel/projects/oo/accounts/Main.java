package at.rangel.projects.oo.accounts;

public class Main {
    public static void main(String[] args) {
        BaseAccount baseA1 = new BaseAccount();
        SavingsAccount savingA1 = new SavingsAccount();
        System.out.println("Basic Account 1, balance: " + baseA1.getBalance());
        baseA1.withdraw(1000);
        System.out.println("Basic Account 1, balance: " + baseA1.getBalance());

        savingA1.withdraw(100);
    }
}
