package hw.flight;

import hw.Airline;
import hw.Airport;

public class PassengerFlight extends Flight {

	private int passengerCapacity;

	public PassengerFlight(final Airline airline, final Airport origin, final Airport destination, final int passengerCapacity) {
		super(airline, origin, destination);
		this.passengerCapacity = passengerCapacity;
	}

	@Override
	public String toString() {
		return super.toString() + " with passenger capacity of " + passengerCapacity;
	}

}
