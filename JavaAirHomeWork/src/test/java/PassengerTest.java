import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("bob", 2);
    }

    @Test
    public void canCheckName(){
        assertEquals("bob", passenger.getName());
    }

    @Test
    public void canCheckNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
