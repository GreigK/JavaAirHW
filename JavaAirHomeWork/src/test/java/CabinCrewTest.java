import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Sam", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canCheckName(){
        assertEquals("Sam", cabinCrewMember.getName());
    }

    @Test
    public void canCheckRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canSendMessage(){
        assertEquals("Strap up it might be a bumpy ride", cabinCrewMember.sendMessage());
    }
}
