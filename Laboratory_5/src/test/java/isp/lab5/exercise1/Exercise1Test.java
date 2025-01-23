package isp.lab5.exercise1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * @author Radu Miron
 * @version 1
 */
public class Exercise1Test {
    @Test
    public void testProduct() {
        Adress adr = new Adress("Octavian Goga", "Carei");
        Customer customer = new Customer("id2", "Trinc Oana", "0745345609", adr);
        Product products = new Product("A11", "Beauty blender", 90, ProductCategory.BEAUTY, customer);
        assertEquals(90, products.getPrice(), 0.0);
    }

}
