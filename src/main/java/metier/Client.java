package metier;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Classe représentant un client. Elle a en attributs un id, un numéro de
 * client, un nom, un prénom et une adresse. Un client peut avoir plusieurs
 * comptes et une carte par compte.
 * 
 * @author Adminl
 *
 */
@Entity
@Table
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column
	private String clientNumber;

	@Column
	private String lastname;

	@Column
	private String firstname;

	@Column
	private String birthDate;

	@Column
	private String address;

	@OneToMany
	@JoinColumn(name = "accounds_id", referencedColumnName = "id")
	private List<Account> accounts;

	@OneToOne
	@JoinColumn(name = "card_id", referencedColumnName = "id")
	private Card card;

	/**
	 * Constructeur d'initialisation par défaut
	 * 
	 */
	public Client() {
		super();
	}

	/**
	 * Constructeur d'initialisation avec attributs.
	 * 
	 * @param id
	 * @param clientNumber
	 * @param lastname
	 * @param firstname
	 * @param birthDate
	 * @param address
	 * @param accounts
	 * @param card
	 */
	public Client(Integer id, String clientNumber, String lastname, String firstname, String birthDate, String address,
			List<Account> accounts, Card card) {
		super();
		this.id = id;
		this.clientNumber = clientNumber;
		this.lastname = lastname;
		this.firstname = firstname;
		this.birthDate = birthDate;
		this.address = address;
		this.accounts = accounts;
		this.card = card;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	/**
	 * Cette méthode retourne le compte en fonction de l'id donnée en paramètre.
	 * 
	 * @param searchId
	 * @return
	 */
	public Account getAccountById(Integer searchId) {
		Account result = null;
		for (Account a : this.accounts) {
			if (a.getId().equals(searchId)) {
				result = a;
				break;
			}
		}
		return result;
	}

}
