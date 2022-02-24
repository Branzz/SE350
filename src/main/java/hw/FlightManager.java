package hw;

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
