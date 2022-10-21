import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        final int CANCEL = 4;

        int selectionOfTask = 0;
        int bankBalance = 0;
        Scanner scanner = new Scanner(System.in);

        while (selectionOfTask != CANCEL) {
            System.out.println("Wählen Sie ihre gewünschte Funktion aus: ");
            System.out.println("1 - Einzahlen");
            System.out.println("2 - Abheben");
            System.out.println("3 - Kontostand");
            System.out.println("4 - Ende");
            System.out.println();
            try {
                selectionOfTask = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("");
                scanner.next();
            }
            switch (selectionOfTask) {
                case 1:
                    System.out.println();
                    System.out.println("Wählen Sie den Wert, den Sie an ihr Konto überweisen wollen.");
                    int depositedAmount = scanner.nextInt();
                    bankBalance = bankBalance + depositedAmount;
                    System.out.println("Kontostand nach Überweisung: " + bankBalance);
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Wählen Sie den Wert, den Sie an ihr Konto abheben wollen.");
                    int withdrawedAmount = scanner.nextInt();
                    if (bankBalance < withdrawedAmount) {
                        System.out.println("Sie können nicht mehr Geld abheben, als Sie besitzen!");
                        System.out.println("Kontostand nach unerfolgreiche Abhebung: " + bankBalance);
                        System.out.println();
                    } else {
                        bankBalance = bankBalance - withdrawedAmount;
                        System.out.println("Kontostand nach Abhebung: " + bankBalance);
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Jetztigen Kontostand:" + bankBalance);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Sie werden gleich abgemeldet. Auf Wiedersehen!");
                    break;

                default:
                    System.out.println("Wählen Sie eine gültige Funktion aus!");
                    System.out.println();

            }
        }
    }
}
