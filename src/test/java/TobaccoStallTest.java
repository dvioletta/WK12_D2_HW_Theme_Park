import ThemePark.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Old Pipes", "Henry Ford", "Main Street");
    }

    @Test
    public void canGetName(){
        assertEquals("Old Pipes", tobaccoStall.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Henry Ford", tobaccoStall.getOwnerName());
    }

    @Test
    public void canGetLocation(){
        assertEquals("Main Street", tobaccoStall.getParkingSpot());
    }
}
