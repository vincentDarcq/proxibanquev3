package metier;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
	private String number;
	

	@Column
	private String openningDate;
	
	

	public Account() {
	}


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
	
}
