package at.rangel.projects.basics.scanners;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Caesar_Encryption {
    public static void main(String[] args) {
        System.out.println("Wählen Sie ihre gewünschte Funktion aus: ");
        System.out.println("1 - Verschlüsseln");
        System.out.println("2 - Entschlüsseln");
        System.out.println("3 - Beenden");
        System.out.println();

        boolean isFinished = false;
        Scanner scanner = new Scanner(System.in);
        int selection = 0;

        try {
            selection = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Bitte geben Sie eine gültige Funktion aus!");
            scanner.next();
        }
        int key = 2;

        while (!isFinished) {
            switch (selection) {
                case 1:
                    String text = scanner.nextLine();
                    System.out.println();
                    char[] chars = text.toCharArray();
                    for (char c : chars) {
                        c += key;
                        System.out.print(c);
                    }
                    System.out.println();
                    System.out.println("Geben Sie den Text an den Sie verschlüsseln wollen.");
                    System.out.println();
                    break;

                case 2:
                    text = scanner.nextLine();
                    System.out.println();
                    chars = text.toCharArray();
                    for (char c : chars) {
                        c -= key;
                        System.out.print(c);
                    }
                    System.out.println();
                    System.out.println("Geben Sie den Text an den Sie entschlüsseln wollen.");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Vorgang wird beendet...");
                    isFinished = true;
                    break;
            }
        }
    }
}
