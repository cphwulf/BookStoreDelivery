package bookstoredelivery;

/**
 *
 * @author thor
 */
public class Library {
	int id;
	String  type;
	String shortName;
	String longName;
	Address address;

	public Library(int id, String type, String shortName, String longName, Address address) {
		this.id = id;
		this.type = type;
		this.shortName = shortName;
		this.longName = longName;
		this.address = address;
	}



	
}
