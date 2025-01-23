package isp.lab5.exercise4;

public class BankAccount {
    private String bankAccountId;
    private int accountBalance;
    private int pin;

    public BankAccount(String bankAccountId,int accountBalance, int pin)
    {
        this.bankAccountId = bankAccountId;
        this.accountBalance = accountBalance;
        this.pin = pin;
    }

    public void setBankAccountId(String bankAccountId)
    {
        this.bankAccountId = bankAccountId;
    }

    public String getBankAccountId()
    {
        return bankAccountId;
    }

    public void setAccountBalance(int accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    public int getAccountBalance()
    {
        return accountBalance;
    }

    public void setPin(int pin)
    {
        this.pin = pin;
    }

    public int getPin()
    {
        return pin;
    }
}
