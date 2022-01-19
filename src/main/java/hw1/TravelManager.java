package hw1;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
public class TravelManager {

	public static void main(String[] args) {
		try {
			Airport originAirport = new Airport("ORD");
			Airport destinationAirport = new Airport("JFK");
			Airline airline = new Airline("United");
			Flight flight = new Flight(airline, originAirport, destinationAirport, UUID.randomUUID().toString(),
									   new Date(2022 - 1900, Calendar.JANUARY, 20, 5, 30, 0));
			System.out.println(flight);
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
