package isp.lab5.exercise3;

import org.junit.Test;

public class Exercise3Test {
    @Test
    public void testStringPS()
    {
        String expected = "pressure = 10";
        PressureSensor ps = new PressureSensor("Outside", "ps1", 10);

    }
    @Test
    public void testStringTS()
    {
        String expected = "temperature = 27";
        TemperatureSensor ts = new TemperatureSensor("Inside", "ts1", 27);

    }
}
