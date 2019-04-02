import ThemePark.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Topping Heaven", "Karen Wippy", "Icy Valley");
    }

    @Test
    public void canGetName(){
        assertEquals("Topping Heaven", iceCreamStall.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Karen Wippy", iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetLocation(){
        assertEquals("Icy Valley", iceCreamStall.getParkingSpot());
    }
}
