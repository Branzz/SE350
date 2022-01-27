package hw;

public class FlightFactory {

	private FlightFactory() { }

	public static Flight createFlight(String type, final Airline airline, final Airport origin,
									  final Airport destination, final String flightNumber) {
		if (type.equals("CommercialFlight"))
			return new CommercialFlight(airline, origin, destination, flightNumber);
		else
			return null;
	}

}
