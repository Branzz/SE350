package hw;

import hw.flight.manager.FlightManager;
import hw.flight.manager.FlightManagerLogger;
public class TravelManager {

	public static void main(String[] args) {
		try {
			String commercialFlightNumber = FlightManagerLogger.getInstance().createFlight("CommercialFlight",
																						   Airline.getAirline("United"),
																						   Airport.getAirport("ORD"),
																						   Airport.getAirport("JFK"),
																						   0);
			String passengerFlightNumber = FlightManagerLogger.getInstance().createFlight("PassengerFlight",
																						  Airline.getAirline("South"),
																						  Airport.getAirport("DEN"),
																						  Airport.getAirport("ORD"),
																						  120);
			System.out.println("Flight Num: " + commercialFlightNumber + ": " + FlightManagerLogger.getInstance().getFlightByNumber(commercialFlightNumber) + '\n' +
							   "Flight Num: " + passengerFlightNumber  + ": " + FlightManagerLogger.getInstance().getFlightByNumber(passengerFlightNumber));
		} catch (NamingException | NullPointerException e) {
			e.printStackTrace();
		}
	}

}
