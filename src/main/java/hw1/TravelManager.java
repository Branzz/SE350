package hw1;

import java.util.UUID;

public class TravelManager {

	public static void main(String[] args) {
		try {
			String flightNumber = UUID.randomUUID().toString();
			FlightManager.getInstance().createFlight("CommercialFlight", new Airline("United"), new Airport("ORD"), new Airport("JFK"), flightNumber);
			System.out.println("Flight Num: " + flightNumber + "\n" + FlightManager.getInstance().getFlightByNumber(flightNumber));
		} catch (NamingException | NullPointerException e) {
			e.printStackTrace();
		}
	}

}
