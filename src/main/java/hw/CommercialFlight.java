package hw;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class CommercialFlight extends Flight {

	private Airline airline;
	private Airport origin;
	private Airport destination;
	private Date departureTime;

	public CommercialFlight(final Airline airline, final Airport origin, final Airport destination) {
		super();
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
		return "Flight " + flightNumber + " of " + airline + ", from " + origin + " to " + destination + ", leaving at " + departureTime;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		final CommercialFlight commercialFlight = (CommercialFlight) o;

		return Objects.equals(airline, commercialFlight.airline) &&
			   Objects.equals(origin, commercialFlight.origin) &&
			   Objects.equals(destination, commercialFlight.destination) &&
			   Objects.equals(flightNumber, commercialFlight.flightNumber) &&
			   Objects.equals(departureTime, commercialFlight.departureTime);
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
