package hw1;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Flight {

	private Airline airline;
	private Airport origin;
	private Airport destination;
	private String flightNumber;
	private Date departureTime;

	public Flight(final Airline airline, final Airport origin, final Airport destination, final String flightNumber, final Date departureTime) {
		if (airline == null || origin == null || destination == null)
			throw new NullPointerException();
		this.airline = airline;
		this.origin = origin;
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.departureTime = departureTime;
	}

	public Flight(final Airline airline, final Airport origin, final Airport destination) {
		this(airline, origin, destination, UUID.randomUUID().toString(),
			 new Date(2022 - 1900, Calendar.JANUARY, 20, 5, 30, 0));
	}

	public Airline getAirline() {
		return airline;
	}

	public Airport getOrigin() {
		return origin;
	}

	public Airport getDestination() {
		return destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	@Override
	public String toString() {
		return "Flight " + flightNumber + " of " + airline + ", from " + origin + " to " + destination + ", leaving at " + departureTime;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		final Flight flight = (Flight) o;

		return Objects.equals(airline, flight.airline) &&
			   Objects.equals(origin, flight.origin) &&
			   Objects.equals(destination, flight.destination) &&
			   Objects.equals(flightNumber, flight.flightNumber) &&
			   Objects.equals(departureTime, flight.departureTime);
	}

	@Override
	public int hashCode() {
		int result = airline != null ? airline.hashCode() : 0;
		result = 31 * result + (origin != null ? origin.hashCode() : 0);
		result = 31 * result + (destination != null ? destination.hashCode() : 0);
		result = 31 * result + (flightNumber != null ? flightNumber.hashCode() : 0);
		result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
		return result;
	}

}
