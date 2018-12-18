package metier;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe représentant une carte bancaire. Elle prend en paramètres une id, une
 * date d'expiration, un numéro de carte et un type.
 * 
 * @author Adminl
 *
 */
@Entity
@Table
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column
	private LocalDate expirationDate;

	@Column
	private String cardNumber;

	@Column
	private String type;

	/**
	 * Constructeur d'initilisation par défaut.
	 */
	public Card() {
	}

	/**Constructeur d'initialisation avec attributs.
	 * @param id
	 * @param expirationDate
	 * @param cardNumber
	 * @param type
	 */
	public Card(Integer id, LocalDate expirationDate, String cardNumber, String type) {
		this.id = id;
		this.expirationDate = expirationDate;
		this.cardNumber = cardNumber;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
