
package isp.lab3.exercise1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TreeTest {
    
    @Test
    public void testGrow(){
        Tree a1 = new Tree();
        assertEquals(15, a1.getHight());
        a1.grow(5);
        assertEquals(20, a1.getHight());
    }
    @Test
    public void TestToString()
    {Tree a1=new Tree();
    assertEquals("Tree{height=15}", a1.toString());
    }
}
    

