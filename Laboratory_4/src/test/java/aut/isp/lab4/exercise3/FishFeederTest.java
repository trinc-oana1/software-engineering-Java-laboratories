package aut.isp.lab4.exercise3;
import org.junit.Test;

public class FishFeederTest {
    @Test
    public void testString()
    {
        String expected = "manufacturer = Bosch, model = new, meals = 12";
        FishFeeder ff2 = new FishFeeder("Bosch", "new", 12);

    }
}
