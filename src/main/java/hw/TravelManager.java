package hw;

public class TravelManager {

	public static void main(String[] args) {
		try {
			String commercialFlightNumber = FlightManager.getInstance().createFlight("CommercialFlight", Airline.getAirline("United"),
																					 Airport.getAirport("ORD"), Airport.getAirport("JFK"), 0);
			String passengerFlightNumber = FlightManager.getInstance().createFlight("PassengerFlight", null, null, null, 120);
			System.out.println("Flight Num: " + commercialFlightNumber + "\n" + FlightManager.getInstance().getFlightByNumber(commercialFlightNumber) + '\n' +
							   "Flight Num: " + passengerFlightNumber  + "\n" + FlightManager.getInstance().getFlightByNumber(passengerFlightNumber));
		} catch (NamingException | NullPointerException e) {
			e.printStackTrace();
		}
	}

}
