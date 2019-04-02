import ThemePark.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Splash world", 7.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Splash World", park.getName());
    }

    @Test
    public void canGetPrice(){
        assertEquals(7.00, park.getPrice(),0.02);
    }

}
