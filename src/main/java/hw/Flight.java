package hw;

import java.util.UUID;

public class Flight {

	protected String flightNumber;

	public Flight() {
		this.flightNumber = UUID.randomUUID().toString();
	}

	public Flight(final String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

}
