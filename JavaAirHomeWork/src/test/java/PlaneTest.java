import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;
    Plane plane3;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.CONCORDE);
        plane3 = new Plane(PlaneType.SR17);

    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING747, plane1.getPlaneType());
        assertEquals(PlaneType.CONCORDE, plane2.getPlaneType());
        assertEquals(PlaneType.SR17, plane3.getPlaneType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(467, plane1.getCapacity());
        assertEquals(100, plane2.getCapacity());
        assertEquals(2, plane3.getCapacity());
    }

    @Test
    public void canGetWeightOfPlane(){
        assertEquals(183500, plane1.getWeightOfPlane(), 0.0);
        assertEquals(78700, plane2.getWeightOfPlane(), 0.0);
        assertEquals(170000, plane3.getWeightOfPlane(), 0.0);
    }
}
