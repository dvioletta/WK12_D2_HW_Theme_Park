import ThemePark.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;


    @Before
    public void before(){
       candyFlossStall  = new CandyFlossStall ("Flossy", "Alice Reed", "Candy Lane");
    }

    @Test
    public void canGetName(){
        assertEquals("Flossy", candyFlossStall.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Alice Reed", candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetLocation(){
        assertEquals("Candy Lane", candyFlossStall.getParkingSpot());
    }
}
