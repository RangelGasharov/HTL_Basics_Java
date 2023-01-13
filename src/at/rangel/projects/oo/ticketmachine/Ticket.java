package at.rangel.projects.oo.ticketmachine;

import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private LocalDateTime timestamp;
    private LocalDateTime paidTimestamp;

    public Ticket(int id, LocalDateTime timestamp, LocalDateTime paidTimeStamp) {
        this.id = id;
        this.timestamp = timestamp;
        this.paidTimestamp = paidTimeStamp;
    }
}
