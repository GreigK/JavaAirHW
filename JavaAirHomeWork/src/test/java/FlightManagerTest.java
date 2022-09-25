import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember Crew1;
    CabinCrewMember Crew2;
    CabinCrewMember Crew3;
    CabinCrewMember Crew4;
    CabinCrewMember Crew5;
    Plane plane1;
    Plane plane2;
    Plane plane3;
    Passenger firstClass;
    Passenger secondClass;
    Passenger thirdClass;

    FlightManager flightManager;

    @Before
    public void before(){
        pilot = new Pilot("Amelia Earhart", Rank.CAPTAIN, "Pl4NE5");
        Crew1 = new CabinCrewMember("Sam", Rank.FIRST_OFFICER);
        Crew2 = new CabinCrewMember("Bob", Rank.FLIGHT_ATTENDANT);
        Crew3 = new CabinCrewMember("Jim", Rank.FLIGHT_ATTENDANT);
        Crew4 = new CabinCrewMember("Lee", Rank.FLIGHT_ATTENDANT);
        Crew5 = new CabinCrewMember("Stef", Rank.FLIGHT_ATTENDANT);
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.CONCORDE);
        plane3 = new Plane(PlaneType.SR17);
        ArrayList<CabinCrewMember> crewMembers = new ArrayList<>(Arrays.asList(
                Crew1,
                Crew2,
                Crew3,
                Crew4,
                Crew5
        ));
        firstClass = new Passenger("Alex", 2);
        secondClass = new Passenger("Ally", 1);
        thirdClass = new Passenger("John", 0);
        ArrayList<Passenger> passengers = new ArrayList<>((Arrays.asList(
                firstClass,
                secondClass,
                thirdClass
        )));
        flight = new Flight(pilot, crewMembers, passengers, plane1, "123", "GLA", "GER", "1200");
    }

    @Test
    public void canCheckWeightPerPassenger(){
        assertEquals(392.93361884368306, FlightManager.getWeightPerPassenger(flight), 0.0);
    }

//    @Test
//    public void canGetPassengerBagBooked() {
//        flight.getAvailableSeats(plane1);
//        assertEquals(2, FlightManager.getWeightPerPassenger(flight),0.0);
//
//
//    }
}
