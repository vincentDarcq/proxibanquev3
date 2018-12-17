package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column
	private Float balance;
	
	@Column
	private String label;
	
	@Column
	private String openningDate;
	
	@OneToOne
	@JoinColumn(name = "check_id", referencedColumnName = "id")
	private Check check;
	
	@OneToOne
	@JoinColumn(name = "card_id", referencedColumnName = "id")
	private Card card;
	
	

	public Account(Integer id, Float balance, String label, String openningDate, Check check, Card card) {
		this.id = id;
		this.balance = balance;
		this.label = label;
		this.openningDate = openningDate;
		this.check = check;
		this.card = card;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getOpenningDate() {
		return openningDate;
	}

	public void setOpenningDate(String openningDate) {
		this.openningDate = openningDate;
	}

	public Check getCheck() {
		return check;
	}

	public void setCheck(Check check) {
		this.check = check;
	}

	
}