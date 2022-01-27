package hw1;

public class TravelManager {

	public static void main(String[] args) {
		try {
			Airport originAirport = new Airport("ORD");
			Airport destinationAirport = new Airport("JFK");
			Airline airline = new Airline("United");
			Flight flight = new Flight(airline, originAirport, destinationAirport);
			System.out.println(flight);
		} catch (NamingException | NullPointerException e) {
			e.printStackTrace();
		}
	}

}
