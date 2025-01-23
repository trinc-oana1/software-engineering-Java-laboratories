package isp.lab3.ex4;
import isp.lab3.exercise4.MyPoint;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyPointTest {
    @Test
    public void testDistance()
    {
        double expected = 5.196152422706632;
        MyPoint p3 = new MyPoint(1,2,3);
        MyPoint p4 = new MyPoint(4, 5, 6);
        assertEquals(10.392304845413264,p3.distance(7,8,9),0.01);
        assertEquals(5.196152422706632,p3.distance(p4), 0.01);



    }

}
