package bookstoredelivery;

/**
 *
 * @author thor
 */
public class Library {
	String id;
	String  type;
	String shortName;
	String longName;
	Address address;

	public Library(String id, String type, String shortName, String longName, Address address) {
		this.id = id;
		this.type = type;
		this.shortName = shortName;
		this.longName = longName;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getShortName() {
		return shortName;
	}

	public String getLongName() {
		return longName;
	}

	public Address getAddress() {
		return address;
	}
}
