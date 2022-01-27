package hw;

public class Airport {

	private String name;

	public Airport(final String name) throws NamingException {
		if (name == null || !name.matches("[A-Z]{3}"))
			throw new NamingException("name must consist of 3 alphabetic, capitalized characters");
		this.name = name;
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
