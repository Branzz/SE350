package hw;

import java.util.HashMap;
import java.util.Map;

public class Airline {

	private static final Map<String, Airline> airlineCache = new HashMap<>();

	private final String name;

	private Airline(final String name) {
		this.name = name;
	}

	public static Airline getAirline(final String name) throws NamingException {
		if (name == null || name.length() >= 8)
			throw new NamingException("name must be less than 8 characters");
		return airlineCache.computeIfAbsent(name, Airline::new);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Airline " + name;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		final Airline airline = (Airline) o;

		return name.equals(airline.name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}
