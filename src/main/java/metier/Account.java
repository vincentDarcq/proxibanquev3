package metier;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
<<<<<<< HEAD
=======

>>>>>>> 932fe31ad0a597a03490beda5d31e9b2adf81290
import javax.persistence.Table;

@Entity
@Table(name="account")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="savings")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column
	private Float balance;

	@Column
<<<<<<< HEAD
	private String label;
	private String number;
	
=======
	private String number;
	

>>>>>>> 932fe31ad0a597a03490beda5d31e9b2adf81290

	@Column
	private String openningDate;
	
	@Column
	private Card card;

	public Account() {
	}

<<<<<<< HEAD

	public Account(Integer id, Float balance, String number, String openningDate, Cheque cheque, Card card) {
=======


	public Account(Integer id, Float balance, String number, String openningDate, Cheque cheque, Card card) {

>>>>>>> 932fe31ad0a597a03490beda5d31e9b2adf81290
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

<<<<<<< HEAD
=======
	
>>>>>>> 932fe31ad0a597a03490beda5d31e9b2adf81290
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
	
	
<<<<<<< HEAD
=======

>>>>>>> 932fe31ad0a597a03490beda5d31e9b2adf81290
}
