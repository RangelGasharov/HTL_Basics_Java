package at.rangel.projects.oo.ticketmachine;

import java.util.Scanner;

public class TicketMachine {
    private Controller controller;
    private Printer printer;
    private TicketScanner ticketScanner;
    private Expenditure expenditure;
    private Ticket currentTicket;

    private Scanner scanner;

    public TicketMachine() {
        this.scanner = new Scanner(System.in);
        this.controller = new Controller(1);
        this.printer = new Printer();
        this.ticketScanner = new TicketScanner();
        this.expenditure = new Expenditure();
        this.currentTicket = currentTicket;
    }

    public void run() {
        System.out.println("Welcome to the Ticketbox parking ticket machine!");
        while (true) {
            System.out.println("You can choose from the following functions of the machine:\n");
            System.out.println("1 - Create Ticket, 2 - Insert Ticket, 3 - List all tickets, 4 - Change ticket");
            int selection = this.scanner.nextInt();
            switch (selection) {
                case 1:
                    currentTicket = this.controller.getTicket();
                    break;
                case 2:
                    this.controller.getPrice(currentTicket);
                    break;
                case 3:
                    for (Ticket ticket : controller.getTickets()) {
                        System.out.println(ticket.getTicketId() + " " + ticket.getCreateTimestamp());
                    }
                    break;
                default:
                    System.out.println("Invalid number for a task!");
                    break;
            }
        }
    }
}
