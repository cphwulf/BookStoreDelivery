package bookstoredelivery;
import  Util.IdFactory;

/**
 *
 * @author thor
 */
public class Address {
	private int addressId;
	private String street;
	private String zipCode;
	private String postalCity;
	private double latitude;
	private double longitude;

	public Address(String street, String zipCode, String postalCity, double latitude, double longitude) {
		this.street = street;
		this.zipCode = zipCode;
		this.postalCity = postalCity;
		this.latitude = latitude;
		this.longitude = longitude;
		this.addressId = IdFactory.getAddressId();
	}

	public int getAddressId() {
		return addressId;
	}

	public String getStreet() {
		return street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getPostalCity() {
		return postalCity;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
	
}
