import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;



    public Flight(Pilot pilot, ArrayList<CabinCrewMember> crewMembers, ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.crewMembers = crewMembers;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCrewMembers() {
        return crewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getCrewCount() {
        return crewMembers.size();
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public int getAvailableSeats() {
        return plane.getCapacity() - getPassengerCount();
    }

//    public String canBookPassengerASeat(){
//        if(getAvailableSeats() <= 0){
//            return "No";
//        } else {
//            return "Booking Complete";
//        }
//    }

//    public void bookPassenger( Plane plane, ArrayList<Passenger> passengers, Passenger passenger){
//        if(getAvailableSeats() >= 1){
//            getPassengers.add(passenger);
//        }
//    }

//    private ArrayList<Integer> buildSeatNumber(){
//        ArrayList<Integer> result = new ArrayList<>();
//        for(int i = 1; i<=plane.getCapacity(); i++){
//            result.add(i);
//        }
//        return result;
//    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public int getAvailableSeats(Plane plane) {
        int capacity = plane.getCapacity();
        int passengers = getPassengerCount();
        int available = capacity - passengers;
        return available;
    }

}
