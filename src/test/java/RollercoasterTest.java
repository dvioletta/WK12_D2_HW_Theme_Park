import ThemePark.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Big Dipper", 6.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Big Dipper", rollercoaster.getName());
    }

    @Test
    public void canGetPrice(){
        assertEquals(6.00, rollercoaster.getPrice(),0.02);
    }
}
