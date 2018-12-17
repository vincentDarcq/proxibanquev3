package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Address {

	@Column
	private String country;
	
	@Column
	private String city;
	
	@Column
	private String postalCode;
	
	@Column
	private String address;
	
	

	public Address() {
	}

	public Address(String country, String city, String postalCode, String address) {
		this.country = country;
		this.city = city;
		this.postalCode = postalCode;
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
