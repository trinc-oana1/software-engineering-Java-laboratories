package isp.lab5.exercise4;

public class OrganizerApp {
    private Organizer organizer;
    private UserApp userApp;
    private TicketsManager ticketsManager;

    public OrganizerApp(Organizer organizer, UserApp userApp, TicketsManager ticketsManager)
    {
        this.organizer = organizer;
        this.userApp = userApp;
        this.ticketsManager = ticketsManager;
    }

    public void CheckIn()
    {
        System.out.println("Welcome to check in!");
        ticketsManager.ValidateTicket();
    }

    public String display()
    {
        return "We will now connect you with our organiser for check in!\n";
    }
}
