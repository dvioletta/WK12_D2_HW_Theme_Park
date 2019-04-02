import ThemePark.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class PlaygroundTest {

    Playground playground;


    @Before
    public void before() {
       playground = new Playground("Dragon's Den", 5.00);
    }


        @Test
        public void canGetName () {
            assertEquals("Dragon's Den", playground.getName());
        }

        @Test
        public void canCheckPrice () {
            assertEquals(5.00, playground.getPrice(), 0.02);
        }

}