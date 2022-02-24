package hw;

import java.util.HashMap;
import java.util.Map;

public class Airport {

	private static final Map<String, Airport> airportCache = new HashMap<>();

	private final String name;

	private Airport(final String name) {
		this.name = name;
	}

	public static Airport getAirport(final String name) throws NamingException {
		if (name == null || !name.matches("[A-Z]{3}"))
			throw new NamingException("name must consist of 3 alphabetic, capitalized characters");
		return airportCache.computeIfAbsent(name, Airport::new);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Airport " + name;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		final Airport airport = (Airport) o;

		return name.equals(airport.name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}
