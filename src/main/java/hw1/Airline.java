package hw1;

public class Airline {

	private String name;

	public Airline(final String name) throws NamingException {
		if (name == null || name.length() >= 8)
			throw new NamingException("name must be less than 8 characters");
		this.name = name;
	}

	/**
	 * I don't have a specific purpose for this getter in this scope, but it makes sense to have it in general.
	 */
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
