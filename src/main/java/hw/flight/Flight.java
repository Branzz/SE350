package hw.flight;

import hw.Airline;
import hw.Airport;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public abstract class Flight {

	private String flightNumber;
	private Airline airline;
	private Airport origin;
	private Airport destination;
	private Date departureTime;

	public Flight() {
		this.flightNumber = UUID.randomUUID().toString();
	}

	public Flight(final String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public Flight(final Airline airline, final Airport origin, final Airport destination) {
		this();
		if (airline == null || origin == null || destination == null)
			throw new NullPointerException();
		this.airline = airline;
		this.origin = origin;
		this.destination = destination;
		this.departureTime =  new Date(2022 - 1900, Calendar.JANUARY, 20, 5, 30, 0);
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

	public Date getDepartureTime() {
		return departureTime;
	}

	@Override
	public String toString() {
		return getClass().getName() + " " + flightNumber + " of " + airline + ", from " + origin + " to " + destination + ", leaving at " + departureTime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Flight flight = (Flight) o;
		return Objects.equals(airline, flight.airline)
			   && Objects.equals(origin, flight.origin)
			   && Objects.equals(destination, flight.destination)
			   && Objects.equals(flightNumber, flight.flightNumber)
			   && Objects.equals(departureTime, flight.departureTime);
	}

	@Override
	public int hashCode() {
		int result = airline.hashCode();
		result = 31 * result + origin.hashCode();
		result = 31 * result + destination.hashCode();
		result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
		return result;
	}

}
