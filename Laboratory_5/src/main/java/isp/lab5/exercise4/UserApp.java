package isp.lab5.exercise4;

public class UserApp implements App{
    private User user;

    private String password;

    private Tickets ticket;

    public UserApp(User user, String password, Tickets ticket)
    {
        this.user = user;
        this.password = password;
        this.ticket = ticket;
    }

    public void buyTicket()
    {
        System.out.println("Thank you for your interest in this event. The payment is done by online bank account. You will be transfered to the UPay page!");
    }

    public void viewTicket()
    {
        System.out.println(ticket.toString());
    }

    public Tickets getTicket()
    {
        return ticket;
    }

    public String display()
    {
        return "-----------------Welcome----------------\n" + "Option list:\n" + "1-Buy ticket\n" + "2-View ticket\n";
    }
}
