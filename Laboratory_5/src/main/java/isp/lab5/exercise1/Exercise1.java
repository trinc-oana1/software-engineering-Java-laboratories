package isp.lab5.exercise1;
import java.time.LocalDateTime;
import static isp.lab5.exercise1.ProductCategory.*;


public class Exercise1 {

    public static void main(String[] args) {

            LocalDateTime now = LocalDateTime.now();
            Adress adr = new Adress("Observatorului", "Cluj");
            Customer cust = new Customer("id1", "David", "0752863109", adr);
            Order ord = new Order("id2", now);
            Product[] products = new Product[10];

            products[0] = new Product ("A01", "Iphone 15", 5000, ELECTRONICS, cust);
            products[1] = new Product ("A02","Macbook", 15000, ELECTRONICS,cust);
            products[2] = new Product ("A03","Dress",200,FASHION,cust);
            products[3] = new Product ("A04","Lamp", 100, HOME_AND_GARDEN,cust);
            products[4] = new Product ("A05","Samsung SmartTV", 3500, ELECTRONICS,cust);
            products[5] = new Product ("A06","Lip liner", 50, BEAUTY,cust);
            products[6] = new Product ("A07","Mascara", 50, BEAUTY,cust);
            products[7] = new Product ("A08","Coloring book", 20, TOYS,cust);
            products[8] = new Product ("A09","Washing machine", 2000, HOME_AND_GARDEN,cust);
            products[9] = new Product ("A10","Football ball", 200, TOYS,cust);

            System.out.println(adr);
            System.out.println(cust);
            System.out.println(ord);
            //System.out.println(products);
        }

    }

