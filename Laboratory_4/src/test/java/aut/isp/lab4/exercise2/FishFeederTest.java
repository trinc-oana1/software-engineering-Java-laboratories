package aut.isp.lab4.exercise2;
import org.junit.Test;

public class FishFeederTest {
    @Test
    public void testString()
    {
        String expected = "manufacturer = FishLand, model = last year, meals = 10";
        FishFeeder ff2 = new FishFeeder("FishLand", "last year", 10);

    }


}
