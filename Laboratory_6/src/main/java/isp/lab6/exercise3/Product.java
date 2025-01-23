package isp.lab6.exercise3;

import java.util.Objects;

public class Product {
    public String name;
    public float price;

    public Product(String name, float price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}


    public float getPrice() {return price;}
    public void setPrice(float price) {this.price = price;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o!=null && o instanceof Product)
        {
            Product x=(Product) o;
            if(this.name.equals(x.name))
                return true;
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Name:"+name+" "+price+"RON";
    }
}
