import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Amelia Earhart", Rank.CAPTAIN, "Pl4NE5");
    }

    @Test
    public void canCheckName(){
        assertEquals("Amelia Earhart", pilot.getName());
    }

    @Test
    public void canCheckRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canCheckLicenceNumber(){
        assertEquals("Pl4NE5", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("We haven't crashed yet!", pilot.flyPlane());
    }
}
