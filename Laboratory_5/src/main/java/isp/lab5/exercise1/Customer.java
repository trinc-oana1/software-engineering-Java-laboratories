package isp.lab5.exercise1;

public class Customer {
    private String custormerId;
    private String name;
    private String phone;
    private Adress adress;

    public Customer(String custormerId, String name, String phone, Adress adress)
    {
        this.custormerId = custormerId;
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }

    public String toString()
    {
        return "Id = " +custormerId+ ", name = " +name+ ", phone = " +phone+ ", adress = " +adress;
    }

}
