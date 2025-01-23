package isp.lab5.exercise1;

public class Adress {
    private String street;
    private String city;
    public Adress(String street, String city)
    {
        this.street = street;
        this.city = city;
    }

    public void setStreet(String street) {this.street = street;}
    public String getStreet() {return street;}

    public void setCity(String city) {this.city = city;}
    public String getCity() {return city;}
    public String toString()
    {
        return "street = " +street+ ", city = " +city;
    }
}

