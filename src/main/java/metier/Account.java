package metier;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD

=======
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
>>>>>>> 5cd9aeb4791d00bccbe46e2d977f45527e5c5031
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
=======
	private String number;
	
>>>>>>> 5cd9aeb4791d00bccbe46e2d977f45527e5c5031

	@Column
	private String openningDate;

	public Account() {
	}

<<<<<<< HEAD
	public Account(Integer id, Float balance, String label, String openningDate, Cheque cheque, Card card) {
=======

	public Account(Integer id, Float balance, String number, String openningDate, Cheque cheque, Card card) {
>>>>>>> 5cd9aeb4791d00bccbe46e2d977f45527e5c5031
		this.id = id;
		this.balance = balance;
		this.number = number;
		this.openningDate = openningDate;

	}

<<<<<<< HEAD
=======
	


>>>>>>> 5cd9aeb4791d00bccbe46e2d977f45527e5c5031
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
	
	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}
	
>>>>>>> 5cd9aeb4791d00bccbe46e2d977f45527e5c5031
}
