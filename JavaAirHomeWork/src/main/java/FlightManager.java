import java.beans.PropertyEditorSupport;

public class FlightManager {

    public static double getWeightPerPassenger(Flight flight){
        return (flight.getPlane().getWeightOfPlane())/flight.getPlane().getCapacity();

    }

    public static double getPassengerBagBooked(Flight flight){
        double result = 0.0;
        for(Passenger passenger : flight.getPassengers()){
            result += (passenger.getNumberOfBags());
        }
        return result;
    }
}
