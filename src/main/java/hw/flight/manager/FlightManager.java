package hw.flight.manager;

import hw.Airline;
import hw.Airport;
import hw.flight.Flight;

public abstract class FlightManager {

	abstract String createFlight(String type, final Airline airline, final Airport origin, final Airport destination, final int passengerCapacity);

	abstract Flight getFlightByNumber(String flightNumber);

}
