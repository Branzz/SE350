package hw.flight.manager;

import hw.Airline;
import hw.Airport;
import hw.flight.Flight;
import hw.flight.FlightFactory;

import java.util.ArrayList;
import java.util.List;

public class FlightManagerImpl extends FlightManager {

	private static FlightManagerImpl INSTANCE;

	public static FlightManagerImpl getInstance() {
		if (INSTANCE == null)
			INSTANCE = new FlightManagerImpl();
		return INSTANCE;
	}

	private List<Flight> flights;

	private FlightManagerImpl() {
		flights = new ArrayList<>();
	}

	/**
	 * @return created flight's flight number, null if flight is null
	 */
	public String createFlight(String type, final Airline airline, final Airport origin, final Airport destination, final int passengerCapacity) {
		final Flight flight = FlightFactory.createFlight(type, airline, origin, destination, passengerCapacity);
		if (flight == null)
			return null;
		flights.add(flight);
		return flight.getFlightNumber();
	}

	public Flight getFlightByNumber(String flightNumber) {
		return flights.stream()
					  .filter(flight -> flight.getFlightNumber().equals(flightNumber))
					  .findFirst()
					  .orElseThrow();
	}

}
