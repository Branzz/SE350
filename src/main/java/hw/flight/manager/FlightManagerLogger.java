package hw.flight.manager;

import hw.Airline;
import hw.Airport;
import hw.flight.Flight;

public class FlightManagerLogger extends FlightManager {

	private static FlightManagerLogger INSTANCE;

	public static FlightManagerLogger getInstance() {
		if (INSTANCE == null)
			INSTANCE = new FlightManagerLogger();
		return INSTANCE;
	}

	private final FlightManagerImpl flightManager;

	private FlightManagerLogger() {
		flightManager = FlightManagerImpl.getInstance();
	}

	@Override
	public String createFlight(final String type, final Airline airline, final Airport origin, final Airport destination, final int passengerCapacity) {
		System.out.println("A flight is being created.");
		return flightManager.createFlight(type, airline, origin, destination, passengerCapacity);
	}

	@Override
	public Flight getFlightByNumber(final String flightNumber) {
		System.out.println("Flight number: " + flightNumber + " is being retrieved.");
		return flightManager.getFlightByNumber(flightNumber);
	}

}
