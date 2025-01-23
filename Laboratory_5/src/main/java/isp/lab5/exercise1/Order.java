package isp.lab5.exercise1;
import java.time.LocalDateTime;

public class Order {
    private String orderId;
    private LocalDateTime date;
    private Product[] products;


    public Order(String orderId,LocalDateTime date)
    {
        this.orderId = orderId;
        this.date = date;
    }

    public String getOrderId() {return orderId;}
    public LocalDateTime getDate() {return date;}
    public Product[] getProducts() {return products;}
    public String toString()
    {
        return "Id = " +orderId+ ", date = " +date;
    }

}
