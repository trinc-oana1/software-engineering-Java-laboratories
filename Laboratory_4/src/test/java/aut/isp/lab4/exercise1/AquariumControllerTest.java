package aut.isp.lab4.exercise1;

import org.junit.Test;

public class AquariumControllerTest {

    @Test
    public void testString()
    {
        String expected = "manufacturer= FishWorld, model= last year, currentTime= 13.0";
        AquariumController a2 = new AquariumController("FishWorld", "last year", 13);

    }


    //implement minimal tests
}
