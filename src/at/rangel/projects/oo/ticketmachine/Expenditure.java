package at.rangel.projects.oo.ticketmachine;

public class Expenditure {
    public void insertMoney(double remainingMoney) {
        remainingMoney = -remainingMoney;
        System.out.println("Change of " + remainingMoney + " has been sent.");
    }
}
