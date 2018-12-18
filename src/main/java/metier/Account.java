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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7
import javax.persistence.Table;

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

<<<<<<< HEAD

	//private String label;
	private String number;
	



	@Column
	private String openningDate;
	
	//@Column
	//private Card card;
=======
	@Column
	private String number;

	@Column
	private String openningDate;

	@OneToOne
	@JoinColumn(name = "card_id", referencedColumnName = "id")
	private Card card;
>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7

	@OneToOne
	@JoinColumn(name = "check_id", referencedColumnName = "id")
	private Cheque check;

	public Account() {
	}

<<<<<<< HEAD



/**	public Account(Integer id, Float balance, String number, String openningDate, Cheque cheque, Card card) {


		this.id = id;
		this.balance = balance;
		this.number = number;
		this.openningDate = openningDate;
	}**/
	
	

	public Account(Integer id, Float balance, String label, String number, String openningDate) {
=======
	public Account(Integer id, Float balance, String number, String openningDate, Cheque cheque, Card card) {

>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7
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
>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

<<<<<<< HEAD
/**
=======
>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7
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
	
<<<<<<< HEAD
**/
=======
	

>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7
}
