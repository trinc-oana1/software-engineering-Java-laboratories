package isp.lab5.exercise4;

public class TicketsManager {
    private Tickets ticket;

    private UserApp userApp;

    public TicketsManager(Tickets ticket, UserApp userApp)
    {
        this.ticket = ticket;
        this.userApp = userApp;
    }

    public Tickets GenerateTicket()
    {
        return ticket;
    }

    public void ValidateTicket()
    {
        if(userApp.getTicket().getId() == 1 || userApp.getTicket().getId() == 2 || userApp.getTicket().getId() == 3 || userApp.getTicket().getId() == 4) System.out.println("The ticket is valid! The check in is done! See you at the event!");
    }
}
