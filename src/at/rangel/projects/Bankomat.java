package at.rangel.projects;

import java.util.Scanner;

public class Bankomat {
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

            selectionOfTask = scanner.nextInt();

            if (selectionOfTask == 1) {
                System.out.println();
                System.out.println("Wählen Sie den Wert, den Sie an ihr Konto überweisen wollen.");
                int depositedAmount = scanner.nextInt();
                bankBalance = bankBalance + depositedAmount;
                System.out.println("Kontostand nach Überweisung: " + bankBalance);
                System.out.println();
            }
            if (selectionOfTask == 2) {
                System.out.println();
                System.out.println("Wählen Sie den Wert, den Sie an ihr Konto abheben wollen.");
                int withdrawedAmount = 0;
                withdrawedAmount = scanner.nextInt();
                if(bankBalance < withdrawedAmount) {
                    System.out.println("Sie können nicht mehr Geld abheben, als Sie besitzen!");
                    System.out.println();
                } else {bankBalance = bankBalance - withdrawedAmount;
                    System.out.println("Kontostand nach Abhebung: " + bankBalance);
                    System.out.println();}
            }
            if (selectionOfTask == 3) {
                System.out.println();
                System.out.println("Jetztigen Kontostand:" + bankBalance);
                System.out.println();
            }
        }
    }
}