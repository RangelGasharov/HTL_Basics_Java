package at.rangel.projects.oo.ticketmachine;

import java.util.Scanner;

public class TicketMachine {
    private Scanner scanner;

    public TicketMachine() {
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Welcome to the Ticketbox parking ticket machine!");
        while (true) {
            System.out.println("");
            int selection = this.scanner.nextInt();
            switch (selection) {
                default:
                    System.out.println("Invalid number for a task!");
                    break;
            }
        }
    }
}
