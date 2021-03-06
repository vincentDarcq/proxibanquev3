package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe définissant la localisation d'un client. Une localisation se définit
 * par une id, un pays, une ville, un code postal et une adresse.
 * 
 * @author Adminl
 *
 */
@Entity
@Table
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column
	private String country;

	@Column
	private String city;

	@Column
	private String postalCode;

	@Column
	private String address;

	/**
	 * Constructeur d'initialisation par défaut.
	 */
	public Address() {
	}

	/**
	 * Constructeur d'initialisation avec les attributs.
	 * 
	 * @param country
	 * @param city
	 * @param postalCode
	 * @param address
	 */
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
