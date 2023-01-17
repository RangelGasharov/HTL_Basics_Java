package at.rangel.projects.oo.ticketmachine;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Ticket> tickets;
    private double pricePerMinute;
    private int currentTicketID;

    public Controller(double pricePerMinute) {
        this.tickets = new ArrayList<>();
        this.pricePerMinute = pricePerMinute;
        this.currentTicketID = currentTicketID;
    }

    public Ticket getTicket() {
        int ticketIdCount = this.tickets.size() + 1;
        Ticket ticket = new Ticket(ticketIdCount);
        LocalDateTime ticketCreateTimeStamp = LocalDateTime.now();
        ticket.setCreateTimestamp(ticketCreateTimeStamp);
        this.tickets.add(ticket);
        return ticket;
    }

    public double getPrice(Ticket ticket) {
        LocalDateTime beginning = ticket.getCreateTimestamp();
        LocalDateTime ending = LocalDateTime.now();
        Duration ticketDuration = Duration.between(beginning, ending);
        double minutes = Math.ceil(ticketDuration.toMinutes());
        double ticketPrice = Math.ceil(minutes * this.pricePerMinute);
        return ticketPrice;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public double getPricePerMinute() {
        return pricePerMinute;
    }

    public void setPricePerMinute(double pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }

    public int getCurrentTicketID() {
        return currentTicketID;
    }

    public void setCurrentTicketID(int currentTicketID) {
        this.currentTicketID = currentTicketID;
    }
}
