package isp.lab5.exercise4;

public class User {
    private String name;
    private String userId;
    private String phone;
    private BankAccount bankAccount;

    public User(String userId, String name, String phone, BankAccount bankAccount)
    {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.bankAccount = bankAccount;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setBankAccount(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
    }
    public BankAccount getBankAccount()
    {
        return bankAccount;
    }

    public String toString()
    {
        return "Your account details are: Name- " + getName() + ", phone - " + getPhone() + ", User id- " + getUserId() + ",bank account- " + getBankAccount();
    }
}
