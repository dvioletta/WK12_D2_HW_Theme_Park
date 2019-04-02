import ThemePark.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class DodgemsTest {
    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Harry Crash",4.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Harry Crash", dodgems.getName());
    }

   @Test
    public void canGetPrice(){
        assertEquals(4.50, dodgems.getPrice(),0.02);
   }

}
