package isp.lab3.ex3;
import isp.lab3.exercise3.Vehicle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class VehicleTest {

    @Test
    public void testString()
    {
        String expected = "Audi (A3) speed 250 fuel type D ";
        Vehicle v3 = new Vehicle("Audi", "A3", 250, 'D');
    }
}
