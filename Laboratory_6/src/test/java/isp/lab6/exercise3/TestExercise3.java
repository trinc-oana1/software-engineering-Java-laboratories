package isp.lab6.exercise3;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class TestExercise3 {
    OnlineStore storetest=new OnlineStore();

    @Test
    public void TestDisplayAll()
    {
        Assert.assertEquals("[Name:ZARA jeans 200.0RON, Name:ZARA bag 150.0RON, Name:ZARA hoodie 180.0RON, Name:ZARA winter jacket 400.0RON]",storetest.getProducts().toString());
    }

    @Test
    public void testDisplayOrderedByPrice()
    {
        Comparator<Product> sortByPrice = Comparator.comparing(Product::getPrice);
        Assert.assertEquals("[Name:ZARA bag 150.0RON, Name:ZARA hoodie 180.0RON, Name:ZARA jeans 200.0RON, Name:ZARA winter jacket 400.0RON]",storetest.getProductsSorted(sortByPrice).toString());

    }

    @Test
    public void equalsTest()
    {
        User x=new User("oanatrinc","oana1234");
        User y=new User("oana","oana123");
        Assert.assertEquals(false,x.equals(y));
    }

    @Test
    public void equalProduct()
    {
        Product x=new Product("ZARA T-shirt",100);
        Product y=new Product("ZARA boots",300);
        Assert.assertEquals(false,x.equals(y));
    }
}
