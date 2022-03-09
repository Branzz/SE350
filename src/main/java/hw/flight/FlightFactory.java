package hw.flight;

import hw.Airline;
import hw.Airport;
public class FlightFactory {

	private FlightFactory() { }

	public static Flight createFlight(final String type, final Airline airline, final Airport origin,
									  final Airport destination, final int passengerCapacity) {
		if (type.equals("CommercialFlight"))
			return new CommercialFlight(airline, origin, destination);
		else if (type.equals("PassengerFlight"))
			return new PassengerFlight(airline, origin, destination, passengerCapacity);
		else
			return null;
	}

}
