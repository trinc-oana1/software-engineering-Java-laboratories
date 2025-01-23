package isp.lab5.exercise2;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise2Test {
    @Test
    public void testCharge() {
        Laptop laptop = new Laptop(50);
        SmartPhone phone = new SmartPhone(30);
        SmartWatch watch = new SmartWatch(70);

        laptop.charge(16);
        assertEquals(101, laptop.getBatteryLevel());

        phone.charge(40);
        assertEquals(100, phone.getBatteryLevel());

        watch.charge(50);
        assertEquals(100, watch.getBatteryLevel());
    }
}
