import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(18, 190, 30.50);
    }

    @Test
    public void canGetAge(){
        assertEquals(18, visitor.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(190, visitor.getHeight(), 0.02);
    }

    @Test
    public void canGetMoney(){
        assertEquals(30.50, visitor.getMoney(), 0.03);
    }
}
