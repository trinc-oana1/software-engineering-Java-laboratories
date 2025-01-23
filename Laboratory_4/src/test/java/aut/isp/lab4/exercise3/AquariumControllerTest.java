package aut.isp.lab4.exercise3;
import org.junit.Test;

public class AquariumControllerTest {
    @Test
    public void testString()
    {
        String expected = "manufacturer= Emerson, model= new, currentTime= 2.30F, feedingTime= 14.50F";
        AquariumController a2 = new AquariumController("Emerson", "new", 2.30F, 14.50F);

    }
}
