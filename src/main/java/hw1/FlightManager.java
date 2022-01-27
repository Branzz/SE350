package hw1;

import java.util.ArrayList;
import java.util.List;

public final class FlightManager {

	private static FlightManager INSTANCE;

	public static FlightManager getInstance() {
		if (INSTANCE == null)
			INSTANCE = new FlightManager();
		return INSTANCE;
	}

	private List<Flight> flights;

	private FlightManager() {
		flights = new ArrayList<>();
	}

	public void createFlight(String type, final Airline airline, final Airport origin, final Airport destination, final String flightNumber) {
		flights.add(FlightFactory.createFlight(type, airline, origin, destination, flightNumber));
	}

	public Flight getFlightByNumber(String flightNumber) {
		return flights.stream()
					  .filter(flight -> flight.getFlightNumber().equals(flightNumber))
					  .findFirst()
					  .orElseThrow();
	}

}
