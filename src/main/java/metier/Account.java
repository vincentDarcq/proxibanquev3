package metier;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import javax.persistence.Table;

/**
 * Classe définissant le compte d'un client. Un compte a en aatribut un id, un
 * montant(balance), un numéro et une date d'ouverture. Un compte peut avoir une
 * carte et un chèque.
 * 
 * @author Adminl
 *
 */
@Entity
@Table(name = "account")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "savings")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column
	private Float balance;

	@Column
	private String number;

	@Column
	private String openningDate;

	@OneToOne
	@JoinColumn(name = "card_id", referencedColumnName = "id")
	private Card card;

	@OneToOne
	@JoinColumn(name = "check_id", referencedColumnName = "id")
	private Cheque check;

	/**
	 * Constructeur d'initialisation par défaut.
	 */
	public Account() {
	}

	/**Constructeur d'initialisation avec les attributs.
	 * @param id
	 * @param balance
	 * @param number
	 * @param openningDate
	 * @param cheque
	 * @param card
	 */
	public Account(Integer id, Float balance, String number, String openningDate, Cheque cheque, Card card) {

		this.id = id;
		this.balance = balance;
		this.number = number;
		this.openningDate = openningDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public String getOpenningDate() {
		return openningDate;
	}

	public void setOpenningDate(String openningDate) {
		this.openningDate = openningDate;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Cheque getCheck() {
		return check;
	}

	public void setCheck(Cheque check) {
		this.check = check;
	}

}
