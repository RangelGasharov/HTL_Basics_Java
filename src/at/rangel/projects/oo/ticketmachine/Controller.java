package at.rangel.projects.oo.ticketmachine;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Ticket> tickets;
    private double pricePerMinute;
    private int currentTicketID;

    public Controller(List tickets, double pricePerMinute, int currentTicketID) {
        this.tickets = new ArrayList<>();
        this.pricePerMinute = pricePerMinute;
        this.currentTicketID = currentTicketID;
    }

    public void getTicket() {

    }
}
