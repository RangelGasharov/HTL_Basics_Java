package at.rangel.projects.oo.ticketmachine;

import java.time.LocalDateTime;

public class Ticket {
    private int ticketId;
    private LocalDateTime createTimestamp;
    private LocalDateTime paidTimestamp;

    public Ticket(int ticketId) {
        this.ticketId = ticketId;
        this.createTimestamp = null;
        this.paidTimestamp = null;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public LocalDateTime getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(LocalDateTime createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public LocalDateTime getPaidTimestamp() {
        return paidTimestamp;
    }

    public void setPaidTimestamp(LocalDateTime paidTimestamp) {
        this.paidTimestamp = paidTimestamp;
    }
}
