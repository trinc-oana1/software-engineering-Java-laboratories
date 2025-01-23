package isp.lab5.exercise4;

import java.util.Scanner;

public class PaymentGateway {
    private BankAccount bankAccount;

    private Tickets ticket;

    private UserApp userApp;

    private TicketsManager ticketsManager;

    public PaymentGateway(BankAccount bankAccount, Tickets ticket)
    {
        this.bankAccount = bankAccount;
        this.ticket = ticket;
    }
    public void MakePayment()
    {
        Scanner in = new Scanner(System.in);
        if(bankAccount.getAccountBalance() >= ticket.getPrice() )
        {
            System.out.println("Enter your pin:");
            int pin = Integer.parseInt(in.nextLine());
            if(pin == bankAccount.getPin())
            {   bankAccount.setAccountBalance(bankAccount.getAccountBalance()-ticket.getPrice());
                System.out.println("Thank you for your payment. You can now view your ticket in the User App.");
                System.out.println("Your balance is now: " + bankAccount.getAccountBalance());
            }
            else {
                System.out.println("The pin is not valid");
                System.exit(0);
            }

        }
    }
}
