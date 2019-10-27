package bookstoredelivery;

/**
 *
 * @author thor
 */
public class Address {
	int addressId;
	String street;
	String zipCode;
	String postalCity;
	double latitude;
	double longitude;

	public Address(String street, String zipCode, String postalCity, double latitude, double longitude) {
		this.street = street;
		this.zipCode = zipCode;
		this.postalCity = postalCity;
		this.latitude = latitude;
		this.longitude = longitude;
		this.addressId = IdFactory.setAddressID();
	}
	
}
