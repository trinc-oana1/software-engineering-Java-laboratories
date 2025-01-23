package isp.lab3.ex1;
import isp.lab3.exercise1.Tree;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TreeTest {
    @Test
    public void testGrow(){
        Tree t1 = new Tree();
        assertEquals(15,t1.getHeight());
        t1.grow(3);
        assertEquals(18, t1.getHeight());
    }
}
